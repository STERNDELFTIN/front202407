function goHistory2() {
    
}

function goBack(){
    window.history.back();
}

function goForward(){
    window.history.forward();
}

function enCookie(){
    let output = document.getElementById("output")
    innerHTML = navigator.cookieEnabled;

    let navA = navigator.cookieEnabled;
    let navB = navigator.appCodeName;
    let navC = navigator.platform;
    let navD = navigator.appVersion;
    let navE = navigator.userAgent;

    output.innerHTML = `A: ${navA} <br>B: ${navB} <br>C: ${navC} <br>D: ${navD} <br>E: ${navE}`;
}

var btn = document.getElementById("btn");
btn.style.fontSize = "1.6em";

var btn2 = document.getElementById("btn2");
btn2.style.fontSize = "1.6em";
