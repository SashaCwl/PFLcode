#imports
from django import forms
from .models import Flashcard, FlashcardSet

#creates a modelform for the flashcard model
class FlashcardForm(forms.ModelForm):
    class Meta:
        model = Flashcard
        fields = ['question', 'answer', 'flashcard_set']
