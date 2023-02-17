import java.util.*;
import java.util.Scanner;
class Main{
    public static void func(int size, int qty ,int[] arr){    
            List<Integer> que = new ArrayList<Integer>();
    for (int x = 0; x <= size - qty; x++) {
        int max = Integer.MIN_VALUE;
        for (int y = x; y < qty + x; y++) {
            if (arr[y] > max) {
                max = arr[y];
            }
        }
        que.add(max);
    }
    System.out.println(String.join(" ", que.stream().map(String::valueOf).toArray(String[]::new)));
        
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

