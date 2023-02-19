import java.util.*;
public class Main {
public static void func(int groups,  int[] arr){
    
    int sum = 0;
    Arrays.sort(arr);
    for (int i = 0; i < arr.length / 2; i++) {
        sum += arr[arr.length - 1 - i];
    }
    System.out.println(sum);
    
}

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n*2];
        for (int i = 0; i < n*2; i++) {
            a[i] = scanner.nextInt();
        }
	func( n, a);
    }
}
