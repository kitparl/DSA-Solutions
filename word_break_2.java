import java.util.*;
public class Main {
    static int mod = 1000000007;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            String s = sc.next();
            String[] dict = new String[m];
            for (int i = 0; i < m; i++) {
                dict[i] = sc.next();
            }
            int[] dp = new int[n+1];
            dp[0] = 1;
            for (int i = 1; i <= n; i++) {
                for (String word : dict) {
                    if (i >= word.length() && s.substring(i-word.length(), i).equals(word)) {
                        dp[i] = (dp[i] + dp[i-word.length()]) % mod;
                    }
                }
            }
            System.out.println(dp[n]);
        }
    }
}

