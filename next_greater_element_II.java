import java.util.*;
import java.util.Scanner;
class Main{
    public static void func(int n ,int[] arr){  
        
        int[] result = new int[n];
        Arrays.fill(result, -1);
        Stack<Integer> stack = new Stack<>();
        
        for(int i=0; i<n*2; i++){
            int num = arr[i%n];
            
            while(!stack.isEmpty() && arr[stack.peek()]< num){
                result[stack.pop()] = num;
            }
            if(i < n){
                stack.push(i);
            }
        }
        
                StringBuilder res = new StringBuilder();
                
                for(int i = 0 ; i<result.length; i++){
                    res.append(result[i]+" ");
                }
                
                
        
        
        System.out.println(res.toString());
        
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