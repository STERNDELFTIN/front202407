$("button").click(function(){
    // $("p").hide();
    // $("p").hide("slow");
    // $("p").hide(3000);
    $("p").hide("slow",
        function(){
            // hide 후에 alert를 띄우기 위해서
            alert("p 태그가 사라짐");
        }
    );
})

// $("button").click(function(){
//     $("p").hide("slow");
//     alert("p 태그가 사라지려고 함"); // 최우선순위이므로 hide 전에 alert 이벤트가 발생
// })