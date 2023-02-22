///////////////////////// 8 tc passed
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int m = sc.nextInt();
        int t = sc.nextInt();
        
        int[][] a = new int[n][m];
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        
        int[][] dp = new int[n + 1][t + 1];
        
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= t; j++) {
                dp[i][j] = dp[i - 1][j];
                for (int k = 1; k <= j; k++) {
                    dp[i][j] = Math.max(dp[i][j], dp[i - 1][j - k] + a[i - 1][k - 1]);
                }
            }
        }
        
        System.out.println(dp[n][t]);
        
        sc.close();
    }
}