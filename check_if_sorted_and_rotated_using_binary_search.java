import java.util.*;

public class Main {

    
    public static void func(int n, int[] arr) {
    int mid = idxpiviot(n, arr);
    boolean flag1 = true;
    for (int i = 0; i < mid - 1; i++) {
        if (arr[i] > arr[i + 1]) {
            flag1 = false;
            break;
        }
    }
    boolean flag2 = true;
    for (int i = mid; i < n - 1; i++) {
        if (arr[i] > arr[i + 1]) {
            flag2 = false;
            break;
        }
    }
    boolean flag = true;
    for (int i = 0; i < n - 1; i++) {
        if (arr[i] > arr[i + 1]) {
            flag = false;
            break;
        }
    }
    if (flag) {
        System.out.println("NO");
    } else if (flag1 && flag2) {
        System.out.println("YES");
    } else {
        System.out.println("NO");
    }
}

public static int idxpiviot(int n, int[] arr) {
    for (int i = 0; i < n - 1; i++) {
        if (arr[i] > arr[i + 1]) {
            return i + 1;
        }
    }
    return 0;
}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        func(n, arr);
    }

}
