// 글로벌 == 전역
var i = 30, j = 15;
// var d1 = document.getElementById("cal1");
// var d2 = document.getElementById("cal2");

window.onload = function() {
    // 삼항연산자
    // (조건) ? 참일 때 수행 : 거짓일 때;
    var result = (i < j) ? "i가 j보다 작다" : "j가 i보다 작다";
    // var result2 = (i < j) ? 'd1.innerHTML = "i가 j보다 작다"' : 'd1.innerHTML = "j가 i보다 작다"';
    console.log(result);

    // 연산자 우선순위
    /*-------------------------
    1.___ 수학에서 ()가 최우선순위 연산하는 것과 같다.
    1. ()

    2.___ 괄호 안에 있는 사칙연산을 수행 중에 증감연산자를 만나면 증감연산자를 우선적으로 연산한다.
        ___ 하지만, 후행연산자는 이미 연산하였지만, 특성 상 사칙연산을 끝나고 감소 증가를 하게 됨
    2. 증감연산자 ++, --
    
    3.___ 기본적으로 () 안의 사칙연산 수행
    3. 사칙연산

    4.___계산이 끝난 값들에 대해서 비교한다.
    4. 비교연산
    
    5.___ 계산된 결괏값을 변수에 담아준다.
    5. 대입연산
    --------------------------*/

    var num = 5;
    var sum = 15;
    var result2 = ++num <= sum * 5;
    console.log(result2)
}
