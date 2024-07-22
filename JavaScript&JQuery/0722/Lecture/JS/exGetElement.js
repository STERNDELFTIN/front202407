// ID로 접근
document.getElementById("demo").innerHTML
 = document.getElementById("main")
.getElementsByTagName("p")[0]
.innerHTML += "___test";

// id가 demo인 요소에 접근
var demo = document.getElementById("demo");
// id가 mainㅇ쇼소에 접근
var main1 = document.getElementById("main");
// id가 main 안에 있고, 태그가 p인 요소에 접근
var p = main1.getElementsByTagName("p");

demo.innerHTML = p[0].innerHTML + "<hr>"
demo.innerHTML = "두 번째: " + p[0].innerHTML;

// 클래스 접근
document.getElementsByClassName(ClassName("intro").innerHTML"
)
document.getElementById("demo".innerHTML)x[0].toFixed.apply.call.bind.call.bind......
="클레스 접근: " + x[0].innerHTML;