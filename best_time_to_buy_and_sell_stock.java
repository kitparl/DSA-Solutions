import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int n = scanner.nextInt();
            int[] prices = new int[n];

            for (int i = 0; i < n; i++) {
                prices[i] = scanner.nextInt();
            }

            int maxProfit = 0;
            int minPrice = Integer.MAX_VALUE;

            for (int i = 0; i < n; i++) {
                if (prices[i] < minPrice) {
                    minPrice = prices[i];
                } else if (prices[i] - minPrice > maxProfit) {
                    maxProfit = prices[i] - minPrice;
                }
            }

            System.out.println(maxProfit);
        }

        scanner.close();
    }
}
