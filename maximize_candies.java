////////////////////////////// only 5 tc passed

import java.util.*;

public class Main {
    
    static int[][] dirs = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); 
        int m = scanner.nextInt(); 
        int[][] mat = new int[n][m]; 
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                mat[i][j] = scanner.nextInt();
            }
        }
        int[] bob = {scanner.nextInt(), scanner.nextInt()};
        int[] shop = {scanner.nextInt(), scanner.nextInt()}; 
        int maxCandies = findMaxCandies(mat, bob, shop); 
        System.out.println(maxCandies);
    }
    
    public static int findMaxCandies(int[][] mat, int[] bob, int[] shop) {
        int n = mat.length;
        int m = mat[0].length;
        boolean[][] visited = new boolean[n][m]; 
        visited[bob[0]][bob[1]] = true; 
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(bob); 
        int candies = 0; 
        boolean foundShop = false; 
        while (!queue.isEmpty() && !foundShop) {
            int size = queue.size(); 
            for (int i = 0; i < size; i++) {
                int[] curr = queue.poll(); 
                for (int[] dir : dirs) {
                    int x = curr[0] + dir[0];
                    int y = curr[1] + dir[1];
                    if (x >= 0 && x < n && y >= 0 && y < m && !visited[x][y] && mat[x][y] == 1) {
                      
                        visited[x][y] = true; 
                        queue.offer(new int[]{x, y}); 
                        if (x == shop[0] && y == shop[1]) {
                            foundShop = true; 
                            break;
                        }
                        candies++; 
                    }
                }
            }
        }
        if (!foundShop) {
            return -1;
        }
        return candies;
    }
}
