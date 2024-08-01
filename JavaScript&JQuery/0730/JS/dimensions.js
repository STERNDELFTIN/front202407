$("button").click(function (e) { 
    let w = $("#div1").width();
    let h = $("#div1").height(); 
    let iW = $("#div1").innerWidth();
    let iH = $("#div1").innerHeight();
    let oW = $("#div1").outerWidth();
    let oH = $("#div1").outerHeight();

    let print1 = "넓이: " + w + "<br>" + "높이: " + h + "<hr>";
    let print2 = "border 안쪽 넓이: " + iW + "<br>" + "border 안쪽 넓이: " + iH + "<hr>";
    let print3 = "border 포함 넓이: " + oW + "<br>" + "border 포함 높이: " + oH + "<hr>";
    $(this).html(print1 + print2 + print3);
});