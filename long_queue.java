import java.util.*;
public class Main {
public static void func(int n,  int[] arr){
    int a = 0;
    for(int i=0; i<n-1; i++){
        if(arr[i] > arr[i+1]){
            a++;
        }
    }
    
    System.out.println(a+1);
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