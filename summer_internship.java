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
  
      public static void func(int n,int[] bills){    
        
        int five = 0; int ten = 0; boolean flag = true;
        for(int i=0; i<n; i++){
            if(bills[i] == 5){
                five++;
            }
            else if(bills[i] == 10){
                if(five > 0){
                    five--;
                    ten++;
                }else{
                    flag = false;
                    break;
                }
            }else{
                if(ten> 0 && five > 0){
                   ten--;
                   five--;
                }else if(five >= 3){
                    five -= 3;
                    
                }else{
                    flag = false;
                    break;
                }
            }
        }
        if(flag){
            System.out.println("YES");
        }else{
           System.out.println("NO");  
        }
        
    }
  
  
}