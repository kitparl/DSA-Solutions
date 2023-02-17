import java.util.*;
public class Main {
public static void func(int n,  int[] arr){
        int[] ans = new int[n];
    Stack<Integer> stack = new Stack<Integer>();
    for(int i=0; i<n; i++) {
        while(!stack.empty() && arr[i] <= stack.peek()) {
            stack.pop();
        }
        if(stack.empty()) {
            ans[i] = -1;
        } else {
            ans[i] = stack.peek();
        }
        stack.push(arr[i]);
    }
    System.out.println(Arrays.toString(ans).replaceAll("[\\[\\],]", ""));
}

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = scanner.nextInt();
        }
	func( n, a);
    }
}
