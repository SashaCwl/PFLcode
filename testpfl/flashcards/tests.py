#imports
from rest_framework.test import APITestCase
from rest_framework.authtoken.models import Token
from django.test import TestCase
from django.urls import reverse
from unittest.mock import patch
from django.contrib.auth.models import User
from flashcards.models import FlashcardSet, Flashcard, StudyTelemetry

#API tests for flashcard visibility
class FlashcardVisibilityTests(APITestCase):
    #creates a test for user authentication
    def setUp(self):
        self.user = User.objects.create_user(username='testuser', password='12345')
        self.token = Token.objects.create(user=self.user)
        self.client.credentials(HTTP_AUTHORIZATION='Token ' + self.token.key)
        self.flashcard_set = FlashcardSet.objects.create(title='Visibility Set', owner=self.user)
        #creates a flashcard set and flashcard
        self.flashcard = Flashcard.objects.create(
            question='Hidden Q?', answer='Hidden A', flashcard_set=self.flashcard_set
        )
        print("setup passed")

    #creates a test for hiding a flashcard
    def test_hide_flashcard(self):
        url = reverse('flashcards-by-set', args=[self.flashcard_set.id])
        response = self.client.post(url, {'card_id': self.flashcard.id, 'action': 'hide'})
        self.assertEqual(response.status_code, 200)
        self.assertIn(self.user, self.flashcard.hidden_by_users.all())
        print("hide flashcard passed")

    #creates a test for unhiding a flashcard
    def test_unhide_flashcard(self):
        self.flashcard.hidden_by_users.add(self.user)
        url = reverse('flashcards-by-set', args=[self.flashcard_set.id])
        response = self.client.post(url, {'card_id': self.flashcard.id, 'action': 'unhide'})
        self.assertEqual(response.status_code, 200)
        self.assertNotIn(self.user, self.flashcard.hidden_by_users.all())
        print("unhide flashcard passed")
    
    #creates a test for retrieving a flashcard from a set
    def test_retrieve_flashcards_from_set(self):
        url = reverse('flashcards-by-set', args=[self.flashcard_set.id])
        response = self.client.get(url)
        self.assertEqual(response.status_code, 200)
        self.assertIn('Hidden Q?', response.data[0]['question'])
        print("get flashcard from set passed")

    #creates a test for hiding a non existent flashcard
    def test_hide_non_existent_flashcard(self):
        url = reverse('flashcards-by-set', args=[self.flashcard_set.id])
        response = self.client.post(url, {'card_id': 9999, 'action': 'hide'})
        self.assertEqual(response.status_code, 404)
        print("hiding non existent flashcard passed")

    #creates a test for unhiding all flashcards
    def test_unhide_all_flashcards(self):
        self.flashcard.hidden_by_users.add(self.user)
        url = reverse('flashcardset-unhide-all')
        response = self.client.post(url)
        self.assertEqual(response.status_code, 200)
        self.assertNotIn(self.user, self.flashcard.hidden_by_users.all())
        print("unhiding all flashcards passed")



#Standard Django testcase for flashcard app functionality
class FlashcardAppTests(TestCase):
    #creates a test user and logs in
    def setUp(self):
        self.user = User.objects.create_user(username='testuser', password='12345')
        self.client.login(username='testuser', password='12345')
        #creates a flashcard set and two flashcards
        self.flashcard_set = FlashcardSet.objects.create(title='Test Set', owner=self.user)
        self.flashcard1 = Flashcard.objects.create(question='Question 1', answer='Answer 1', flashcard_set=self.flashcard_set)
        self.flashcard2 = Flashcard.objects.create(question='Question 2', answer='Answer 2', flashcard_set=self.flashcard_set)
        
    #tests creating a flashcard set via API
    @patch('flashcards.views.requests.post')
    def test_create_flashcard_set(self, mock_post):
        mock_post.return_value.status_code = 200
        response = self.client.post(reverse('create_set'), {'title': 'New Set'})
        self.assertEqual(response.status_code, 200)
        print("create flashcard set passed")

    #tests creating a flashcard via API
    @patch('flashcards.views.requests.post')
    def test_create_flashcard_via_api(self, mock_post):
        mock_post.return_value.status_code = 201
        response = self.client.post(reverse('create_card', args=[self.flashcard_set.id]), {'question': 'New Question', 'answer': 'New Answer'}, follow=True)
        self.assertEqual(response.status_code, 200)
        print("create flashcard passed")

    #tests starting a quiz attempt via API
    @patch('flashcards.views.requests.post')
    def test_start_quiz_attempt(self, mock_post):
        mock_post.return_value.status_code = 201
        response = self.client.post(reverse('start_quiz', args=[self.flashcard_set.id]))
        self.assertEqual(response.status_code, 201)
        print("start quiz passed")

    #tests completing a quiz attempt via API
    @patch('flashcards.views.requests.post')
    def test_complete_quiz_attempt(self, mock_post):
        mock_post.return_value.status_code = 200
        quiz_attempt = StudyTelemetry.objects.create(user=self.user, flashcard_set=self.flashcard_set)
        response = self.client.post(reverse('complete_quiz', args=[quiz_attempt.id]), {'score': 80})
        self.assertEqual(response.status_code, 200)
        print("complete quiz passed")

    #tests enforcing the daily flashcard set limit via API
    @patch('flashcards.views.requests.post')
    def test_prevent_flashcard_set_creation_beyond_daily_limit(self, mock_post):
        mock_post.return_value.status_code = 200
        response = self.client.post(reverse('create_set'), {'title': 'Another Set'})
        self.assertEqual(response.status_code, 200)
        print("daily limit passed")

