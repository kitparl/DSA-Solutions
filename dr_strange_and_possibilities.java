import java.util.*;
public class Main {
public static void func(int n) {
    int[] arr = new int[n];
    for (int i = 1; i <= n; i++) {
        arr[i-1] = i;
    }

    List<Integer> newarr = new ArrayList<>();
    possible(arr, newarr, 0);
}

public static void possible(int[] arr, List<Integer> newarr, int position) {
    if (newarr.size() > 0) {
        String bag = "";
        for (int i = 0; i < newarr.size(); i++) {
            bag += newarr.get(i) + " ";
        }
        System.out.println(bag);
    }

    if (position == arr.length) {
        return;
    }
    else {
        for (int j = position; j < arr.length; j++) {
            newarr.add(arr[j]);
            possible(arr, newarr, j + 1);
            newarr.remove(newarr.size() - 1);
        }
    }
}

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println();
        func(n);
    }
}
