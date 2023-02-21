import java.util.*;
import java.lang.*;
import java.io.*;

class Main{

 public static int[] stringToArray(String el) {
        String[] strArray = el.split(" ");
        int[] intArray = new int[strArray.length];
        for (int i = 0; i < strArray.length; i++) {
            intArray[i] = Integer.parseInt(strArray[i]);
        }
        return intArray;
    }

    public static void func(int[][] arr) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            result.append(arr[i][0]).append(" ");
        }

        int j = 0;
        int i = arr.length - 1;

        while (j < arr.length - 1) {
            j++;
            i--;
            result.append(arr[i][j]).append(" ");
        }

        for (int k = 1; k < arr.length; k++) {
            result.append(arr[k][arr.length - 1]).append(" ");
        }

        System.out.println(result.toString());
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
        func(arr);
    }
  }
}

