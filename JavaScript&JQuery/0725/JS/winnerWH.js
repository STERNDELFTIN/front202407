var demo = document.getElementById("demo");
demo.style.backgroundColor = "yellow";
demo.style.fontSize = "1.5em";

var winInnerWidth = window.innerWidth;
var winInnerHeight = window.innerHeight;

demo.innerHTML = `윈도우의 내부넓이: ${winInnerWidth}<br>윈도우의 내부높이: ${winInnerHeight}`;