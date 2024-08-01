// function myFunc() {
//     // alert("3초가 지났습니다.");
//     const d = new Date();
//     document.getElementById("dat").innerHTML = d;
// }

var myInterval = setInterval(myInterval, 1000);

function myInterval(){
    const d = new Date();
    document.getElementById("dat").innerHTML = d.toLocaleTimeString();
    // document.getElementById("dat").innerHTML = d;
}