var result01 = document.getElementById("func1");
var result02 = document.getElementById("func2");
var result03 = document.getElementById("func3");
// var result04 = document.getElementById("func4");
var result05 = document.getElementById("func5");
var result06 = document.getElementById("func6");
var result07 = document.getElementById("func7");

/* **************************************************** */

// 함수 선언
function line() {
    // 특정 기능을 반복 사용하기 위해서
    result01.innerHTML += "<p>" + "**********" + "<p>";

}
line();
line();
line();
line();

/* **************************************************** */

// 함수를 이용한 구구단
var dan = 2;

function multiply(i) {
    result02.innerHTML += dan + " × " + i + " ＝ " + (dan * i) + "<br>";
}

for (let i = 1; i < 10; i++)
{
    multiply(i);
}

/* **************************************************** */

// 함수를 이용한 더하기
// 일반적으로 함수는 소문자로 쓰고,
// 대문자는 보통 상수나 객체를 정의할 때 사용
function add (num01, num02)
{
    var sum = num01 + num02;

    result03.innerHTML += sum + "<br>";
}
add(3, 4);
add(10, 5);
add(2003, 532);
add(1234, 5678);

/* **************************************************** */

// 함수를 이용한 버튼 이벤트 처리
function flower (flowerName)
{
    switch(flowerName)
    {
        case "무궁화": alert("무궁화 동호회를 추천합니다.");
            break;
        case "장미": alert("장미 동호회를 추천합니다.");
            break;
        case "국화": alert("국화 동호회를 추천합니다.");
            break;
    }
}
// flower(flowerName);

/* **************************************************** */

// 110p
var first = 13;
var last = 7;
var result = 0;

function all(a, b)
{
    var sum = a + b;
    return sum;
}

result = all(first, last);
result05.innerHTML += "결과값: " + result;

/* **************************************************** */

// 고재 110p
var num = 1;

function love() {
    var a = num + 1;
    result06.innerHTML += "a = " + a + "<br>";
}
love();
result06.innerHTML += "결과값: " + num;

/* **************************************************** */

// 교재 111p
function love2()
{
    str = "산";
    var sum = "강";

    result07.innerHTML += "함수 내에서 출력: " + str + "<br>";
    result07.innerHTML += "함수 내에서 출력: " + sum + "<br>";

    // return a;
    return str;
}
love2();
// result07.innerHTML += "함수 밖에서 출력: " + a + "<br>";
result07.innerHTML += "함수 밖에서 출력: " + str + "<br>";