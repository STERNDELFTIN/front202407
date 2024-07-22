// 버튼을 클릭했을 때, 함수를 수행
// --- ${"button"}.click();
$("#btn").click(
    // 익명함수
    function() {
        $("p").hide();
    }
);

// 자바스크립트 방식
document.getElementById("btn").onclick
$("p").hide();