import java.util.*;

public class Main {
public static void func(int n, int m, int[][] arr){
    
        int count = 0;

    for(int i = 0; i < n; i++) {
        for(int j = 0; j < m; j++) {
            int num = arr[i][j];
            int factor = 0;

            for(int k = 1; k <= num; k++) {
                if(num % k == 0) {
                    factor++;
                }
            }

            if(factor == 2) {
                count++;
            }
        }
    }

    System.out.println(count);
    
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

