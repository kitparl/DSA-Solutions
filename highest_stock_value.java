import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        scanner.close();
        
        int maxStockValue = 0;
        int currentStockValue = 0;
        for (int i = 0; i < n; i++) {
            currentStockValue += arr[i];
            if (currentStockValue > maxStockValue) {
                maxStockValue = currentStockValue;
            }
        }
        
        System.out.println(maxStockValue);
    }
}
