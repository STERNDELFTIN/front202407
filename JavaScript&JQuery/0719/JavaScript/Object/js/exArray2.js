// forEach
arr = ["value_0", "value_2", "value_3", "value_4"];

arr.forEach(function(item, index, array) {
    document.write(
        `<p> arr[${index}] = ${item}</p>`
    );
})

// map함수
let num = [1, 2, 3, 4, 5];
let result = num.map(function(item, index, array) {
    document.write(
        `<p> ${item} </p>`
    );
    return item*3;
})
console.log(result);

// filter 함수
let num2 = [1, 2, 3, 4, 5, 6, 7, 8, 9];
let result2 = num2.filter(function(item, index) {
    return index % 2 == 0;
})
console.log(result2);
result2.forEach(function(item){
    document.write(item, "<br>");
})

// reduce 함수
let num3 = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10];
let result3 = num3.reduce((hap, item, index) => {
    return hap + (item * 2);
}, 0)
console.log(result3);

// for...in문
let color = ["red", "blue", "green", "violet"];
for (let str in color) {
    document.write(`<p> ${str} </p>`);
}
for (let str in color) {
    document.write(`<p> ${color[str]} </p>`);
}

// for...of문
for (let str of color) {
    document.write(`<p> ${str} </p>`);
}