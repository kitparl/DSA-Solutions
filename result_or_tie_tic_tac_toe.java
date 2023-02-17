import java.util.*;
import java.lang.*;
import java.io.*;

class Main{

  public static void fu(char[][] arr){
    int n = 3;
    int m = 3;
    int c1 = 0;
    int c2 = 0;
    
    for(int i=0; i<n; i++){
        for(int j=0; j<m; j++){
            if(arr[i][j] == 'x'){
                c1++;
            }else if(arr[i][j] == 'o'){
                c2++;
            }
            else{
                System.out.println("Tie");
            }
        }
    }
    if(c1>c2){
        System.out.println('x');
    }else{
            System.out.println('o');  
    }
  }

  public static void main(String[] args){
    Scanner s = new Scanner(System.in);

        char[][] arr = new char[3][3];
        for (int i=0;i<3;i++){
          for (int j=0;j<3;j++) arr[i][j] = s.next().charAt(0);
        }
        fu(arr);
    }
  }