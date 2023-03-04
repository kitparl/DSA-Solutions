import java.util.*;
import java.lang.*;
import java.io.*;
class Main{
    
    public static void merge(int i, int j, int[][] arr){
        
        int n = arr[0].length;
         int m = arr.length;
       
       if(i < 0 || i>=m || j< 0 || j>= n || arr[i][j] != 1){
           return;
       }
       arr[i][j] = 0;
       
       merge(i-1, j, arr);
       merge( i+1, j, arr);
       merge( i, j-1, arr);
       merge( i, j+1, arr);
        
    } 
    
    
    
 public static int func(int n,int m,int[][] arr){

//  System.out.println(N);
if(arr == null || m == 0 || n == 0){
    return 0;
}

int c = 0;
for(int i=0; i<n; i++){
for(int j = 0; j<m; j++){
    if(arr[i][j] == 1){
        c++;
        merge(i, j, arr);
    }
}
 }
 
 return c;
 
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
 System.out.println(func(n,m,arr));
 }
 }
}