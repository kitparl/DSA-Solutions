// 1 2 3
// 4 5 6
// 7 8 9

import java.util.*;
public class Main {
public static void func(int N){
        String bag = "";
    for (int j = 1; j <= N * N; j++) {
        bag += j + " ";
        if (j % N == 0) {
            System.out.println(bag);
            bag = "";
        }
    }
}
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        func(n);
    }
}
