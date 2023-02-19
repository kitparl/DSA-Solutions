
// partial accepted in java 4 tc fails


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
public static int findWood(int[] arr, int blade) {
    int sum = 0;
    for (int i = 0; i < arr.length; i++) {
        if (arr[i] > blade) sum += arr[i] - blade;
    }
    return sum;
}

public static int solve(int[] arr, int key) {
    int ans = -1;
    int low = 0;
    int high = 0;
    for (int i = 0; i < arr.length; i++) high = Math.max(high, arr[i]);

    while (low <= high) {
        int mid = low + (high - low) / 2;
        int amount = findWood(arr, mid);
        if (amount == key) return mid;
        else if (amount > key) {
            ans = mid;
            low = mid + 1;
        } else high = mid - 1;
    }
    return ans;
}


    public static void main(String[] args) {
        // Scanner scanner = new Scanner(System.in);
        FastReader scanner = new FastReader();
        int n = scanner.nextInt();
                int k = scanner.nextInt();

        
        int[] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = scanner.nextInt();
        }
	System.out.println(solve(a, k));
    }
}


/*
this js code is passed 


  function findWood(arr, blade) {
    let sum = 0;
    for (let i = 0; i < arr.length; i++) {
        if (arr[i] > blade) sum += arr[i] - blade;
    }
    return sum;
}

function solve(arr, key) {
    let ans = -1;
    let low = 0;
    let high = 0;
    for (let i = 0; i < arr.length; i++) high = Math.max(high, arr[i]);

    while (low <= high) {
        let mid = low + Math.floor((high - low) / 2);
        let amount = findWood(arr, mid);
        if (amount === key) return mid;
        else if (amount > key) {
            ans = mid;
            low = mid + 1;
        } else high = mid - 1;
    }
    return ans;
}
 */