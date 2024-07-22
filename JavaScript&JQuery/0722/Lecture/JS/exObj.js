// // 오브젝트 생성
// var Picture = new Object();
// Picture.title = "에펠탑의 신랑신부";
// Picture.artist = "마르크 샤갈";
// Picture.type = "유화";

// // 행위 메서드
// Picture.art = function() {
//     document.write(
//         `제목: ${Picture.title} <br> 작가: ${Picture.artist}`);
// }
// Picture.art();

// 위의 방식이 실무에서 사용함
// ==================================================================

var Picture = {
    title: "에펠탑의 신랑신부",
    artist: "마르크 샤갈",
    year: "1965"
}
document.write("<br>제목은: " + Picture.title + "<br>작가는: " + Picture.artist + "<br>년도는: " + Picture.year);