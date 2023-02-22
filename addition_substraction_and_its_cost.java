import java.util.*;
import java.util.Scanner;
class Main{
    
    public static List<Integer> ans = new ArrayList<>();
    
    public static int sumOfK(int[] arr, int k){
        int s = 0;
        for(int i=0; i<k; i++){
            s+=arr[i];
        }
        return s;
        
    }
 public static int func(int k ,int[] arr){ 
     int ans = 999999;
     int min;
     
     for(int i=0; i<arr.length; i++){
         int[] cost = new int[arr.length];
         for(int j=0; j<arr.length; j++){
             int temp;
             if(arr[j] > arr[i]){
                 temp = (arr[j] - arr[i]) * 5;
                 
             }else{
                 temp = (arr[i] - arr[j]) * 3;
             }
             
             cost[j] = temp;
         }
         Arrays.sort(cost);
         min = sumOfK(cost, k);
         ans = Math.min(min, ans);
     }
     return ans;
     
 }
public static void main(String[] args){
 Scanner sc = new Scanner(System.in);
 int tc = sc.nextInt();
 for(int i = 0; i<tc; i++){
 int n = sc.nextInt();
 int k = sc.nextInt();
 
 int[] arr = new int[n];
 for(int j=0; j<n; j++){
 arr[j] = sc.nextInt();
 }
    System.out.println(func(k,arr));
}
 }
}