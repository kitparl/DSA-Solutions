import java.io.*;
import java.util.*;

public class Main {
    public static boolean check(int[] arr, int[] dept, int k) {
        int i = 1;
        int j = 0;
        int count = 1;
        while (i < arr.length && j < dept.length) {
            if (arr[i] <= dept[j]) {
                count++;
                i++;
            } else {
                j++;
                count--;
            }
            if (count > k) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) throws IOException {
        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(is);
        int k = Integer.parseInt(br.readLine());
        String[] a = br.readLine().split(" ");
        String[] b = br.readLine().split(" ");
        int max = 0;
        int min = Integer.MAX_VALUE;
        int[] arrival = new int[a.length];
        int[] departure = new int[b.length];
        for (int i = 0; i < arrival.length; i++) {
            arrival[i] = Integer.parseInt(a[i]);
            min = Math.min(arrival[i], min);
            departure[i] = Integer.parseInt(b[i]);
            max = Math.max(departure[i], max);
        }
        Arrays.sort(arrival);
        Arrays.sort(departure);
        if (check(arrival, departure, k))
            System.out.println("Possible");
        else {
            System.out.println("Not Possible");

        }
    }
}