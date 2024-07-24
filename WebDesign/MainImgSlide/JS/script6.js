function autoSlide() {
    // 일정 시간이 지나면 불투명하게 이미지가 우측으로 넘어감
    $(slide[sno]).stop().animate({
        left:"100%", opacity:0
    },1000,function(){
        $(this).css({left:"-100%"});
    });

    sno++;
    if(sno > eno) sno = 0;
    $(slide[sno]).stop().animate({
        left:"0", opacity: 1
    }, 1000);
}

/* 참조************************************* */
$(".slide").hover(
    function(){ clearInterval(timer); },
    function(){ timer = setInterval(autoSlide, 3000); }
)
/* ***************************************** */

var slide = $(".slide>img");
var sno = 0;
var eno = slide.length - 1;
var timer = setInterval(autoSlide, 3000);