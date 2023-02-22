// 4  ->  7

import java.util.*;

public class Main {
    static long[] dp;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            dp = new long[n+1];
            System.out.println(getSt(n, 0));
    }

    static long getSt(int n, int s) {
        if (s == n) {
            return 1;
        }
        if (s > n) {
            return 0;
        }
        if (dp[s] != 0) {
            return dp[s];
        }
        dp[s] = getSt(n, s+1) + getSt(n, s+2) + getSt(n, s+3);
        return dp[s];
    }
}
