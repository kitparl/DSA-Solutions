// You are playing the famous Maze Runner Arcade Game. The game contains a maze which has values{'L', 'R', 'U', 'D'}, where L -> indicates that you move left, R -> indicates that you move right


import java.util.*;
import java.io.*;
class Main{
    static class FastReader
  {
    BufferedReader br;
    StringTokenizer st;

    public FastReader()
    {
      br = new BufferedReader(new InputStreamReader(System.in));
    }
    String next()
    {
      while (st == null || !st.hasMoreElements()){
        try { st = new StringTokenizer(br.readLine()); }
        catch (IOException e) { e.printStackTrace(); }
      }
      return st.nextToken();
    }
    int nextInt() { return Integer.parseInt(next()); }
    long nextLong() { return Long.parseLong(next()); }
    double nextDouble(){ return Double.parseDouble(next()); }
    String nextLine(){
      String str = "";
      try { str = br.readLine(); }
      catch (IOException e) { e.printStackTrace(); }
      return str;
    }
  }
  public static void main(String[] args){
     FastReader scanner = new FastReader();
     
    //  int tc = sc.nextInt();
     
  int T = scanner.nextInt();

        for (int i = 0; i < T; i++) {
            int N = scanner.nextInt();
            // scanner.nextLine();
            
            char[][] arr = new char[N][N];
            for (int j = 0; j < N; j++) {
                String row = scanner.nextLine();
                for (int k = 0; k < N; k++) {
                    arr[j][k] = row.charAt(k);
                }
             
         
         
     }
                   System.out.println(func(N, arr));
    }
  }
    
    public static int func(int n, char[][] arr){
        // System.out.println(arr[0]);
        
        
        
        int i = 0;
        int j=0;
        int c = 0;
        
        while(i >= 0 && j>=0 && i< n && j<n){
            
           
            
            if(arr[i][j] == '1'){
                return 0;
            }
            
                        if(arr[i][j] == 'R'){
                            
                arr[i][j] = '1';
                j++;
            }
            
                      else if(arr[i][j] == 'L'){
                arr[i][j] = '1';
                j--;
            }
            
                      else if(arr[i][j] == 'U'){
                arr[i][j]= '1';
                i--;
            }
            
                        else{
                arr[i][j] = '1';
                i++;
            }
            
            c++;
            
            
        }
        
        return c;
    
    }
}