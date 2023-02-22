///////////////// 3 test cases fail 

import java.util.*;
public class Main {
public static String func(int[] arr, int c, int r) {
    int count = 0;
    for (int i = 0; i < arr.length; i++) {
        if (r >= arr[i]) {
            r -= arr[i];
            count++;
        } else break;
    }
    if (count >= c) return "No Party";
    else return "Party";
}


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] a = new int[n];
        
        for (int i = 0; i < a.length; i++) {
            a[i] = scanner.nextInt();
        }
	System.out.println(func( a, n, k));
    }
}
