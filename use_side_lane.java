import java.util.*;
public class Main {
public static void func(int n,  int[] arr){
    Stack<Integer> stk = new Stack<>();
    int j = 1;
    
    for(int i=0; i<n; i++){
        stk.push(arr[i]);
        
        while(!stk.isEmpty() && j<=n && stk.peek() == j){
            stk.pop();
            j++;
}

}
    if(stk.isEmpty()){
        System.out.println("yes");
    }else{
        System.out.println("no");        
    }

}

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true){
        int n = scanner.nextInt();
        if(n == 0) break;
        int[] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = scanner.nextInt();
        }
        func(n, a);
        }
    }
}