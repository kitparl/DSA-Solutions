import java.util.*;
import java.util.Scanner;
class Main{
    public static int func( int[] arr, int l, int h, int k){        
         if (l > h) {
        return -1;
    }

    int mid = (l + h) / 2;
    if (arr[mid] == k) {
        return mid;
    }

    if (arr[l] <= arr[mid]) {
        if (k >= arr[l] && k <= arr[mid]) {
            return func(arr, l, mid - 1, k);
        }
        return func(arr, mid + 1, h, k);
    }

    if (k >= arr[mid] && k <= arr[h]) {
        return func(arr, mid + 1, h, k);
    }

    return func(arr, l, mid - 1, k);
    }

public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
                int k = sc.nextInt();

        
        
              int[] arr =  new int[n];
      for(int j=0; j<n; j++){
          arr[j] = sc.nextInt();
      }
      if(func(arr,1, n-1, k) != -1){
    System.out.println(func(arr, 0, n - 1, k));
}
else{
   System.out.println(-1); 
}
}
}

