import java.util.*;
import java.util.Scanner;
class Main{
    public static void func(int n, int[] a, int k ){ 
            Arrays.sort(a);
    int left = 0;
    int right = n - 1;
    int max = -1;
    while (left < right) {
        int sum = a[left] + a[right];
        if (sum < k) {
            if (sum > max) {
                max = sum;
            }
            left++;
        } else {
            right--;
        }
    }
    System.out.println(max);
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
        int k = sc.nextInt();
       func(n,arr,k);
}
    }
}
