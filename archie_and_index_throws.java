import java.util.*;
public class Main {
public static void func(int n, int[] arr){
//     Arrays.sort(arr);
// System.out.println(arr[arr.length - 1]);
int ms = Integer.MIN_VALUE;

for(int i = 0; i<n; i++){
    int s = 0;
    int id = i;
    
    while(id < n){
        s += arr[id];
        id = id + arr[id];
    }
    if(s > ms){
        ms = s;
    }
}
System.out.println(ms);
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