import java.util.*;
public class Main {
public static void func(int n,  int[] arr){
        int[] ch = new int[arr.length];
    for (int i = 0; i < arr.length; i++) {
        ch[i] = 1;
    }
    for (int i = 1; i < arr.length; i++) {
        for (int j = 0; j < i; j++) {
            if (arr[i] > arr[j]) {
                ch[i] = Math.max(ch[i], ch[j] + 1);
            }
        }
    }
    int max = ch[0];
    for (int i = 1; i < ch.length; i++) {
        if (ch[i] > max) {
            max = ch[i];
        }
    }
    System.out.println(max);
}

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = scanner.nextInt();
        }
	func( n, a);
    }
}
