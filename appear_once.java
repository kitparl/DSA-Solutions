import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        appearOnce(n, arr);
    }

    public static void appearOnce(int n, int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (map.containsKey(arr[i])) {
                int a = map.get(arr[i]);
                map.put(arr[i], a + 1);
            } else {
                map.put(arr[i], 1);
            }
        }
        int sum = 0;
        for (int data : map.keySet()) {
            if (map.get(data) == 1) {
                sum += data;
            }
        }
        System.out.println(sum);
    }
}