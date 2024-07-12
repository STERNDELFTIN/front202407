// scripts.js

// 예약 폼 제출 처리
document.getElementById('reservation').addEventListener('submit', function(event) {
    event.preventDefault();
    
    let guestName = document.getElementById('guest-name').value;
    let checkinDate = new Date(document.getElementById('checkin-date').value);
    let checkoutDate = new Date(document.getElementById('checkout-date').value);
    let roomType = document.getElementById('room-type').value;
    let numGuests = document.getElementById('num-guests').value;
    
    // 체크인 날짜가 체크아웃 날짜보다 이전인지 확인
    if (checkinDate >= checkoutDate) {
      alert('Check-out date must be after check-in date.');
      return;
    }
    
    // 예약 목록에 새 항목 추가
    let reservationList = document.getElementById('reservation-list');
    let li = document.createElement('li');
    li.textContent = `${guestName} - ${formatDate(checkinDate)} to ${formatDate(checkoutDate)}, Room: ${roomType}, Guests: ${numGuests}`;
    reservationList.appendChild(li);
    
    // 입력 폼 초기화
    document.getElementById('reservation').reset();
  });
  
  // 로그인 폼 제출 처리
  document.getElementById('login-form').addEventListener('submit', function(event) {
    event.preventDefault();
    
    let username = document.getElementById('username').value;
    let password = document.getElementById('password').value;
    
    // 여기서는 간단히 localStorage를 사용하여 사용자 정보를 저장하고 로그인 상태를 유지합니다.
    let storedUsername = localStorage.getItem('username');
    let storedPassword = localStorage.getItem('password');
    
    if (username === storedUsername && password === storedPassword) {
      alert('Login successful!');
      // 로그인 상태를 유지하기 위해 세션 스토리지에 로그인 상태를 저장할 수 있습니다.
      sessionStorage.setItem('loggedIn', 'true');
      showReservationsSection();
    } else {
      alert('Invalid username or password.');
    }
    
    document.getElementById('login-form').reset();
  });
  
  // 회원가입 링크 클릭 처리
  document.getElementById('signup-link').addEventListener('click', function(event) {
    event.preventDefault();
    showSignupSection();
  });
  
  // 회원가입 폼 제출 처리
  document.getElementById('signup-form').addEventListener('submit', function(event) {
    event.preventDefault();
    
    let newUsername = document.getElementById('new-username').value;
    let newPassword = document.getElementById('new-password').value;
    
    // 여기서는 간단히 localStorage를 사용하여 새로운 사용자를 추가합니다.
    localStorage.setItem('username', newUsername);
    localStorage.setItem('password', newPassword);
    
    alert('Signup successful! Please login with your new account.');
    showLoginSection();
    
    document.getElementById('signup-form').reset();
  });
  
  // 로그인 링크 클릭 처리
  document.getElementById('login-link').addEventListener('click', function(event) {
    event.preventDefault();
    showLoginSection();
  });
  
  // 로그아웃 처리
  document.getElementById('logout-link').addEventListener('click', function(event) {
    event.preventDefault();
    
    // 로그아웃 시 세션 스토리지에서 로그인 상태 삭제
    sessionStorage.removeItem('loggedIn');
    
    // 로그인 화면으로 전환
    showLoginSection();
  });
  
  // 페이지 로드 시 초기 상태 설정
  window.onload = function() {
    if (sessionStorage.getItem('loggedIn') === 'true') {
      showReservationsSection();
    } else {
      showLoginSection();
    }
  };
  
  // 날짜 포맷 함수 (YYYY-MM-DD 형식으로 변환)
  function formatDate(date) {
    let year = date.getFullYear();
    let month = (date.getMonth() + 1).toString().padStart(2, '0');
    let day = date.getDate().toString().padStart(2, '0');
    return `${year}-${month}-${day}`;
  }
  
  // 섹션 표시 관련 함수
  function showLoginSection() {
    document.getElementById('login-section').style.display = 'block';
    document.getElementById('signup-section').style.display = 'none';
    document.getElementById('current-reservations').style.display = 'none';
  }
  
  function showSignupSection() {
    document.getElementById('login-section').style.display = 'none';
    document.getElementById('signup-section').style.display = 'block';
    document.getElementById('current-reservations').style.display = 'none';
  }
  
  function showReservationsSection() {
    document.getElementById('login-section').style.display = 'none';
    document.getElementById('signup-section').style.display = 'none';
    document.getElementById('current-reservations').style.display = 'block';
  }

  // 로그인 버튼 클릭 처리
document.getElementById('login-button').addEventListener('click', function(event) {
    event.preventDefault();
    window.location.href = 'login.html';
  });
  
  // 회원가입 버튼 클릭 처리
  document.getElementById('signup-button').addEventListener('click', function(event) {
    event.preventDefault();
    window.location.href = 'signup.html';
  });
  