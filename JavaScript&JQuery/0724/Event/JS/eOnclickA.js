function myFunc(id){
    id.innerHTML="웁스";
}

function myFunc3(){
    myH1.innerHTML = Date();
}

var myH1 = document.getElementById("myH1");
myH1.onclick = myFunc3;