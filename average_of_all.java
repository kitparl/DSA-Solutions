import java.util.*;
public class Main {
public static void func(int n,  int[] arr){
        int count = 0;
    int sum = 0;
    for (int i = 0; i < n; i++) {
        sum = sum + arr[i];
        count = count + 1;
    }
    System.out.println(sum / count);
    
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
