$("button").click(function (e) {
    $("p").hide();
});

$("#delDiv").click(function (e) {
    $("#del").hide();
});

$("#delDiv2").click(function (e) { 
    $(".del").hide();
});

$("#dbclick").dblclick(function (e) { 
    $(this).hide();
});

$("#enter").mouseenter(function () { 
    $(this).text("마우스 오버");
});
$("#enter").mouseleave(function () { 
    $(this).text("마우스 나감");
});

$("#enter2").mousedown(function () { 
    $(this).text("마우스 다운");
});
$("#enter2").mouseup(function () { 
    $(this).text("마우스 업");
});

$("#hover").hover(function () {
        // over
        $(this).text("마우스 over");
    }, function () {
        // out
        $(this).text("마우스 out");
    }
);