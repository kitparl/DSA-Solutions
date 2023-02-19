import java.util.*;
import java.util.Scanner;
class Main{
    public static void func(int N, int K ,int[] arr){   
        
            int k = K % N;
    int i = 0;
    int j = N - k - 1;
    while (i < j) {
        swap(arr, i, j);
        i++;
        j--;
    }
    i = N - k;
    j = N - 1;
    while (i < j) {
        swap(arr, i, j);
        i++;
        j--;
    }
    StringBuilder bag = new StringBuilder();
    for (int v = N - 1; v >= 0; v--) {
        bag.append(arr[v]).append(" ");
    }
    System.out.println(bag.toString());
        
    }
    
    public static void swap(int[] array, int a, int b) {
    int temp = array[a];
    array[a] = array[b];
    array[b] = temp;
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
       func(n,k,arr);
}
    }
}
