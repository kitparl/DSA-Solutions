import java.util.*;
public class Main {
public static int firstOrlast(int[] arr, int k, boolean bool) {
    int low = 0;
    int high = arr.length - 1;
    int result = 0;
    while (low <= high) {
        int mid = low + (high - low) / 2;
        if (arr[mid] == k) {
            if (bool) {
                result = mid;
                high = mid - 1;
            } else {
                result = mid;
                low = mid + 1;
            }
        } else if (arr[mid] < k) {
            low = mid + 1;
        } else {
            high = mid - 1;
        }
    }
    return result;
}

public static void func(int n, int k, int[] arr) {
    int first = firstOrlast(arr, k, true);
    int last = firstOrlast(arr, k, false);
    System.out.println((last - first) + 1);
}


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = scanner.nextInt();
        }
	func(n, k , a);
    }
}
