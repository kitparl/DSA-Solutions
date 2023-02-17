import java.util.*;

public class Main {
public static void rotateBy90(int R, int[][] matrix) {
    for (int i = 0; i < R; i++) {
        StringBuilder bag = new StringBuilder();
        for (int j = 0; j < R; j++) {
            bag.append(matrix[j][R - i - 1]).append(" ");
        }
        System.out.println(bag);
    }
}

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rowSize = scanner.nextInt();
    
        int[][] a = new int[rowSize][rowSize];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = scanner.nextInt();
            }
        }
	rotateBy90(rowSize, a);
            }
        }
