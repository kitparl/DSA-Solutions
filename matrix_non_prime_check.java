import java.util.*;

class Main{

public static void MPC(int n, int m, int[][] arr){
    int count = 0;
    
    for(int i=0; i<n; i++){
        for(int j=0; j<m; j++){
            int num = arr[i][j];
            
            
    int fact = 0;
    for(int k=1; k<=num; k++){
        if(num%k==0)
            fact++;
        
    }
    if(fact == 2)
       count++;
        }
    }
    System.out.println((n*m)-count);
}
    public static void main(String[] args){
           Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int m = s.nextInt();
        int[][] arr = new int[n][m];
        for (int i=0;i<n;i++){
          for (int j=0;j<m;j++) arr[i][j] = s.nextInt();
        }
        // System.out.print(arr);
        MPC(n,m,arr);
}
}