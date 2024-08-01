// var d = documnet;
// var _id = d.getElementById("_hover");
// _id.innerHTML = "test";

$("#_hover").hover(
    function () {
        // over
        this.innerHTML = "마우스 오버";
    },
    function () {
        // out
        this.innerHTML = "마우스 아웃";
    }
);