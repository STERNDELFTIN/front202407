let barSpeed = 600;

$("header nav .menu").hover(
    function(){
        $(this).find(".submenu").stop().slideDown(barSpeed);
},
    function(){
        $(this).find(".submenu").stop().slideUp(barSpeed);
})