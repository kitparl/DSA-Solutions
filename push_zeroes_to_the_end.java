import java.util.*;
import java.util.Scanner;
class Main{
    public static void func(int n ,int[] arr){

        int c = 0;
    
        for(int i=0; i<n; i++){
            if(arr[i] != 0){
                arr[c++] = arr[i];
            }
    }
        while(c<n){
        arr[c++] = 0;
        }
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
       func(n,arr);
       for(int k=0; k<n; k++){
           System.out.print(arr[k]+" ");
       }
       System.out.println();
}
    }
}