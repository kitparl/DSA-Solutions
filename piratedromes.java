import java.util.*;
import java.io.*;

public class Main {
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

    public static void Piratedromes(int N) {
        List<Integer> arr = new ArrayList<>();
        String y = "1";
        String x = "1";
        for (int i = 0; i < N; i++) {
            y += "0";
            if (i != N - 1) {
                x += "0";
            }
        }

        for (int i = Integer.parseInt(x); i <= Integer.parseInt(y); i++) {
            String temp = String.valueOf(i);
            int s = 0;
            int s2 = 0;
            for (int j = 0; j < temp.length(); j++) {
                if ((j + 1) % 2 == 0) {
                    s += Integer.parseInt(String.valueOf(temp.charAt(j)));
                } else {
                    s2 += Integer.parseInt(String.valueOf(temp.charAt(j)));
                }
            }
            if (s == s2) {
                arr.add(i);
            }
        }
        System.out.println(String.join(" ", arr.toString()).replace(",","").replace("[","").replace("]","") );
    }

    public static void main(String[] args) {
        // Scanner scanner = new Scanner(System.in);
        FastReader scanner = new FastReader();
        int N = scanner.nextInt();
        Piratedromes(N);
    }
}