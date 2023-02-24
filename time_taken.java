import java.util.*;
import java.util.Scanner;
class Main{
 public static void func(int n, int k, int[] arr){ 
    //  System.out.println(k);
    int t = 0;
    for(int i = 0; i<=k; i++){
        t+=Math.min(arr[k], arr[i]);
    }
    
    for(int i = k+1; i<arr.length; i++){
        if(arr[i] >= arr[k]){
            t+=arr[k] - 1;
        }
        else{
            t+= arr[i];
        }
    }
         System.out.println(t);

 }
public static void main(String[] args){
 Scanner sc = new Scanner(System.in);

 int n = sc.nextInt();
 int k = sc.nextInt();
 
 int[] arr = new int[n];
 for(int j=0; j<n; j++){
 arr[j] = sc.nextInt();
 }
 func(n,k-1,arr);

 }
}
