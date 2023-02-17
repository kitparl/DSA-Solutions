import java.util.*;
public class Main {
public static void func(int n,  int[] arr){
    int left = 1;
    for (int i = 1; i < n; i++) {
        if (arr[left - 1] <= arr[i]) {
            arr[left] = arr[i];
            left++;
        }
    }
    StringBuilder bag = new StringBuilder();
    for (int i = 0; i < left; i++) {
        bag.append(arr[i]).append(" ");
    }
    System.out.println(bag.toString());
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
