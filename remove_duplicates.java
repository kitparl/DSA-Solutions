import java.util.*;
import java.util.Scanner;
class Main{
    
    
        public static void func(int n ,int[] arr){  
    
    
    Set<Integer> set = new TreeSet<>();
    for(int i = 0; i<n; i++){
        set.add(arr[i]);
    }
    System.out.println(set.size());
    
    // System.out.println(set);
    
    for(Integer i: set){
        System.out.print(i+" ");
    }

System.out.println();


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
       

}
    }
    

}