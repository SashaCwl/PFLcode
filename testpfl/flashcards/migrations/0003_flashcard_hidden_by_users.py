# Generated by Django 4.2.16 on 2025-06-03 10:04

from django.conf import settings
from django.db import migrations, models


class Migration(migrations.Migration):

    dependencies = [
        migrations.swappable_dependency(settings.AUTH_USER_MODEL),
        ('flashcards', '0002_flashcard_flashcardset_studytelemetry_and_more'),
    ]

    operations = [
        migrations.AddField(
            model_name='flashcard',
            name='hidden_by_users',
            field=models.ManyToManyField(blank=True, related_name='hidden_flashcards', to=settings.AUTH_USER_MODEL),
        ),
    ]
