import java.util.*;
import java.util.Scanner;
class Main{
    public static void func(int n ,int[] arr){      
        int max = Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            for(int j = i+1; j<n; j++){
                int dist = j-i;
                int temp = dist * Math.min(arr[j], arr[i]);
                max = Math.max(temp,max);
            }
        }
        System.out.println(max);
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