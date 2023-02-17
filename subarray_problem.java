//Count Subarrays with Even Sum.

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

        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = scanner.nextInt();
        }
	func(n, a);

}
public static void func(int n,  int[] arr){
        long c = 0;
    int id = 0;
    for(int i=n-1; i>=0; i--){
        if(arr[i]%2 == 1){
            id = n- i - 1 - id;
        }else{
            id+=1;
        }
        c+=id;
    }
    System.out.println(c);
}
}