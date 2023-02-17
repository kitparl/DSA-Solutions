import java.util.*;
import java.lang.*;
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

public static void func(int n, char[][] mat) {
    String[] arr = new String[n];
    for(int i=0; i<n; i++) {
        String cont="";
        for(int j=0; j<n; j++) {
            cont = cont + mat[j][i];
        }
        arr[i] = cont;
    }
    boolean s1=true;
    for(int i=0; i<n; i++) {
        if(!Arrays.equals(mat[i], mat[n-1-i])) {
            s1=false;
            break;
        }
    }
    boolean s2=true;
    for(int i=0; i<n; i++) {
        if(!arr[i].equals(arr[n-1-i])) {
            s2=false;
            break;
        }
    }
    if(s1 && s2) {
        System.out.println("YES");
    } else {
        System.out.println("NO");
    }
}


  public static void main(String[] args){
     FastReader scanner = new FastReader();
    int tc=scanner.nextInt();
    for(int p=0;p<tc;p++){
 
            int N = scanner.nextInt();

            char[][] arr = new char[N][N];
            for (int j = 0; j < N; j++) {
                String row = scanner.nextLine();
                for (int k = 0; k < N; k++) {
                    arr[j][k] = row.charAt(k);
                }
             
         
         
     }
                   func(N, arr);
    }
 
}
}
