$("p").on(
    "click",
    function () {
        $(this).hide();
}
);

$(".multi_on").on({
    mouseenter: function(){
        $(this).css("background-color", "lightblue");
    },
    mouseleave: function(){
        $(this).css("background-color", "lightyellow");
    },
    click: function(){
        $(this).css("background-color", "lightgreen");
    },
    dblclick: function(){
        $(this).css("background-color", "gray");
    }
});