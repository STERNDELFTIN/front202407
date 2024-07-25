// 속성 함수 정의
function funcStyle(obj, color, fsize) {
    obj.style.backgroundColor = color;
    obj.style.fontSize = fsize;
}
function funcInnterHtml(obj, value) {
    obj.innerHTML = `${value}`;
}
function newDoc() {
    const aUrl = "https://google.com";
    window.location.assign(aUrl);
}
// 변수 선언
var wLoc = window.location;
var d = document;

var demo = d.getElementById("demo");
var demo2 = d.getElementById("demo2");
var demo3 = d.getElementById("demo3");
var demo4 = d.getElementById("demo4");
var demo5 = d.getElementById("demo5");

// 속성 정의 
funcStyle(demo, "lightblue", "1.5em");
funcStyle(demo2, "lightgreen", "1.5em");
funcStyle(demo3, "lightpink", "1.5em");
funcStyle(demo4, "orange", "1.5em");
funcStyle(demo5, "#FCF", "1.5em");

// 값 정의
var varLocHref = wLoc.href;
var varLocHostName = wLoc.hostname;
var varLocPathName = wLoc.pathname;
var varLocProtocol = wLoc.protocol;
var varLocPort = wLoc.port;

// 표현
funcInnterHtml(demo, varLocHref);
funcInnterHtml(demo2, varLocHostName);
funcInnterHtml(demo3, varLocPathName);
funcInnterHtml(demo4, varLocProtocol);
funcInnterHtml(demo5, varLocPort);
// demo.innerHTML
//     = `${varLocHref}`;

// demo2.innerHTML
//     = `${varLocHostName}`;

// demo3.innerHTML
//     = `${varLocPathName}`;
   
// demo4.innerHTML
//     = `${varLocProtocol}`;

// demo5.innerHTML
//     = `${varLocPort}`;

var locAssign = document.getElementById("locAssign");
locAssign.style.fontSize = "1.5em";
locAssign.onclick = newDoc;