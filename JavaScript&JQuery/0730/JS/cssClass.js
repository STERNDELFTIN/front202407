// Add the effect
$("#btn1").click(function (e) { 
    $("#h1_color, #h2_color, #p_color").addClass("blue");
    $("#div_im").addClass("important");
});

$("#btn2").click(function (e) { 
    $("#div_im2").addClass("blue important");
});

// Remove the effect
$("#btn3").click(function (e) { 
    $("#div_im2").removeClass("blue");
});

// toggle effect
$("#btn4").click(function (e) { 
    $("#h1_color, #h2_color, #p_color").toggleClass("blue");
});

// if else문으로 addClass 및 removeClass를 이용하여 toggle과 같은 기능 생성(내가 짠 코드)
// $("#btn4").click(function (e) {
//     if ($("#h1_color").hasClass("blue") && $("#h2_color").hasClass("blue") && $("#p_color").hasClass("blue")) {
//         $("#h1_color, #h2_color, #p_color").removeClass("blue");
//     } else {
//         $("#h1_color, #h2_color, #p_color").addClass("blue");
//     }
// });