function autoSlide() {
    /* 현재 슬라이드 */
    // stop(): 이전 애니메이션 중지
    // animate(): 슬라이드의 left 속성을 100% 이동
        // 1000ms(1s) 지속
    $(slide[sno]).stop().animate({
        left:"100%"
    }, 1000, function() {
        // css(): 다음 슬라이드 준비
        $(this).css({left:"-100%"});
    });

    /* 다음 슬라이드 */
    sno++;
    // 마지막 슬라이드에서 다음 슬라이드로 넘어갈 때
        // 첫 번째 슬라이드(0번 슬라이드)로 돌아감
    if (sno > eno) { sno = 0; }

    $(slide[sno]).stop().animate({
        left:"0" // 0으로 이동
    }, 1000);
}

var slide = $(".slide>img");
var sno = 0; // 슬라이드 번호
var eno = slide.length - 1;
// setInterval(): 주어진 함수(autoSlide)를 지정된 시간 간격(3000ms=3s)마다 반복 실행
var timer = setInterval(autoSlide, 3000);