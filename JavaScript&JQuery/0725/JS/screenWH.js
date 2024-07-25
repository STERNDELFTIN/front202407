// 변수 정의
var demo = document.getElementById("demo");
var demo2 = document.getElementById("demo2");
var demo3 = document.getElementById("demo3");
var demo4 = document.getElementById("demo4");

// 속성 정의
demo.style.backgroundColor = "lightblue";
demo.style.fontSize = "1.5em";
demo2.style.backgroundColor = "lightgreen";
demo2.style.fontSize = "1.5em";
demo3.style.backgroundColor = "lightpink";
demo3.style.fontSize = "1.5em";
demo4.style.backgroundColor = "orange";
demo4.style.fontSize = "1.5em";

// 값 정의
var screenWidth = screen.width;
var screenHeight = screen.height;
var screenAvalWidth = screen.availWidth;
var screenAvalHeight = screen.availHeight;
var screenColorDep = screen.colorDepth;
var screenPixelDep = screen.pixelDepth;

// 표현
demo.innerHTML = `스크린 넓이: ${screenWidth}<br>스크린 높이: ${screenHeight}`;
demo2.innerHTML = `스크린 넓이: ${screenAvalWidth}<br>스크린 높이: ${screenAvalHeight}`;
demo3.innerHTML = `스크린의 화면 색상 깊이: ${screenColorDep}`;
demo4.innerHTML = `스크린의 화면 픽셀 깊이: ${screenPixelDep}`;