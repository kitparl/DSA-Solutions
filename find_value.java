import java.util.*;
import java.io.*;

class Main {
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }

    public static void main(String[] args) {
        // Write code here
        
        FastReader fr= new FastReader();
        int n= fr.nextInt();
        String str= fr.next();
        String Small="abcdefghijklmnopqrstuvwxyz";
        String big="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
       Map<Character,Integer> map= new HashMap();
       for (int p=0;p<26;p++){
           map.put(Small.charAt(p),p+1);
       }
          for (int m=0;m<26;m++){
           map.put(big.charAt(m),-m-1);
       } 
       int sum=0;
       for (int i=0;i<n;i++){
           Character c= (Character) str.charAt(i);
           sum+=map.get(c);
       }
        
        System.out.println(sum);
    }
}

