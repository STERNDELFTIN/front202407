function autoSlide() {
    $(slide[sno]).stop().animate({
        top:"300px"
    },
    1000,
    function(){
        $(this).css({top:"-300px"});
    });

    sno++;
    if(sno>eno) sno = 0;
    $(slide[sno]).stop().aimate({
        top:"0"
    }, 1000);
}

/* 참조*********************** */
$(".slide").hover(
    function(){
        clearInterval(timer);
    },
    function(){
        timer = setInterval("autoSlide()",3000);
    }
);
/* ************************** */

var slide = $(".slide>img");
var sno = 0;
var eno = slide.length - 1;
var timer = setInterval(autoSlide, 3000);