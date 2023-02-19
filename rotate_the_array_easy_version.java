
// You are given an array of n elements and an integer k, you need to rotate the array by k units towards right direction ( => ).

public import java.util.*;
import java.util.Scanner;
class Main{
    public static void func(int k ,int[] arr){   
           int n = arr.length;
        for (int i = 0; i < k; i++) {
            int lastElement = arr[n - 1];
            for (int j = n - 1; j > 0; j--) {
                arr[j] = arr[j - 1];
            }
            arr[0] = lastElement;
        }
        
        StringBuilder sb = new StringBuilder();
    for(int i=0; i<arr.length; i++){
           sb.append(arr[i]+" ");
       }
       System.out.println(sb);
        
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
 {
    
}
