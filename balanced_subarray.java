import java.util.*;
import java.util.Scanner;
class Main{
 public static void func(int n ,int[] arr){ 

// System.out.println(n);

   Map <Integer, Integer> m = new HashMap<>();
     m.put(0, -1);
     int c = 0;
     int max = 0;
     
     for(int i = 0; i<arr.length; i++){
         c+=arr[i] == 1 ? 1 : -1;
         if(m.containsKey(c)){
             max = Math.max(max, i - m.get(c));
         }else{
             m.put(c, i);
         }
         
        //   System.out.println(c);
     }
     System.out.println(max);
   
    
    
    
 }
public static void main(String[] args){
 Scanner sc = new Scanner(System.in);
 int tc = sc.nextInt();
 for(int i = 0; i<tc; i++){
 int n = sc.nextInt();
 
 int[] arr = new int[n];
 for(int j=0; j<n; j++){
 arr[j] = sc.nextInt();
 }
 func(n,arr);
}
 }
}