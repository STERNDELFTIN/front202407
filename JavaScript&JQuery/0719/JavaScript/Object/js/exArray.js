// 객체 생성 방식으로 배열 정의
var arr = new Array();
// var arr = [];

arr[0] = "value0";
arr[1] = "value1";
arr[2] = "value2";
arr[3] = "value3";

console.log(arr);
console.log(arr[2]);

// 배열 사용2
var room = new Array();
room = ["value0", "value1", "value2", "value3"];
console.log(room);

// reverse
arr = ["value0", "value1", "value2", "value3"];
arr.reverse();
console.log("reverse: ", arr);

// shift
arr = ["value0", "value1", "value2", "value3"];
arr.shift();
console.log("shift: ", arr);

// unshift
arr = ["value0", "value1", "value2", "value3"];
arr.unshift("addValue");
console.log("unshift: ", arr);

// pop
arr = ["value0", "value1", "value2", "value3"];
arr.pop();
console.log("pop: ", arr);

// push
arr = ["value0", "value1", "value2", "value3"];
arr.push("addValue");
console.log("push: ", arr);

// splice
arr = ["value0", "value1", "value2", "value3"];
console.log(arr.splice(1)); // value1, value2, value3
console.log("splice(1): ", arr); // value0

arr = ["value0", "value1", "value2", "value3"];
arr.splice(1);
console.log("splice(1): ", arr); // value0

arr = ["value0", "value1", "value2", "value3"];
arr.splice(1, 2);
console.log("splice(1, 2): ", arr); // value0, value3


// 값으로 인덱스 찾기
arr = ["value0", "value1", "value2", "value3"];
var myVal = arr.indexOf("value2");
console.log(myVal);

// join()
arr = ["value0", "value1", "value2", "value3"];
console.log("arr.join: " + arr.join())
console.log("arr.join('/'): " + arr.join('/'));

// sort() : 오름차순
arr = ["value0", "value1", "value2", "value3"];
console.log("arr.sort: " + arr.sort()); // 오름차순
console.log("arr.reverse: " + arr.reverse()); // 내림차순