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
        int left = 0; int rick = arr[0];
        int right = n-1; int richard = arr[n-1];
        
        int x = 1; int y = 1;
        
        while(right-left != 1){
            if(rick<= richard*2){
                left++;
                rick+=arr[left];
                x++;
            }else{
                right--;
                richard+=arr[right];
                y++;
            }
        }
        
        System.out.println(x+" "+y);
    }
  
  
}