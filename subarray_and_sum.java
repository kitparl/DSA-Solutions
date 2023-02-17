import java.util.*;
public class Main {
public static void func(int n, int k, int[] arr) {
    int bag = 0;
    for (int i = 0; i < n; i++) {
        bag = bag + arr[i];
    }
    if ((bag % k) != 0) {
        System.out.println(1);
    } else {
        int start = 0;
        while (start < n && arr[start] % k == 0) {
            start++;
        }
        int end = n - 1;
        while (end >= 0 && arr[end] % k == 0) {
            end--;
        }
        int len = 0;
        int s = 0;
        int c = 0;
        if (start == n) {
            System.out.println(-1);
        } else {
            len = Math.max(n - 1 - start, end);
        }

        for (int i = 0; i < len; i++) {
            s += arr[i];
        }

        if (s % k != 0) {
            c++;
        }

        for (int i = len; i < n; i++) {
            s += arr[i];
            s -= arr[i - len];
            if (s % k != 0) {
                c++;
            }
        }
        System.out.println(c);
    }
}


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = scanner.nextInt();
        }
	func(n,k, a);
    }
}
