import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] fruits = new String[n];
        for (int i = 0; i < n; i++) {
            fruits[i] = sc.next();
        }
        boolean isSingleType = true;
        for (int i = 0; i < n - 1; i++) {
            if (!fruits[i].equals(fruits[i + 1])) {
                isSingleType = false;
                break;
            }
        }
        if (isSingleType) {
            System.out.println("Single Type");
        } else {
            System.out.println("Mixed Basket");
        }
    }
}
