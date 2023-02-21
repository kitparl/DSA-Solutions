import java.util.*;
import java.util.Scanner;
class Main{
    public static int func(int k ,int[] arr){  
            int ans = -1;
    int low = 0;
    int high = arr.length - 1;
    while (low <= high) {
        int mid = low + (high - low) / 2;
        if (arr[mid] == k) {
            ans = mid;
            high = mid - 1;
        } else if (arr[mid] < k)
            low = mid + 1;
        else
            high = mid - 1;
    }
    return ans;
    }

public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        
              int[] arr =  new int[n];
      for(int j=0; j<n; j++){
          arr[j] = sc.nextInt();
      }
       System.out.println(func(k,arr));

    }
}
