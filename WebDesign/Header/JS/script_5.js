let spd = 600;

$("header nav .menu").hover(
    function(){
        $(this).find(".submenu").stop().fadeIn(spd);
    },
    function(){
        $(this).find(".submenu").stop().fadeOut(spd);
    }
)

/* fadeIn, fadeOut 사용할 때에는 display 속성이 block으로 변경됨.
    slideDown, slideUp 사용할 때에는 height 속성이 애니메이션되는 동안
    overflow 속성이 hidden으로 설정되므로 서브메뉴의 스타일이 제대로 적용되지 않을 수 있음
     */
// $("header nav .menu").hover(
//     function(){
//         $(this).find(".submenu").stop().slideDown(
//             spd,
//             function(){
//                 $(this).css("display", "block");
//             }); // 애니메이션 완료 후 display:block으로 강제 설정(overflow:hidden으로 인해 스타일 제대로 적용되지 않는 문제 해결)
//     },
//     function(){
//         $(this).find(".submenu").stop().slideUp(
//             spd,
//             function(){
//                 $(this).css("display", "none"); // 애니메이션 완료 후 display:none으로 설정하여 서브메뉴 숨김
//             });
//     }
// )
