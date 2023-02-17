import java.util.*;
import java.util.Scanner;

class Main {
    public static void func(int N, int k, int[] arr) {
        for (int i = 0; i < N; i++) {
            int min = i;
            for (int j = i + 1; j < N; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            if (i != min) {
                int temp = arr[i];
                arr[i] = arr[min];
                arr[min] = temp;
            }
        }
        int s1 = 0, s2 = 0;
        for (int i = 0, j = N - 1; i < k && j >= N - k; i++, j--) {
            s1 += arr[i];
            s2 += arr[j];
        }
        System.out.println(s2 - s1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        for (int i = 0; i < tc; i++) {
            int n = sc.nextInt();
            int k = sc.nextInt();

            int[] arr = new int[n];
            for (int j = 0; j < n; j++) {
                arr[j] = sc.nextInt();
            }
            func(n, k, arr);
        }
    }
}
