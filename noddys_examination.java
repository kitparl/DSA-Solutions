import java.util.*;
public class Main {
public static void func(int[] data, int dlevel){
        int count1 = 0;
    int count2 = 0;
    for (int i = 0; i < data.length; i++) {
        if (data[i] <= dlevel) {
            count1++;
        } else if (data[i] > dlevel) {
            count2++;
        }
        if (count2 == 2) {
            System.out.println(count1);
            break;
        } else if (count1 == data.length) {
            System.out.println(count1);
        }
    }
}

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = scanner.nextInt();
        }
	func(a, k);
    }
}
