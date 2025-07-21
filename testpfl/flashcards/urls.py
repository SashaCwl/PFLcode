#imports
from django.urls import path, include
from rest_framework.routers import DefaultRouter
from . import views
from .views import FlashcardSetViewSet, start_quiz_attempt, complete_quiz_attempt, FlashcardViewSet, StudyTelemetryViewSet, FlashcardSetRatingViewSet, home 

#sets up the router for API endpoints
router = DefaultRouter()
router.register(r'sets', FlashcardSetViewSet, basename='flashcardset')
router.register(r'cards', FlashcardViewSet, basename='flashcard')
router.register(r'telemetry', StudyTelemetryViewSet)
router.register(r'ratings', FlashcardSetRatingViewSet)

#defines the URL patterns for both the web views and API endpoints
urlpatterns = [
    path('app/', views.home, name='home'), 
    path('study/<int:set_id>/', views.study_set, name='study_set'),
    path('create-set/', views.create_set, name='create_set'),
    path('create_card/<int:set_id>/', views.create_card, name='create_card'),
    path('api/', include('flashcards.api_urls')),
    path('start-quiz/<int:set_id>/', start_quiz_attempt, name='start_quiz'),
    path('complete-quiz/<int:attempt_id>/', complete_quiz_attempt, name='complete_quiz'),

]

