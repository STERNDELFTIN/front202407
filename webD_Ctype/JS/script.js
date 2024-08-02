/* 메뉴 */
$("header nav .main").hover(
    function(){
        $(this).find(".sub").stop().slideDown(menuSpd);
    },
    function(){
        $(this).find(".sub").stop().slideUp(menuSpd);
    }
);

/* 슬라이드 */
function autoSlide(){
    $(slide[current_slide]).stop().animate({
        top: "350px"
    },slideSpd,function(){
        $(this).css({top:"-350px"});
});

    current_slide++;
    if (current_slide > end_slide) current_slide = 0;

    $(slide[current_slide]).stop().animate({
        top: "0"
    }, slideSpd);
}

/* 팝업창 띄우기 */
function openPop() {
    $(".popup").show();
}

function closePop() {
    $(".popup").hide();
}

/* 메뉴 변수 */
var menuSpd = 600;

/* 슬라이드 변수 */
var slide = $(".slide>img");
var current_slide = 0;
var end_slide = slide.length - 1;
var slideSpd = 1000;
var timer = setInterval(autoSlide, 3000);