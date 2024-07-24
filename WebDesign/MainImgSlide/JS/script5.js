function autoSlide(){
    $(slide[sno]).stop().animate({
        opacity:0 // 완전 투명
    },1000);

    sno++;
    if(sno > eno) sno = 0;
    $(slide[sno]).stop().animate({
        // opacity: "1"와 동일
        opacity: 1 // 완전 불투명
    },1000);
}

/* 참조************************************** */
$(".slide").hover(
    function(){
        clearInterval(timer);
    },
    function(){
        timer = setInterval(autoSlide, 3000);
    }
);
/* ****************************************** */

var slide = $(".slide>img");
var sno = 0;
var eno = slide.length - 1;
var timer = setInterval(autoSlide, 3000);