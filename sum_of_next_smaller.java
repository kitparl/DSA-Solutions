import java.util.*;
import java.util.Scanner;

class Main {
    public static void func(int n, int[] array) {
        Stack<Integer> stack = new Stack<Integer>();
        ArrayList<Integer> next_smaller = new ArrayList<Integer>();

        for (int i = array.length - 1; i >= 0; i--) {
            while (!stack.isEmpty() && stack.peek() >= array[i]) {
                stack.pop();
            }
            if (stack.isEmpty()) {
                next_smaller.add(0);
            } else {
                next_smaller.add(stack.peek());
            }
            stack.push(array[i]);
        }

        int sum = 0;
        for (int i : next_smaller) {
            sum += i;
        }

        System.out.println(sum);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        for (int i = 0; i < tc; i++) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int j = 0; j < n; j++) {
                arr[j] = sc.nextInt();
            }
            func(n, arr);
        }
    }
}
