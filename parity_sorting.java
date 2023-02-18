import java.util.*;
public class Main {
public static void func(int N,  int[] arr){
        int[] e = new int[N];
    int idx = 0;
    for (int i = N; i > 0; i--) {
        for (int j = 0; j < i - 1; j++) {
            if (arr[j] > arr[j+1]) {
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            }
        }
    }
    for (int i = 0; i < N; i++) {
        if (arr[i] % 2 == 1) {
            e[idx++] = arr[i];
        }
    }
    for (int i = 0; i < N; i++) {
        if (arr[i] % 2 == 0) {
            e[idx++] = arr[i];
        }
    }
    for (int i = 0; i < N; i++) {
        System.out.print(e[i] + " ");
    }
    
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
