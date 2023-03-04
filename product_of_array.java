import java.util.*;
import java.util.Scanner;
class Main{
 public static void func(int n ,int[] arr){ 
    
    
   int p = 1;
   
   for(int i =0; i<n; i++){
       p*=arr[i];
   }
   
   for(int j=0; j<n; j++){
       System.out.print((p/arr[j]) + " ");
   }
   

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
 System.out.println();
}
 }
}