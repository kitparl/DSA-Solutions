// 1
// 4 3
// 1 10 9
// 2 11 8
// 3 12 7
// 4 5 6 

// 1 2 3 4 5 6 7 8 9 10 11 12 


import java.util.*;

class Main{
    public static void tra(int n, int m, int[][] arr){
        // System.out.println(n);
        int t = 0, l = 0;
        int d = n-1; int r = m-1;
        
        while(true){
            for(int i=t; i<=d; i++){
                System.out.print(arr[i][l]+" ");
            }
            l++;
            if(l>r)
                break;
                for(int i=l; i<=r; i++){
                    System.out.print(arr[d][i]+" ");
                }
                d--;
                if(d<t)
                    break;
                for(int i=d; i>=t; i--){
                        System.out.print(arr[i][r]+" ");
                    }
                r--;
                if(r<l)
                    break;
                for(int i=r; i>=l; i--){
                    System.out.print(arr[t][i]+" ");
                }
                t++;
                if(t>d)
                    break;
                
            }
        
        }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-->0){
            int n = sc.nextInt();
            int m = sc.nextInt();
            
            int arr[][] = new int[n][m];
            
            for(int i=0; i<n; i++){
                for(int j=0; j<m; j++){
                    arr[i][j] = sc.nextInt();
                }
            }
            tra(n,m,arr);
            System.out.println();
        }
    }
}