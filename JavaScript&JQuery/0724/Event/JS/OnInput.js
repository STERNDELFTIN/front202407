function upperCase(){
    // fname.value = fname.value.toUpperCase();
    this.value = this.value.toUpperCase();
}

// id="fname"
var f1 = document.getElementById("fname");
f1.oninput = upperCase;

/*********************************************/

function lowerCase(){
    this.value = this.value.toLowerCase();
}

var f2 = document.getElementById("fname2");
f2.onchange = lowerCase;