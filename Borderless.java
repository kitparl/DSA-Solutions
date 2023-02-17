import java.util.*;

public class Main {
public static void func(int N, int M, int[][] matrix){
        int sum1 = 0;
    for (int i = 1; i < N - 1; i++) {
        for (int j = 1; j < M - 1; j++) {
            sum1 += matrix[i][j];
        }
    }
    System.out.println(sum1);
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
