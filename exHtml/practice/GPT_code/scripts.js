document.getElementById('search-form').addEventListener('submit', function(event) {
    event.preventDefault();
    
    // 입력된 검색 데이터를 가져옴
    const destination = document.getElementById('destination').value;
    const checkInDate = document.getElementById('check-in').value;
    const checkOutDate = document.getElementById('check-out').value;
    
    // 날짜 유효성 검사
    if (new Date(checkInDate) >= new Date(checkOutDate)) {
        alert('체크인 날짜는 체크아웃 날짜보다 앞서야 합니다.');
        return;
    }
    
    // 검색 결과를 표시할 섹션을 가져옴
    const resultsSection = document.getElementById('results');
    
    // 예제 호텔 데이터
    const exampleResults = [
        { name: '호텔 A', location: '서울', price: '100,000원', available: true },
        { name: '호텔 B', location: '부산', price: '80,000원', available: false },
        { name: '호텔 C', location: '제주', price: '120,000원', available: true }
    ];
    
    // 검색 결과를 필터링
    const filteredResults = exampleResults.filter(hotel => 
        hotel.location.includes(destination) && hotel.available
    );
    
    // 검색 결과를 HTML로 변환
    let resultsHTML = '';
    filteredResults.forEach(result => {
        resultsHTML += `
            <div class="hotel-result">
                <h3>${result.name}</h3>
                <p>위치: ${result.location}</p>
                <p>가격: ${result.price}</p>
            </div>
        `;
    });
    
    // 검색 결과가 없을 경우 메시지 표시
    if (resultsHTML === '') {
        resultsHTML = '<p>검색 결과가 없습니다.</p>';
    }
    
    // 검색 결과를 페이지에 표시
    resultsSection.innerHTML = resultsHTML;
});

document.getElementById('login-link').addEventListener('click', function(event) {
    event.preventDefault();
    
    const loginSection = document.getElementById('login-section');
    loginSection.style.display = 'block';
});

document.getElementById('login-form').addEventListener('submit', function(event) {
    event.preventDefault();
    
    // 로그인 데이터를 가져옴
    const username = document.getElementById('username').value;
    const password = document.getElementById('password').value;
    
    // 여기에 실제 로그인 로직을 구현해야 함
    // 지금은 예제 데이터로 로그인 처리함
    if (username === 'admin' && password === 'password') {
        alert('로그인 성공!');
        document.getElementById('login-section').style.display = 'none';
    } else {
        alert('로그인 실패. 사용자 이름 또는 비밀번호를 확인하세요.');
    }
});