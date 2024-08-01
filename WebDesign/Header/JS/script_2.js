// 각각의 메뉴가 내려옴
// $(".menu").hover(function() {
//     $(this).find(".submenu").stop().slideDown(1000)
// },
// function(){
//     $(this).find(".submenu").stop().slideUp(500)
// })

let barSpeed = 600;
// 메뉴가 한꺼번에 내려옴
$("header nav>ul").hover(function(){
    $(".submenu, .headerBg").stop().slideDown(barSpeed)
},
function(){
    $(".submenu, .headerBg").stop().slideUp(barSpeed)
})