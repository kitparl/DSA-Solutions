import java.util.*;
import java.lang.*;
import java.io.*;

class Main{

  public static void func(int rows,int columns,int[][] mat){

        StringBuilder bag = new StringBuilder();
    for (int i = 0; i < rows; i++) {
        int max = Integer.MIN_VALUE;
        for (int j = 0; j < columns; j++) {
            int sum = mat[i][j];
            if (sum > max) {
                max = sum;
            }
        }
        bag.append(max).append(" ");
    }
    System.out.println(bag);
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
        func(n,m,arr);
    }
  }
}
