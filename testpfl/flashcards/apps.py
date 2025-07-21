#imports
from django.apps import AppConfig

#defines the config for the flashcards app
class FlashcardsConfig(AppConfig):
    default_auto_field = 'django.db.models.BigAutoField'
    name = 'flashcards'
