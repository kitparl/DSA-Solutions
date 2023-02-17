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
     FastReader sc = new FastReader();
     int tc = sc.nextInt();
    for(int i = 0; i<tc; i++){
        int n = sc.nextInt();

              int[] arr =  new int[n];
      for(int j=0; j<n; j++){
          arr[j] = sc.nextInt();
      }
       func(n,arr);
}

  }
  
      public static void func(int n,int[] arr){   
          int ans[] = new int[n];
        Stack<Integer> stack = new Stack<>();
    
    int[] h = new int[n];
    for(int i=0; i<n; i++){
        int c = 1;
        while(!stack.isEmpty() && arr[stack.peek()]<= arr[i]){
            c+=h[stack.pop()];
    }
    stack.push(i);
    h[i] = c;
      }
        System.out.println(Arrays.toString(h).replace("[", "").replace("]","").replace(",",""));
  
  
}
}