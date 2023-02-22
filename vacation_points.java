import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] happiness = new int[n][3];
        for (int i = 0; i < n; i++) {
            happiness[i][0] = scanner.nextInt();
            happiness[i][1] = scanner.nextInt();
            happiness[i][2] = scanner.nextInt();
        }
        System.out.println(getMaxHappiness(happiness));
    }

    private static int getMaxHappiness(int[][] happiness) {
        int n = happiness.length;
        int[][] dp = new int[n][3];
        dp[0][0] = happiness[0][0];
        dp[0][1] = happiness[0][1];
        dp[0][2] = happiness[0][2];
        for (int i = 1; i < n; i++) {
            dp[i][0] = happiness[i][0] + Math.max(dp[i - 1][1], dp[i - 1][2]);
            dp[i][1] = happiness[i][1] + Math.max(dp[i - 1][0], dp[i - 1][2]);
            dp[i][2] = happiness[i][2] + Math.max(dp[i - 1][0], dp[i - 1][1]);
        }
        return Math.max(dp[n - 1][0], Math.max(dp[n - 1][1], dp[n - 1][2]));
    }
}
