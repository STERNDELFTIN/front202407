// 변수 정의 var, let, const, 사용안함(글로벌변수)
var var1;
let var2;
const var3 = "http://~";

var1 = 123;
var2 = "234";
{
    var4 = "글로벌 변수로 사용됨";
}

// 값을 뿌려줄때 - 개발자
console.log(var3);

document.write(var1); // 실제로 개발할 때 잘 사용하지는 않음 (밑에꺼보다 우선순위가 밀림)
document.getElementById("variable2").innerText
 = "var2의 값은: " + var2 + "<hr>"; // HTML 태그 인식 X
document.getElementById("variable3").innerHTML
 = "var2의 값은: " + var2 + "<hr>"; // HTML 태그 인식 O
