import java.util.*;
public class Main {
public static void func(int N, int[] A) {
    int sum = 0;
    for (int i = 0; i < N - 1; i++) {
        for (int j = 0; j < N; j++) {
            if (isPrime(j - i)) {
                sum = sum + Math.abs(A[i] - A[j]);
            }
        }
    }
    System.out.println(sum);
}

public static boolean isPrime(int n) {
    if (n <= 1) {
        return false;
    }
    for (int i = 2; i <= Math.sqrt(n); i++) {
        if (n % i == 0) {
            return false;
        }
    }
    return true;
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
