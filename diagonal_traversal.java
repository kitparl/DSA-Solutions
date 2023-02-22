import java.util.*;
import java.lang.*;
import java.io.*;
class Main{
 public static void func(int n,int[][] arr){


int i=0; int j = 0;

    boolean flag = true;
    
    for(int x=0; x<n*n;){
        if(flag){
            for(; i >= 0 && j < n; j++, i--){
                System.out.print(arr[i][j] + " ");
                x++;
            }
            
            if(i<0 && j<= n - 1){
                i = 0;
            }
            if(j == n){
                i = i+2;
                j--;
            }
        }else{
            
             for(; j >= 0 && i < n; j--, i++){
                System.out.print(arr[i][j] + " ");
                x++;
            }
                        if(j<0 && i<= n - 1){
                j = 0;
            }
            if(i == n){
                j = j+2;
                i--;
            }
            
            
        }
        
        flag = !flag;
        
        
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
 System.out.println();
 }
 }
}