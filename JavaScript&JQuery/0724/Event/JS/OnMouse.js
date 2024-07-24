function funcMouseOver() {
    this.innerHTML = "마우스 오버";
    this.style.fontWeight = "bold";
    this.style.backgroundColor = "yellow";
    this.style.border = "1px solid red";
    this.style.boxShadow = "20px -6px lightgray";
}
function funcMouseOut() {
    this.innerHTML = "마우스 아웃";
    this.style.fontWeight = "100";
    this.style.backgroundColor = "lightblue";
    this.style.border = "none";
    this.style.boxShadow = "none";
}

var mOverOut = document.getElementById("mOverOut");

mOverOut.onmouseover = funcMouseOver;
mOverOut.onmouseout = funcMouseOut;

/* ************************************************ */

function funcMouseDown() {
    this.innerHTML = "마우스 다운";
    this.style.backgroundColor = "rgb(50, 50, 50)";
    this.style.fontWeight = "bold";
    this.style.fontSize = "20px";
}
function funcMouseUp() {
    this.innerHTML = "마우스 업";
    this.style.backgroundColor = "rgb(250, 300, 35)";
    this.style.fontWeight = "100";
    this.style.fontSize = "16px";
}

var mDownUp = document.getElementById("mDownUp");

mDownUp.onmousedown = funcMouseDown;
mDownUp.onmouseup = funcMouseUp;
