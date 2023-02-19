import java.util.*;
import java.util.Scanner;
class Main{
    public static void func(int n ,int[] arr){     
 int minNum = arr[0];
    int minNumberIndex = 0;
    for (int i = 1; i < arr.length; i++) {
        if (arr[i] < minNum) {
            minNum = arr[i];
            minNumberIndex = i;
        }
    }

    int maxProfit = 0;
    for (int i = minNumberIndex; i < arr.length; i++) {
        if (arr[i] - minNum > maxProfit) {
            maxProfit = arr[i] - minNum;
        }
    }
    System.out.println(maxProfit);
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
       func(n,arr);
}
    }
}

