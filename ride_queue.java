import java.util.*;
import java.util.Scanner;
class Main{
    public static void func(int n ,int[] arr){ 

        
        int c = 1;
        for(int i = 0; i<n-1; i++){
            if(arr[i+1] <= arr[i]){
                c++;
            }
        }
            System.out.println(c);

        
    }

public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int tc = sc.nextInt();
    for(int i = 0; i<tc; i++){
        int n = sc.nextInt();
        // int k = sc.nextInt();
        
              int[] arr =  new int[n];
      for(int j=0; j<n; j++){
          arr[j] = sc.nextInt();
      }
       func(n,arr);
}
    }
}