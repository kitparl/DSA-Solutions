
import java.util.*;
import java.util.Scanner;
class Main{
public static boolean isPossible(int mid, int[] arr, int n, int k) {
    int pos = arr[0];
    int elements = 1;
    for (int i = 1; i < n; i++) {
        if (arr[i] - pos >= mid) {
            pos = arr[i];
            elements++;
            if (elements == k) {
                return true;
            }
        }
    }
    return false;
}

public static int func(int[] arr, int n, int k) {
    Arrays.sort(arr);
    int res = 0;
    int left = 1, right = arr[n - 1];
    while (left < right) {
        int mid = (left + right) / 2;
        if (isPossible(mid, arr, n, k)) {
            res = Math.max(res, mid);
            left = mid + 1;
        } else {
            right = mid;
        }
    }
    return res;
}

public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int tc = sc.nextInt();
    for(int i = 0; i<tc; i++){
        int n = sc.nextInt();
        int k = sc.nextInt();
        
              int[] arr =  new int[n];
      for(int j=0; j<n; j++){
          arr[j] = sc.nextInt();
      }
       System.out.println(func(arr, n, k));
}
    }
}
