import java.util.*;
import java.io.*;
import java.util.Scanner;
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
public static void func(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        int[] prefix = new int[n];
        int[] suffix = new int[n];

        prefix[0] = 1;
        suffix[n - 1] = 1;

        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] * nums[i - 1];
        }

        for (int i = n - 2; i >= 0; i--) {
            suffix[i] = suffix[i + 1] * nums[i + 1];
        }

        for (int i = 0; i < n; i++) {
            result[i] = prefix[i] * suffix[i];
        }

        StringBuilder bag = new StringBuilder();
        for(int i=0; i<result.length; i++){
            bag.append(result[i]+" ");
            
        }
        System.out.println(bag);
    }


public static void main(String[] args){
     FastReader sc = new FastReader();
    int tc = sc.nextInt();
    for(int i = 0; i<tc; i++){
        int n = sc.nextInt();
        
              int[] arr =  new int[n];
      for(int j=0; j<n; j++){
          arr[j] = sc.nextInt();
      }
      
       func(arr);
      
}
    }
}

