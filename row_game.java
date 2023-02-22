import java.util.*;
import java.lang.*;
import java.io.*;

class Main{

public static int func(int[][] arr) {
   Set<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                set.add(arr[i][j]);
            }
        }

        for (int i = 1; i < arr.length; i++) {
            Set<Integer> temp = new HashSet<Integer>();
            for (int j = 0; j < arr[i].length; j++) {
                if (set.contains(arr[i][j])) {
                    temp.add(arr[i][j]);
                }
            }
            set = temp;
        }

        return set.size();
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
        System.out.println(func(arr));
    }
  }
}

