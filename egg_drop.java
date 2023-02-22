///////////////////////////only 3 tc passed
import java.util.*;

public class Main {

    static int[][] dp;

    static int solve(int i, int j) {
        if (dp[i][j] != -1) {
            return dp[i][j];
        }
        if (i == 0) {
            dp[i][j] = 0;
        } else if (j == 0) {
            dp[i][j] = 0;
        } else if (j == 1) {
            dp[i][j] = 1;
        } else {
            int minTrials = Integer.MAX_VALUE;
            for (int k = 1; k <= j; k++) {
                int trials = 1 + Math.max(solve(i - 1, k - 1), solve(i, j - k));
                minTrials = Math.min(minTrials, trials);
            }
            dp[i][j] = minTrials;
        }
        return dp[i][j];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int N = sc.nextInt();
            int K = sc.nextInt();
            dp = new int[K + 1][N + 1];
            for (int i = 0; i <= K; i++) {
                Arrays.fill(dp[i], -1);
            }
            System.out.println(solve(K, N));
        }
    }
}

