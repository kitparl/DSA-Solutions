import java.util.*;
import java.lang.*;
import java.io.*;
class Main{
 public static int func(int n,int[][] arr){

// System.out.println(arr[0][0])
    int c = 0;
    for(int i = 1; i<n; i++){
    if(arr[c][i] == 1){
        c = i;
    }
    }

for(int i = 0; i<n; i++){
    if( i == c){
        continue;
    }
    
    if(arr[i][c] == 0 || arr[c][i] == 1){
        return -1;
    }
}

return c;
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
 System.out.println(func(n,arr));
 }
 }
}