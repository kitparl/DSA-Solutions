
import java.util.*;

public class Main {
public static void func(int r, int c, int[] arr){
}
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rowSize = scanner.nextInt();
        int columnSize = scanner.nextInt();
        int[][] a = new int[rowSize][columnSize];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = scanner.nextInt();
            }
        }
	
	 int res = func(a);
        System.out.println(res);
            }
            
            
             public static int func(int[][] matrix) {
        if (matrix == null || matrix.length == 0) {
            return 0;
        }
        int m = matrix.length;
        int n = matrix[0].length;
        int[][] memo = new int[m][n];
        int[][] directions = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
        int maxPathLength = 1;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                maxPathLength = Math.max(maxPathLength, dfs(matrix, i, j, memo, directions));
            }
        }
        return maxPathLength;
    }
    
    
       private static int dfs(int[][] matrix, int i, int j, int[][] memo, int[][] directions) {
        if (memo[i][j] != 0) {
            return memo[i][j];
        }
        int maxLength = 1;
        for (int[] direction : directions) {
            int x = i + direction[0];
            int y = j + direction[1];
            if (x < 0 || x >= matrix.length || y < 0 || y >= matrix[0].length || matrix[x][y] <= matrix[i][j]) {
                continue;
            }
            int length = dfs(matrix, x, y, memo, directions) + 1;
            maxLength = Math.max(maxLength, length);
        }
        memo[i][j] = maxLength;
        return maxLength;
    }
        }
