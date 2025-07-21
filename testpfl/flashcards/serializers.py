#imports
from rest_framework import serializers
from .models import FlashcardSet, Flashcard, StudyTelemetry, FlashcardSetRating
from django.contrib.auth.models import User

#serializer for the flashcardset model
class FlashcardSetSerializer(serializers.ModelSerializer):
    average_rating = serializers.FloatField(read_only=True)
    total_votes = serializers.IntegerField(read_only=True)
    owner = serializers.SerializerMethodField()

    class Meta:
        model = FlashcardSet
        #includes all the model fields
        fields = '__all__'

    #returns owener's username
    def get_owner(self, obj):
        return {"username": obj.owner.username if obj.owner else "Unknown"}

#serializer for the flashcard model
class FlashcardSerializer(serializers.ModelSerializer):
    class Meta:
        model = Flashcard
        fields = '__all__'
        #prevents modification of flashcardset
        read_only_fields = ['flashcard_set']

#serializer for the studytelementay model
class StudyTelemetrySerializer(serializers.ModelSerializer):
    class Meta:
        model = StudyTelemetry
        fields = '__all__'

#serializer for the flashcardrating model
class FlashcardSetRatingSerializer(serializers.ModelSerializer):
    class Meta:
        model = FlashcardSetRating
        fields = ['id', 'flashcard_set', 'user', 'rating']
        #user is set automatically, not via input
        read_only_fields = ['user']

#serializer for the user model
class UserSerializer(serializers.ModelSerializer):
    password = serializers.CharField(write_only=True)

    class Meta:
        model = User
        fields = ['id', 'username', 'password']

    #creates method to validate the username and password
    def create(self, validated_data):
        user = User.objects.create_user(
            username=validated_data['username'],
            password=validated_data['password']
        )
        return user
