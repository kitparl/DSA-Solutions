import java.util.*;
public class Main {
public static void func(int N,  int[] arr){
        Stack<Integer> s = new Stack<Integer>();
    List<Integer> ans = new ArrayList<Integer>();
    List<Integer> ans2 = new ArrayList<Integer>();

    for (int i = N-1; i >= 0; i--) {
        while (s.size() > 0 && arr[i] >= s.peek()) {
            s.pop();
        }
        if (s.size() == 0) {
            ans2.add(arr[i]);
            ans.add(-1);
        } else {
            ans.add(s.peek());
        }
        s.push(arr[i]);
    }
    Collections.reverse(ans2);
    for (int i = 0; i < ans2.size(); i++) {
        System.out.print(ans2.get(i) + " ");
    }
    System.out.println();
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
