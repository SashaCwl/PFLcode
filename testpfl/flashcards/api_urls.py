#imports
from rest_framework.routers import DefaultRouter
from django.urls import path
from .views import FlashcardSetViewSet, FlashcardViewSet, flashcards_by_set_combined, StudyTelemetryViewSet, FlashcardSetRatingViewSet, UserViewSet

#creates a router instance to generate RESTful routes
router = DefaultRouter()
#registers viewsets with the router
router.register(r'sets', FlashcardSetViewSet)
router.register(r'cards', FlashcardViewSet)
router.register(r'telemetry', StudyTelemetryViewSet)
router.register(r'ratings', FlashcardSetRatingViewSet)  
router.register(r'users', UserViewSet)  

#assigns generated urls to urlpatterns
urlpatterns = router.urls

#adds a custom url pattern for retrieving flashcards by set
urlpatterns += [
    path('sets/<int:set_id>/cards/', flashcards_by_set_combined, name='flashcards-by-set'),
]
