import java.util.*;
import java.lang.*;
import java.io.*;

class Main{

  public static void func(int N, int[][] arr){
    for (int i = 0; i < arr[0].length; i++) {
        String result = "";
        for (int j = 0; j < arr.length; j++) {
            result += arr[j][i] + " ";
        }
        System.out.println(result);
    }
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

