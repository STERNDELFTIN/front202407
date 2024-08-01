$(function(){
    $("header nav>ul").hover(function(){
        $(this).find(".submenu").stop().slideDown(1000)
    },
    function(){
        $(".submenu").stop().slideUp(500)
    })
})