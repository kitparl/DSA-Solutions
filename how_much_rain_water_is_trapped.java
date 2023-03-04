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

 public static void func(int n ,int[] arr){ 
    
    Stack<Integer> stk = new Stack<>();
    int ans = 0;
    
    for(int i=0 ; i<n; i++){
        while(!stk.isEmpty() && (arr[stk.peek()] < arr[i])){
            int p = arr[stk.peek()];
            stk.pop();
        
        
        if(stk.isEmpty()){
            break;
        }
        int dis = i - stk.peek() - 1;
        
        int m = Math.min(arr[stk.peek()], arr[i]) - p;
        
        ans+= dis * m;
    }
    stk.push(i);
    }
    System.out.println(ans);
 }
public static void main(String[] args){
//  Scanner sc = new Scanner(System.in);
FastReader sc = new FastReader();
 int tc = sc.nextInt();
 for(int i = 0; i<tc; i++){
 int n = sc.nextInt();
 
 int[] arr = new int[n];
 for(int j=0; j<n; j++){
 arr[j] = sc.nextInt();
 }
 func(n,arr);
}
 }
}