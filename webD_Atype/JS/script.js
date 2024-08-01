// 메인 메뉴 중 하나에 mouse over시 highlight, moues out시 highlight 해제
    // mouse over - 서브 메뉴 영역이 부드럽게 나타나며, 서브 영역 표시
    // mouse out - 서브 메뉴 영역 부드럽게 사라짐

// 서브 메뉴 영역
    // 메인 페이지 콘텐츠 고려하여 배경색상 설정
    // 서브 메뉴 중 하나에 mouse over시 highlight, mouse out 시 highlight 해제
    // mouse out - 서브메뉴 영역 부드럽게 사라짐
$("header nav .main_menu").hover(
    function(){
        $(this).find(".sub_menu").stop().slideDown(menuSpd);
    },function(){
        $(this).find(".sub_menu").stop().slideUp(menuSpd);
    }
)

/* 애니메이션
    이미지가 위에서 아래 or 아래에서 위로 이동하면서 이미지 변경
    슬라이드는 매 3초 이내로 하나의 이미지에서 다른 이미지로 전환
    웹사이트 오픈 시 자동으로 시작. 슬라이드 반복 */
function autoSlide() {
    /* 현재 슬라이드 */
    $(slide[current_slide]).stop().animate({
        top:"300px"
    }, slideSpd,function(){
            $(this).css({top:"-300px"});
    });

    /* 슬라이드 변경을 위한 현재 슬라이드 번호 증가 및 마지막 슬라이드에 도착했을 경우 첫 번째 슬라이드로 회귀 */
    current_slide++;
    if (current_slide > end_slide) current_slide = 0;

    /* 다음 슬라이드 */
    $(slide[current_slide]).stop().animate({
        top: "0"
    }, slideSpd);
}

// hover시에 멈추는 기능 추가한 것(참조)
// $(".img_slide").hover(
//     function(){
//         clearInterval(timer);
//     },
//     function(){
//         timer = setInterval("autoSlide()",3000);
//     }
// );

/* 탭 기능 및 레이어 팝업창 */
$(".tab_title>li").click(
    function(){
        var i = $(this).index();

        $(".tab_content >*").hide().removeClass("on");
        $(".tab_content >*").eq(i).show().addClass();

        $(".tab_content>li").removeClass("on");
        $(this).addClass("on");
    }
);

/* 클릭한 공지사항 세부내용 팝업창으로 띄우기 */
function openPop(){
    $(".popup").show();
}
function closePop(){
    $(".popup").hide();
}


/* 메뉴 관련 변수 */
var menuSpd = 500;
/* 슬라이드 관련 변수 */
var slide = $(".img_slide>img")
var current_slide = 0;
var end_slide = slide.length - 1;
var slideSpd = 1000;
var timer = setInterval(autoSlide, 2500);