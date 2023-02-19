
// java 3 test cases are failing but it is passing for js
import java.util.*;
import java.util.Scanner;
class Main{
    public static void func(int k ,int[] arr){  
        int n = arr.length;
        int i = 0;
    while (i < n && k > 0) {
        if (i + 1 < n && arr[i + 1] == 0 && i - 1 >= 0 && arr[i - 1] == 0 && arr[i] == 0) {
            arr[i] = 1;
            k--;
        }
        i++;
    }
    if (k == 0) {
        System.out.println("Yes");
    } else {
        System.out.println("No");
    }
    }

public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int tc = sc.nextInt();
    for(int i = 0; i<tc; i++){
        int n = sc.nextInt();
        int k = sc.nextInt();
        
              int[] arr =  new int[n];
      for(int j=0; j<n; j++){
          arr[j] = sc.nextInt();
      }
       func(k,arr);
}
    }
}

/*
 let fl = (n,arr,k) => {

    let i=0;
    while(i<n && k>0){
        if(!arr[i+1] && !arr[i-1] && !arr[i]){
            arr[i] = 1;
            k--;
           
        }
         i++;
    }
    if(k==0){
        console.log("Yes");
    }
    else{
        console.log("No");
    }
}
function runProgram(input){
input = input.trim().split("\n");
let tc = +(input[0]);
let line =1;
for(let i=0; i<tc; i++){
    let x= input[line].trim().split(" ").map(Number)
    let size = x[0];
    let k = x[1];
    line++;
    let arr = input[line].trim().split(" ").map(Number);
    line++;
    
    fl(size,arr,k)
}
}
 */