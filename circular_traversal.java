import java.util.*;
import java.lang.*;
import java.io.*;

class Main{

  public static void func(int N,int[][] matrix){
        StringBuilder bag = new StringBuilder();
    for (int i = N - 1; i >= 0; i--) {
        bag.append(matrix[i][0]).append(" ");
    }
    for (int i = 1; i < N; i++) {
        bag.append(matrix[0][i]).append(" ");
    }
    for (int i = 1; i < N; i++) {
        bag.append(matrix[i][N - 1]).append(" ");
    }
    for (int i = N - 2; i >= 1; i--) {
        bag.append(matrix[N - 1][i]).append(" ");
    }
    System.out.println(bag);
  }

  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    int tc=s.nextInt();
    for(int p=0;p<tc;p++){
        int n = s.nextInt();

        int[][] arr = new int[n][n];
        for (int i=0;i<n;i++){
          for (int j=0;j<n;j++) arr[i][j] = s.nextInt();
        }
        func(n,arr);
    }
  }
}
