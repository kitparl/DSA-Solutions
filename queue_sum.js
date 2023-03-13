// code in java
function func(queries){
    
    let queue = [];
let S = 0;

for (let i = 0; i < queries.length; i++) {
let query = queries[i];
if (query[0] === 1) {
queue.push(query[1]);
} else if (query[0] === 2) {
if (queue.length === 0) {
S -= 1;
} else {
S += queue.shift();
}
}
}

console.log(S);
}

function runProgram(input) {
input = input.trim().split("\n")
let tc = +input[0]

// console.log(input[2]);
let line = 1;

    let mat = [];
for(let i=0; i<tc; i++){

    var arr = input[line].trim().split(" ").map(Number);
    line++;
    // console.log(arr);
    // for(let j = 0; j<tc; j++){
        mat.push(arr);
    // }
    
    

}
    func(mat);


}
    process.stdin.resume();
    process.stdin.setEncoding("ascii");
    let read = "";
    process.stdin.on("data", function (input) {
      read += input;
    });
    process.stdin.on("end", function(){
        read = read.replace(/\&/,"");
        read = read.replace(/\&/,"");
        runProgram(read);

    });