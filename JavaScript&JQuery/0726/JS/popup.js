function myAlert() {
    alert("나는 알림박스야.");
}

function myConfirm(){
    // confirm("확인해주세요.");
    var re = document.getElementById("re");
    result = confirm("확인해주세요");
    if(result) re.innerHTML = "확인"; // 확인
    else re.innerHTML = "취소"; // 취소
}

function myPrompt(){
    var reProm = document.getElementById("reProm");
    // reProm.innerHTML = result;
    resultProm = prompt("이름을 입력해주세요");

    // if(resultProm == null || resultProm == "") reProm.innerHTML = "이름 입력 안 함"; // 값 입력X
    // else reProm.innerHTML = resultProm; // 값 입력

    if (resultProm == null) {
        reProm.innerHTML = "입력을 취소하셨습니다.";
    } else if (resultProm == ""){
        reProm.innerHTML = "값을 입력하지 않았습니다."
    } else {
        reProm.innerHTML = resultProm + "님 안녕하세요";
    }
}
var resultProm;