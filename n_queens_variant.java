import java.util.*;

public class Main {

    public static void func(int N) {
        int[][] board = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                board[i][j] = 0;
            }
        }
        int[] count = {0};
        queen(N, board, 0, count);
        System.out.println(count[0]);
    }

    public static boolean isSafe(int[][] board, int row, int col) {
        for (int i = 0; i < col; i++) {
            if (board[row][i] == 1) {
                return false;
            }
        }
        int i = row;
        int j = col;
        while (i >= 0 && j >= 0) {
            if (board[i][j] == 1) {
                return false;
            }
            i--;
            j--;
        }
        i = row;
        j = col;
        while (i < board.length && j >= 0) {
            if (board[i][j] == 1) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static void queen(int N, int[][] board, int col, int[] count) {
        if (col == N) {
            count[0]++;
        } else {
            for (int i = 0; i < N; i++) {
                if (isSafe(board, i, col)) {
                    board[i][col] = 1;
                    queen(N, board, col + 1, count);
                    board[i][col] = 0;
                }
            }
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        func(n);
    }
}


