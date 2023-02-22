import java.io.*;
import java.util.*;
import java.lang.*;
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

    public static boolean check(String str){
        String a = "aeiou";
        String A = "AEIOU";
        
        return a.contains(str) || A.contains(str);
    }
 public static void func(String str){
    
    String[] arr = str.split(" ");
    int c = 1;
    
    for(int i = 0; i<arr.length; i++){
        
        if(check(arr[i].substring(0,1))){
            arr[i]+="ma";
            for(int j=0; j<c; j++){
                arr[i]+="a";
            }
            c++;
            System.out.print(arr[i]+" ");
        }
        else{
            arr[i] = arr[i].substring(1)+arr[i].charAt(0)+"ma";
            for(int j = 0; j<c; j++){
                arr[i] += "a";
            }
            c++;
            System.out.print(arr[i]+" ");
        }
    }
 System.out.println();
 }
 public static void main(String[] args){
//  Scanner s = new Scanner(System.in);
FastReader s = new FastReader();
 int t = s.nextInt();
 String str;
 for(int i = 0; i < t; i++) {
    //  s.nextLine();
 str = s.nextLine();
 func(str);
 
 }
 }
}