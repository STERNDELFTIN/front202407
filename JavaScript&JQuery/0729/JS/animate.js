$(document).ready(function () {
    $("button").click(function (e) { 
        $("div").animate({
            left: "250px",
            opacity: "0.5",
            height: "150px",
            width: "150px" 
        });
    });
});