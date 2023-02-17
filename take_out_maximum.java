import java.util.*;
public class Main {
public static void func(int n,int k,  int[] arr){
        int wSum = 0;
    int maxSum = 0;
    int start = 0;
    int end = 0;

    while (end < k) {
        wSum += arr[end++];
    }

    while (end < n) {
        wSum += arr[end++] - arr[start++];
        maxSum = Math.max(maxSum, wSum);
    }

    System.out.println(maxSum);
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
