#imports
from django.contrib import admin
from .models import FlashcardSet, Flashcard, StudyTelemetry, PlatformSettings

#inline admin class to allow editing flashcards directly within a flashcardset
class FlashcardInline(admin.TabularInline):
    model = Flashcard
    extra = 1

#admin config for flashcardset model
@admin.register(FlashcardSet)
class FlashcardSetAdmin(admin.ModelAdmin):
    list_display = ('title', 'owner', 'created_at')
    inlines = [FlashcardInline]

#admin config for flashcard model
@admin.register(Flashcard)
class FlashcardAdmin(admin.ModelAdmin):
    list_display = ('question', 'answer', 'flashcard_set')

#admin config for studytelementary model
@admin.register(StudyTelemetry)
class StudyTelemetryAdmin(admin.ModelAdmin):
    list_display = ('user', 'flashcard_set', 'completed_at', 'duration_seconds')

#admin config for platformsettins model
@admin.register(PlatformSettings)
class PlatformSettingsAdmin(admin.ModelAdmin):
    list_display = ('daily_flashcard_set_limit',)
