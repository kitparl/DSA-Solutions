import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt(); 
        while (t-- > 0) {
            int n = scanner.nextInt(); 
            int x = scanner.nextInt(); 
            int[] heights = new int[2 * n];
            for (int i = 0; i < 2 * n; i++) {
                heights[i] = scanner.nextInt();
            }
            Arrays.sort(heights); 
            boolean possible = true;
            for (int i = 0; i < n; i++) {
                if (heights[i + n] - heights[i] < x) { 
                    possible = false;
                    break;
                }
            }
            System.out.println(possible ? "YES" : "NO");
        }
        scanner.close();
    }
}
