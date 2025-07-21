document.addEventListener('DOMContentLoaded', () => {
    //rating button click handler
    document.querySelectorAll('.rate-btn').forEach(btn => {
      btn.addEventListener('click', () => {
        const setId = btn.getAttribute('data-set-id');
        const rating = prompt("Rate this set from 1 to 5 stars:");
  
        if (!rating || rating < 1 || rating > 5) {
          alert("Invalid rating!");
          return;
        }
  
        fetch(`/api/ratings/`, {
          method: 'POST',
          headers: {
            'Content-Type': 'application/json',
            'X-CSRFToken': getCookie('csrftoken'),
          },
          body: JSON.stringify({
            flashcard_set: setId,
            rating: rating
          }),
        })
        .then(res => {
          if (res.ok) return res.json();
          throw new Error('Failed to submit rating');
        })
        .then(data => alert('Rating saved!'))
        .catch(err => alert(err.message));
      });
    });
  });
  
  //helper to get CSRF cookie from browser
  function getCookie(name) {
    let cookieValue = null;
    if (document.cookie && document.cookie !== '') {
      const cookies = document.cookie.split(';');
      for (let cookie of cookies) {
        cookie = cookie.trim();
        if (cookie.startsWith(name + '=')) {
          cookieValue = decodeURIComponent(cookie.substring(name.length + 1));
          break;
        }
      }
    }
    return cookieValue;
  }
  
  document.querySelectorAll('.show-answer-btn').forEach(button => {
    button.addEventListener('click', () => {
      const cardDiv = button.closest('.flashcard');
      const answer = cardDiv.querySelector('.answer');
      if (answer.style.display === 'none') {
        answer.style.display = 'block';
        button.textContent = 'Hide Answer';
      } else {
        answer.style.display = 'none';
        button.textContent = 'Show Answer';
      }
    });
  });
  
  document.querySelectorAll('.hide-card-btn').forEach(button => {
    button.addEventListener('click', () => {
      const cardDiv = button.closest('.flashcard');
      const cardId = cardDiv.getAttribute('data-card-id');
      fetch(`/api/cards/${cardId}/hide/`, {
        method: 'POST',
        headers: {
          'X-CSRFToken': getCookie('csrftoken'),
        }
      })
      .then(res => {
        if (res.ok) {
          cardDiv.style.display = 'none';
          alert('Card hidden.');
        } else {
          alert('Failed to hide card.');
        }
      });
    });
  });
  