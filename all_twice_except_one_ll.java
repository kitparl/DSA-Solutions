import java.util.*;
import java.io.*;
class Main{
    static class FastReader{
        BufferedReader br;
        StringTokenizer st;
        public FastReader(){
            br = new BufferedReader(new InputStreamReader(System.in));
        }
        String next(){
            while(st == null || !st.hasMoreElements()){
                try{
                    st = new StringTokenizer(br.readLine());}
                    catch(IOException e){e.printStackTrace();}
            }
                return st.nextToken();
        }
        
            int nextInt(){
                return Integer.parseInt(next());}
          
        
    }
    
    public static void main(String args[]){
        FastReader sc = new FastReader();
        
        int tc = sc.nextInt();
        
        while(tc-->0){
        
        int n = sc.nextInt();
        
        int[] arr = new int[2*n - 1];
        
        for(int i=0; i<(2*n)-1; i++){
            arr[i] = sc.nextInt();
        }
        
        int sum = arr[0];
for(int j=1; j<arr.length; j++){
    sum=sum+arr[j];
}
int totalSum = n*(n+1);
System.out.println(totalSum - sum);
    }
    }
}