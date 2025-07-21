#imports
from rest_framework import viewsets, status
from rest_framework.response import Response
from rest_framework.decorators import action
from django.utils.timezone import now
from .models import FlashcardSet, Flashcard, StudyTelemetry, FlashcardSetRating, PlatformSettings
from .serializers import (
    FlashcardSetSerializer,
    FlashcardSerializer,
    StudyTelemetrySerializer,
    FlashcardSetRatingSerializer,
    UserSerializer,
)
from django.shortcuts import render, redirect, get_object_or_404
from django.views.decorators.csrf import csrf_protect, csrf_exempt
from django.contrib.auth.decorators import login_required
from django.contrib.auth.forms import UserCreationForm
from django.contrib.auth import login
from .forms import FlashcardForm
from django.contrib import messages
import requests
from django.conf import settings
from rest_framework.views import APIView
from django.contrib.auth.models import User
from rest_framework.authtoken.models import Token
from rest_framework.permissions import IsAuthenticatedOrReadOnly, IsAuthenticated
from rest_framework.authentication import TokenAuthentication
from rest_framework.decorators import api_view, permission_classes
from django.utils.timezone import now
from django.http import JsonResponse

#API view to return all flashcards in a set
@api_view(['GET'])
def flashcards_by_set(request, set_id):
    flashcards = Flashcard.objects.filter(flashcard_set_id=set_id)
    serializer = FlashcardSerializer(flashcards, many=True)
    return Response(serializer.data)

#URL for internal API calls
API_BASE_URL = "http://127.0.0.1:8000/app/api"

#viewset for managing flashcards
class FlashcardSetViewSet(viewsets.ModelViewSet):
    queryset = FlashcardSet.objects.all().order_by('-average_rating', '-created_at')  
    serializer_class = FlashcardSetSerializer
    authentication_classes = [TokenAuthentication]
    permission_classes = [IsAuthenticatedOrReadOnly]

    #enforces daily creation limit
    def create(self, request, *args, **kwargs):
        user = request.user
        today = now().date()

        #gets platform settings or uses defaults limits
        settings = PlatformSettings.objects.first()
        daily_limit = settings.daily_flashcard_set_limit if settings else 20
        created_today = FlashcardSet.objects.filter(owner=user, created_at__date=today).count()

        #enforces the daily limit
        if user and created_today >= daily_limit:
            return Response(
                {"error": f"Daily limit of {daily_limit} flashcard sets reached."},
                status=status.HTTP_403_FORBIDDEN,
            )

        #validates and saves a new flashcard set
        serializer = self.get_serializer(data=request.data)
        if not serializer.is_valid():
            print("Validation errors:", serializer.errors)  
            return Response(serializer.errors, status=status.HTTP_400_BAD_REQUEST)

        self.perform_create(serializer)
        headers = self.get_success_headers(serializer.data)
        return Response(serializer.data, status=status.HTTP_201_CREATED, headers=headers)

    #saves with the current user as the owner
    def perform_create(self, serializer):
        serializer.save(owner=self.request.user)

    #unhides all flashcards for the user
    @action(detail=False, methods=['post'])
    def unhide_all(self, request):
        user = request.user
        user.hidden_flashcards.clear()
        return Response({'status': 'all cards unhidden'})

#viewset for managing the ratings of flashcard sets
class FlashcardSetRatingViewSet(viewsets.ModelViewSet):
    queryset = FlashcardSetRating.objects.all()
    serializer_class = FlashcardSetRatingSerializer
    
    #only returns ratings by the current user
    def get_queryset(self):
        return FlashcardSetRating.objects.filter(user=self.request.user)

    #creates or updates a rating
    def create(self, request, *args, **kwargs):
        user = request.user
        flashcard_set_id = request.data.get('flashcard_set')
        rating_value = request.data.get('rating')

        #validates input
        if not flashcard_set_id or rating_value is None:
            return Response(
                {'error': 'flashcard_set and rating fields are required.'},
                status=status.HTTP_400_BAD_REQUEST,
            )

        #updates or creates the rating
        rating_obj, created = FlashcardSetRating.objects.update_or_create(
            user=user,
            flashcard_set_id=flashcard_set_id,
            defaults={'rating': rating_value},
        )

        #updates the flashcard set's average rating
        rating_obj.flashcard_set.update_rating()

        serializer = self.get_serializer(rating_obj)
        return Response(
            serializer.data,
            status=status.HTTP_201_CREATED if created else status.HTTP_200_OK,
        )
  
#viewset for the users registration and listing
class UserViewSet(viewsets.ModelViewSet):
    queryset = User.objects.all()
    serializer_class = UserSerializer

#viewset for managing flashcards
class FlashcardViewSet(viewsets.ModelViewSet):
    queryset = Flashcard.objects.all()
    serializer_class = FlashcardSerializer

    #excludes hidden flashcards for authenticated users
    def get_queryset(self):
        user = self.request.user
        qs = super().get_queryset()
        if user.is_authenticated:
            
            qs = qs.exclude(hidden_by_users=user)
        return qs

#viewset for tracking study telemetry
class StudyTelemetryViewSet(viewsets.ModelViewSet):
    queryset = StudyTelemetry.objects.all()
    serializer_class = StudyTelemetrySerializer

#combined view for the flashcardset operations (GET, POST, hide/unhide)
@api_view(['GET', 'POST'])
@permission_classes([IsAuthenticatedOrReadOnly])
def flashcards_by_set_combined(request, set_id):
    if request.method == 'GET':
        #retrieves flashcards, excluding hidden ones for authenticated users
        flashcards = Flashcard.objects.filter(flashcard_set_id=set_id)
        if request.user.is_authenticated:
            flashcards = flashcards.exclude(hidden_by_users=request.user)
        serializer = FlashcardSerializer(flashcards, many=True)
        return Response(serializer.data)

    if request.method == 'POST':
        card_id = request.data.get('card_id')
        if card_id and request.data.get('action') == 'hide':
            #hides the flashcard
            try:
                flashcard = Flashcard.objects.get(id=card_id, flashcard_set_id=set_id)
                flashcard.hidden_by_users.add(request.user)
                return Response({'status': 'card hidden'})
            except Flashcard.DoesNotExist:
                return Response({'error': 'Card not found'}, status=404)

        if card_id and request.data.get('action') == 'unhide':
            #unhides the flashcard
            try:
                flashcard = Flashcard.objects.get(id=card_id, flashcard_set_id=set_id)
                flashcard.hidden_by_users.remove(request.user)
                return Response({'status': 'card unhidden'})
            except Flashcard.DoesNotExist:
                return Response({'error': 'Card not found'}, status=404)

        #creates a new flashcard in the set
        try:
            flashcard_set = FlashcardSet.objects.get(id=set_id, owner=request.user)
        except FlashcardSet.DoesNotExist:
            return Response({'error': 'Flashcard set not found or not owned by user.'}, status=404)

        serializer = FlashcardSerializer(data=request.data)
        if serializer.is_valid():
            serializer.save(flashcard_set=flashcard_set)
            return Response(serializer.data, status=201)
        return Response(serializer.errors, status=400)

#protects agains CSRF attacks and requires users to be logged in
@csrf_protect
@login_required
def home(request):
    #handles the rating submission via POST
    if request.method == 'POST':
        set_id = request.POST.get('set_id')
        rating = request.POST.get('rating')
        user = request.user

        #validates input
        if not (set_id and rating):
            messages.error(request, "Invalid rating input.")
            return redirect('home')

        try:
            rating_value = int(rating)
            #ensures the rating is within a valid range
            if not 1 <= rating_value <= 5:
                raise ValueError("Rating out of range")
        except ValueError:
            messages.error(request, "Rating must be between 1 and 5.")
            return redirect('home')
        
        #gets the flashcard set and updates or creates rating
        flashcard_set = get_object_or_404(FlashcardSet, id=set_id)
        rating_obj, created = FlashcardSetRating.objects.update_or_create(
            user=user,
            flashcard_set=flashcard_set,
            defaults={'rating': rating_value}
        )

        #recalculates average rating
        flashcard_set.update_rating()
        messages.success(request, "Rating submitted successfully.")
        return redirect('home')
    
    #fetches flashcard set from API
    response = requests.get(f"{API_BASE_URL}/sets")
    flashcard_sets = []

    if response.status_code == 200:
        sets = response.json()
        for s in sets:
            flashcard_sets.append({
                "id": s.get("id"),
                "title": s.get("title") or s.get("name") or "Untitled",
                "average_rating": s.get("average_rating", "N/A"),
                "owner": {"username": s.get("owner", {}).get("username", "API User")}
            })
    else:
        print("API error:", response.status_code, response.text)

    #renders home page with flashcard sets
    return render(request, 'flashcards/home.html', {'flashcard_sets': flashcard_sets})

#user signup view
def signup(request):
    if request.method == 'POST':
        form = UserCreationForm(request.POST)
        if form.is_valid():
            data = {
                "username": form.cleaned_data['username'],
                "password": form.cleaned_data['password1']
            }
            #sends signup request to API
            response = requests.post(f"{API_BASE_URL}/users/", json=data)
            if response.status_code == 201:
                messages.success(request, "Account created successfully.")
                return redirect('home')
            else:
                try:
                    error_message = response.json().get('message', 'Unknown error')
                except ValueError:
                    error_message = response.text or 'Unknown error'
                messages.error(request, f"Signup failed: {error_message}")
    else:
        form = UserCreationForm()
    return render(request, 'registration/signup.html', {'form': form})

#view to study a specific flashcard set
@login_required
def study_set(request, set_id):
    set_response = requests.get(f"{API_BASE_URL}/sets/{set_id}")
    #fetches set details
    if set_response.status_code != 200:
        messages.error(request, "Flashcard set not found.")
        return redirect('home')
    set_data = set_response.json()
    #fetches flashcards in the set
    flashcards_response = requests.get(f"{API_BASE_URL}/sets/{set_id}/cards")
    flashcards = flashcards_response.json() if flashcards_response.status_code == 200 else []

    return render(request, 'flashcards/study.html', {
        'flashcard_set': set_data,
        'flashcards': flashcards,
    })

#view to create a new flashcard set
@login_required
def create_set(request):
    if request.method == 'POST':
        title = request.POST.get('title')
        description = request.POST.get('description', '')

        if not title:
            messages.error(request, "Title is required.")
            return render(request, 'flashcards/create_set.html')

        #gets user's token for authentication
        token, _ = Token.objects.get_or_create(user=request.user)

        payload = {
            "title": title,
            "description": description
        }

        headers = {
            "Content-Type": "application/json",
            "Authorization": f"Token {token.key}",
        }

        #sends request to create set via API
        response = requests.post(f"{API_BASE_URL}/sets/", json=payload, headers=headers)

        if response.status_code == 201:
            try:
                new_set = response.json()
                set_id = new_set.get('id')
                if set_id:
                    return redirect('create_card', set_id=set_id)
                else:
                    messages.error(request, "Set created but no ID returned.")
            except Exception as e:
                messages.error(request, f"Error parsing response: {e}")
        elif response.status_code == 429:
            messages.error(request, "Daily limit of 20 flashcard sets reached.")
        else:
            messages.error(request, f"Failed to create set: {response.text}")

    return render(request, 'flashcards/create_set.html')


#view to create a flashcard in a specific set
@login_required
def create_card(request, set_id):
    flashcard_set = get_object_or_404(FlashcardSet, id=set_id, owner=request.user)

    if request.method == 'POST':
        question = request.POST.get('question')
        answer = request.POST.get('answer')

        if not question or not answer:
            messages.error(request, "Both question and answer are required.")
            return render(request, 'flashcards/create_card.html', {'flashcard_set': flashcard_set})

       #gets user's token for authentication
        token, _ = Token.objects.get_or_create(user=request.user)

       
        payload = {
            "question": question,
            "answer": answer
        }
        headers = {
            "Content-Type": "application/json",
            "Authorization": f"Token {token.key}"
        }

        #sends request to create flashcard via API
        response = requests.post(f"{API_BASE_URL}/sets/{set_id}/cards/", json=payload, headers=headers)

        if response.status_code == 201:
            messages.success(request, "Flashcard added via API!")
            return redirect('create_card', set_id=set_id)
        else:
            messages.error(request, f"Failed to add flashcard: {response.text}")

    return render(request, 'flashcards/create_card.html', {'flashcard_set': flashcard_set})

#view to start a quiz attempt
@csrf_protect
@login_required
def start_quiz_attempt(request, set_id):
    user = request.user
    flashcard_set = get_object_or_404(FlashcardSet, id=set_id)
    
    #counts the previous attempts
    previous_attempts = StudyTelemetry.objects.filter(user=user, flashcard_set=flashcard_set).count()
    
    #creates a new telementary record
    telemetry = StudyTelemetry.objects.create(
        user=user,
        flashcard_set=flashcard_set,
        attempt_number=previous_attempts + 1,
        started_at=now()
    )
    return JsonResponse({'message': 'Quiz attempt started', 'attempt_id': telemetry.id}, status=201)

#view to complete a quiz attempt
@csrf_protect
@login_required
def complete_quiz_attempt(request, attempt_id):
    telemetry = get_object_or_404(StudyTelemetry, id=attempt_id, user=request.user)
    
    #records the completion time and score
    telemetry.completed_at = now()
    telemetry.duration_seconds = int((telemetry.completed_at - telemetry.started_at).total_seconds())
    telemetry.score = request.POST.get('score') 
    telemetry.save()
    
    return JsonResponse({'message': 'Quiz attempt completed', 'duration': telemetry.duration_seconds}, status=200)

