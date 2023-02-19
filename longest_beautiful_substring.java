import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int k = scanner.nextInt();
            String s = scanner.next();
            int maxLen = 1;
            for (char c = 'a'; c <= 'z'; c++) {
                int cnt = 0;
                int left = 0, right = 0;
                while (right < n) {
                    if (s.charAt(right) != c) {
                        cnt++;
                    }
                    while (cnt > k) {
                        if (s.charAt(left) != c) {
                            cnt--;
                        }
                        left++;
                    }
                    maxLen = Math.max(maxLen, right - left + 1);
                    right++;
                }
            }
            System.out.println(maxLen);
        }
    }
}
