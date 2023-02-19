import java.util.*;
class Main{
    public static void main(String args[]){
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
            traversal(arr, n, m);
            System.out.println();
        } 
    }
    
    public static void traversal(int arr[][], int N, int M){
           int left = 0;
    int right = M-1;
    int top = 0;
    int bottom = N-1;
        
        while(true){
            for(int i=bottom; i>=top; i--){
                System.out.print(arr[i][left]+" ");
            }
            left++;
            if(left>right)
            break;
            for(int i=left; i<=right; i++){
                System.out.print(arr[top][i]+" ");
            }
            top++;
            if(bottom<top)
            break;
              for(int i=top; i<=bottom; i++){
                System.out.print(arr[i][right]+" ");
            }
            right--;
            if(right<left)
            break;
            for(int i=right; i>=left; i--){
                System.out.print(arr[bottom][i]+" ");
            }
            bottom--;
            if(top>bottom)
            break;
        }
    }
}