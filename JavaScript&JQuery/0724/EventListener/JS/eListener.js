const d = document;

/* *************************************** */

function displayDate(e) {
    // this.innerHTML = Date();
    date.innerHTML = Date();
    console.log(e.type);
}

var btn = d.getElementById("btn");
var date = d.getElementById("date");
btn.addEventListener("click", displayDate);

/* *************************************** */

function text(e){
    let _event = e.type;
    console.log(e.type);
    viewOverOut.innerHTML = `마우스 ${_event} 이벤트 발생`;
}

var btnOverOut = d.getElementById("btnOverOut");
var viewOverOut = d.getElementById("viewOverOut");
// btnOverOut.addEventListener("mouseover", text);
// btnOverOut.addEventListener("mouseout", text);

btnOverOut.addEventListener("click", text);
btnOverOut.addEventListener("dblclick", text);

// btnOverOut.addEventListener("mouseup", text);
// btnOverOut.addEventListener("mousedown", text);

// btnOverOut.addEventListener("mousemove", text);
// btnOverOut.addEventListener("mouseleave", text);

// btnOverOut.addEventListener("mouseenter", text);
// btnOverOut.addEventListener("mouseout", text);