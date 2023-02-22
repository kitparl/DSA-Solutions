import java.util.*;
public class Main {
public static void func(int n, int[] arr){
    long x;
    long m = 0;
    long s = 0;
    
    for(int i=0; i<n; i++){
        // arr[i]
       m =  Math.max(m,arr[i]);
       s+=arr[i];
    }
    System.out.println(m>(s - m) ? 2* m : s);
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