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
     FastReader s = new FastReader();
    // Scanner s = new Scanner(System.in);
    
     
    int t = s.nextInt();
    for(int i = 0; i < t; i++) {
        int n = s.nextInt();
        // s.nextLine();
     String str = s.nextLine();
      func(str);
    }
  }
  public static void func(String str){

      String s1 = "wish";
      int c = 0;
      int f = 0;
      for(int i=0; i<=str.length()-s1.length(); i++){
          if(str.charAt(i) == s1.charAt(0)){
              f = 0;
              for(int j=1; j<s1.length(); j++){
                  if(str.charAt(i+j) != s1.charAt(j)){
                      f = 1;
                      break;
                  }
              }
              if(f == 0){
                  c = c+1;
              }
          }
      }
      System.out.println(c);
      
}
}