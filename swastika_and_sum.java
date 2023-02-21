import java.util.*;

public class Main {
public static void func(int n, int m, int[][] mat){
    int abc = (n+1)/2, xyz = (m+1)/2;
    int s1 = 0, s2 = 0;
    
    for (int i = 0; i < abc; i++) {
        s1 += mat[i][0];
    }
    
    for (int i = 1; i < m; i++) {
        s1 += mat[abc-1][i];
    }
    
    for (int i = abc; i < n; i++) {
        s1 += mat[i][m-1];
    }
    
    for (int i = m-1; i >= xyz-1; i--) {
        s2 += mat[0][i];
    }
    
    for (int i = 1; i < n; i++) {
        s2 += mat[i][xyz-1];
    }
    
    for (int i = xyz-2; i >= 0; i--) {
        s2 += mat[n-1][i];
    }
    
    System.out.println(Math.abs(s1 - s2));
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
	func(rowSize, columnSize, a);
            }
        }
