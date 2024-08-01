$(".tabMenu li").click(function(){
    var idx = $(this).index()

    $(".tabItem >*").hide().removeClass("on")
    $(".tabItem >*").eq(idx).show().addClass()

    $(".tabItem li").removeClass("on")
    $(this).addClass("on");
})