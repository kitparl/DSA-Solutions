import java.util.*;
import java.util.Scanner;
class Main{
    public static void func(int n ,int[] arr){ 
            Stack<Integer> s = new Stack<Integer>();
    int[] waitDays = new int[n];
    Arrays.fill(waitDays, 0);

    for (int i = 0; i < n; i++) {
        while (!s.empty() && arr[s.peek()] < arr[i]) {
            waitDays[s.peek()] = i - s.peek();
            s.pop();
        }
        s.push(i);
    }

    StringBuilder bag = new StringBuilder();
    for (int i = 0; i < n; i++) {
        bag.append(waitDays[i] + " ");
    }
    System.out.println(bag.toString());
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
