// package Plus one;


import java.util.*;
import java.io.*;
class Main
{
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
  public static void main(String[] args)
  {
     FastReader sc = new FastReader();
     
     int tc= sc.nextInt();
     while(tc--!=0)
     {
         int n = sc.nextInt();
         int arr[] = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
	     //System.out.println(Arrays.toString(arr));
         int[] x = Jio(n,arr);
        //  System.out.println(Arrays.toString(x));
         
         String s = "";
         for(int k=0;k<x.length;k++)
         {
              System.out.print(x[k]+" ");
         }
         System.out.println();
         
        
         
     }


  }
  
  public static int[] Jio(int n, int arr[])
  {
    
    for(int i=n-1; i>=0; i--) 
    {
        if(arr[i] < 9) 
        {
            arr[i]++;
            return arr;
        }
        
        arr[i] = 0;
    }
    
    int[] newArr = new int[n+1];
    
    newArr[0] = 1;
    
    return newArr;

  }
}

