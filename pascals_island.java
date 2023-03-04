import java.util.*;
public class Main {
public static void func(int n){
    for(int k = 1; k<=n; k++){
        for(int j=0; j<n - k; j++){
            System.out.print(" ");
        }
        
        int c = 1;
        for(int i = 1; i<= k; i++){
            System.out.print(c + " ");
            c = c * (k - i) / i;
        }
        System.out.println();
    }
}
 public static void main(String[] args) {
 Scanner scanner = new Scanner(System.in);
 int n = scanner.nextInt();
 func(n);
 }
}
