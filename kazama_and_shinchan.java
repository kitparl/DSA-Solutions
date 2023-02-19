import java.util.*;
import java.util.Scanner;
class Main{
    public static int func(int k, int[] arr) {
        int n = arr.length;
    for (int i = 0; i < n; i++) {
        if (arr[i] == k) {
            return i;
        } else if (arr[i] > k) {
            return i;
        }
    }
    return n;
}


public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        
              int[] arr =  new int[n];
      for(int j=0; j<n; j++){
          arr[j] = sc.nextInt();
      }
        int k = sc.nextInt();
       System.out.println(func(k,arr));
    }
}
