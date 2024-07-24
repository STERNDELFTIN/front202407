function autoSlide() {
    $(slide[sno]).stop().animate({
        left:"-100%"},
        1000,
        // 콜백함수: 슬라이드가 화면 밖으로 완전히 나간 후에 호출
            // 현재 슬라이드가 왼쪽으로 빠져나간 후, 다시 오른쪽 바깥으로 재배치됨
            // left:-100% -> left:100%
            // 이 과정을 함으로써 슬라이드가 화면 밖에서 시작하여 자연스럽게 이동하는 느낌을 줌
            // 또, 슬라이드 위치를 미리 설정해두어 다음 애니메이션 실행 시 준비된 상태로 시작 가능
        function(){
            $(this).css({left:"100%"});
        }
      );

    // 슬라이드 번호 증가
    sno++;
    $(slide[sno]).stop().animate({
        left:"0"
    },1000);
}

/* ******참조********************************* */
// 마우스가 영역을 벗어나면 다시 자동 슬라이드 작동
$(".slide").hover(
    // 마우스 진입 시 자동 슬라이드 정지
    function(){
        clearInterval(timer);
    },
    // 마우스 벗어날 시 자동 슬라이드 재시작
    function(){
        timer = setInterval("autoSlide()", 3000)
    }
);
/* ******************************************* */

var slide = $(".slide>img");
var sno = 0;
var eno = slide.length - 1;
var timer = setInterval(autoSlide, 3000);