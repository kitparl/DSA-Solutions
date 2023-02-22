import java.util.*;
public class Main {
public static void func(int n,  int[] arr){
      int initialMoney = arr[0];
    int finalMoney = initialMoney;

    for (int i = 1; i < arr.length; i++) {
        if (arr[i] >= initialMoney) {
            finalMoney += initialMoney;
        } else if (arr[i] < initialMoney) {
            initialMoney = arr[i];
            finalMoney += initialMoney;
        }
    }

    System.out.println(finalMoney);
}

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = scanner.nextInt();
        }
	func(n, a);
    }
}

