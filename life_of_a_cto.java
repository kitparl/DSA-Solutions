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

    public static int func(int n ,int[] arr){  
        int low = 0;
    int high = n - 1;

    while (low <= high) {
        int mid = (low + high) / 2;

        if (arr[mid] == 1 && (mid == 0 || arr[mid - 1] == 0)) {
            return mid;
        } else if (arr[mid] == 1) {
            high = mid - 1;
        } else {
            low = mid + 1;
        }
    }

    return -1;

    }

public static void main(String[] args){
    FastReader sc = new FastReader();

        int n = sc.nextInt();
        
              int[] arr =  new int[n];
      for(int j=0; j<n; j++){
          arr[j] = sc.nextInt();
      }
       System.out.println(func(n,arr));

    }
}