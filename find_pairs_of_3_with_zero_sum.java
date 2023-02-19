import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
            }
            Arrays.sort(arr);
            int count = 0;
            List<String> pairs = new ArrayList<String>();
            for (int i = 0; i < n - 2; i++) {
                if (i > 0 && arr[i] == arr[i - 1]) {
                    continue;
                }
                int left = i + 1, right = n - 1;
                while (left < right) {
                    int sum = arr[i] + arr[left] + arr[right];
                    if (sum == 0) {
                        String pair = arr[i] + " " + arr[left] + " " + arr[right];
                        if (!pairs.contains(pair)) {
                            pairs.add(pair);
                            count++;
                        }
                        left++;
                        right--;
                        while (left < right && arr[left] == arr[left - 1]) {
                            left++;
                        }
                        while (left < right && arr[right] == arr[right + 1]) {
                            right--;
                        }
                    } else if (sum < 0) {
                        left++;
                    } else {
                        right--;
                    }
                }
            }
            System.out.println(count);
            for (String pair : pairs) {
                System.out.println(pair);
            }
        }
    }
}
