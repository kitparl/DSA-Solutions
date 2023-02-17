import java.util.*;
import java.util.Scanner;
class Main{
    public static void func(int n ,int[] a, int[] b){    
            int i = 0, j = n - 1;
    int count = 0;
    while (i < n && j >= 0) {
        if (a[i] == b[j]) {
            count++;
            i++;
            j--;
        } else if (a[i] > b[j]) {
            j--;
        } else {
            i++;
        }
    }
    System.out.println(count);
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
      
                    int[] arr2 =  new int[n];
      for(int k=0; k<n; k++){
          arr2[k] = sc.nextInt();
      }
       func(n,arr, arr2);
}
    }
}
