import java.util.*;
import java.util.Scanner;
class Main{
 public static void func(int n ,int[] arr){ 
    //  System.out.println(n);
    int max = arr[0];
    int a = arr[0];
    
    for(int i = 1; i<n; i++){
        a = Math.max(arr[i], a+ arr[i]);
        max = Math.max(max, a);
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