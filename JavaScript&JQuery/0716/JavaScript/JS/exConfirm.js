// 이 창을 떠날지 묻고, true이면 새 창을 띄워서 굿바이 인사함

// Boolean(true, false)

if (windeow.confirm("이 창을 닫으시겠습니까?")){
    // 수행할 로직을 작성하는 부분
    window.open("exit.html", "mozillaWindow", "popup");

    // 참고
    // window.open("https://www.mozilla.org/", "mozillaTab");
    // window.open("https://www.mozilla.org/", "mozillaWindow", "popup");
}