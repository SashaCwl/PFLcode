#imports
from django.contrib import admin
from django.urls import path, include
from django.contrib.auth import views as auth_views
from flashcards import views
from rest_framework.authtoken.views import obtain_auth_token

# URL configuration for admin panel, authentication (login, signup, token), flashcard app views (home, create, study), and API endpoints
urlpatterns = [
    path('admin/', admin.site.urls),
    path('', auth_views.LoginView.as_view(template_name='registration/login.html'), name='login'),
    path('app/', include('flashcards.urls')),
    path('accounts/', include('django.contrib.auth.urls')),
    path('signup/', views.signup, name='signup'),
    path('create-set/', views.create_set, name='create_set'),
    path('create-card/<int:set_id>/', views.create_card, name='create_card'),
    path('api-token-auth/', obtain_auth_token),
    path('', include('flashcards.urls')),

]