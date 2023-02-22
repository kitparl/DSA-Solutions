import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = input.nextInt();
        }
        int ans = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] >= i + 1) {
                int j = i + 1;
                while (j < n && a[j] >= j + 1) {
                    j++;
                }
                int len = j - i;
                ans += (len * (len + 1)) / 2;
                i = j - 1;
            }
        }
        System.out.println(ans);
    }
}