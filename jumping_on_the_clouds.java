import java.util.*;
import java.util.Scanner;
class Main{
    public static void findMinimumJumps(int[] arr){
 int count = 0;
 int i = 0;
 while(i < arr.length-1){
 if(i+2 < arr.length && arr[i + 2] == 0){
 i = i + 2;
 count++;
 }
 else{
 i++;
 count++;
 }
 }
 System.out.println(count);
 }

public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int tc = sc.nextInt();
    for(int i = 0; i<tc; i++){
        int n = sc.nextInt();
        
              int[] arr =  new int[n];
      for(int j=0; j<n; j++){
          arr[j] = sc.nextInt();
      }
       findMinimumJumps(arr);
}
    }
}
