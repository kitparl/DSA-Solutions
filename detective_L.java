import java.util.*;
import java.lang.*;
import java.io.*;

class Main{

  public static void func(int rows,int columns,int[][] mat){
    int C = 0;
    int B = rows - 1;
    int R = 0;
    String bag = "";
    int count = 0;
    int total = rows * columns;
    
    while (R < rows) {
        for (int i = 0; i < rows - R && count < total; i++) {
            bag += mat[i][C] + " ";
            count++;
        }
        R++;
        C++;
        for (int j = R; j < columns && count < total; j++) {
            bag += mat[B][j] + " ";
            count++;
        }
        B--;
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
