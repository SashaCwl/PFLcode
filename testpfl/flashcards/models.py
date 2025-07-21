#imports
from django.db import models
from django.contrib.auth.models import User
from django.db.models import Avg
from django.utils import timezone
from django.utils.timezone import now

class FlashcardSet(models.Model):
    #cruicial information for flashcardsets
    title = models.CharField(max_length=200)
    description = models.TextField(blank=True)
    owner = models.ForeignKey(User, on_delete=models.CASCADE)
    created_at = models.DateTimeField(auto_now_add=True)

    #rating-related fields
    total_votes = models.PositiveIntegerField(default=0)
    average_rating = models.FloatField(default=0.0)

    #updates rating statistics
    def update_rating(self):
        agg = self.ratings.aggregate(avg=Avg('rating'), count=models.Count('id'))
        self.average_rating = agg['avg'] or 0
        self.total_votes = agg['count']
        self.save()

class FlashcardSetRating(models.Model):
    #cruicial information for flashcardsetratings
    flashcard_set = models.ForeignKey(FlashcardSet, related_name='ratings', on_delete=models.CASCADE)
    user = models.ForeignKey(User, on_delete=models.CASCADE)
    rating = models.PositiveSmallIntegerField()  

    #prevents duplicate ratings by the same user
    class Meta:
        unique_together = ('flashcard_set', 'user')

class Flashcard(models.Model):
    #cruicial information for flashcards
    question = models.TextField()
    answer = models.TextField()
    flashcard_set = models.ForeignKey(FlashcardSet, related_name='flashcards', on_delete=models.CASCADE)

    #for users who have chosen to hide the flashcard
    hidden_by_users = models.ManyToManyField(User, blank=True, related_name='hidden_flashcards')

class StudyTelemetry(models.Model):
    #cruicial information for studytelementrys
    user = models.ForeignKey(User, on_delete=models.CASCADE)
    flashcard_set = models.ForeignKey(FlashcardSet, on_delete=models.CASCADE)
    attempt_number = models.PositiveIntegerField(default=1)
    started_at = models.DateTimeField(default=timezone.now)
    completed_at = models.DateTimeField(null=True, blank=True)
    duration_seconds = models.IntegerField(null=True, blank=True)
    score = models.FloatField(null=True, blank=True)  


class PlatformSettings(models.Model):
    #cruicial information for platformsettings
    daily_flashcard_set_limit = models.PositiveIntegerField(default=20)

    #sets the daily limit
    def __str__(self):
        return f"Platform Settings (Limit: {self.daily_flashcard_set_limit})"

    class Meta:
        verbose_name = 'Platform Setting'
        verbose_name_plural = 'Platform Settings'