import java.util.*;
import java.lang.*;
import java.io.*;

class Main{

public static void func(int[][] board, int row, int col) {
 int[] result = board[0];
    for (int i = 1; i < row; i++) {
        int[] temp = new int[col];
        for (int j = 0; j < col; j++) {
            if (j == 0) {
                temp[j] = board[i][j] + Math.max(result[j], result[1]);
            } else if (j == col - 1) {
                temp[j] = board[i][j] + Math.max(result[j], result[j - 1]);
            } else {
                temp[j] = board[i][j] + Math.max(result[j], Math.max(result[j - 1], result[j + 1]));
            }
        }
        result = temp;
    }
    int max = 0;
    for (int i = 0; i < result.length; i++) {
        max = Math.max(max, result[i]);
    }
    System.out.println(max);
}

  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    int tc=s.nextInt();
    for(int p=0;p<tc;p++){
        int n = s.nextInt();
        int m = s.nextInt();
        int[][] arr = new int[n][m];
        for (int i=0;i<n;i++){
          for (int j=0;j<m;j++) arr[i][j] = s.nextInt();
        }
        func(arr,n,m);
    }
  }
}

