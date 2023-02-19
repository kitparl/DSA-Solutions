import java.util.Arrays;
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
     
     String str = scanner.nextLine();
                   if(func(arr, str)){
                       System.out.println("Yes");
                   }else{
                       System.out.println("No");
                   }
    }
  }
  
  public static char[] stringToArray(String el) {
    return el.toCharArray();
}
    
    public static boolean func(char[][] arr, String s){
        
    for (int i = 0; i < s.length(); i++) {
        int index = new String(arr[i % arr.length]).indexOf(s.charAt(i));
        if (index == -1) {
            return false;
        } else {
            char[] row = arr[i % arr.length];
            char[] newRow = new char[row.length - 1];
            int k = 0;
            for (int j = 0; j < row.length; j++) {
                if (j != index) {
                    newRow[k] = row[j];
                    k++;
                }
            }
            arr[i % arr.length] = newRow;
        }
    }
    return true;
}
}