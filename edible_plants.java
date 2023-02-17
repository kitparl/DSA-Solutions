import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n1 = scn.nextInt();
        scn.nextLine();
        String s1 = scn.nextLine();
        int n2 = scn.nextInt();
        scn.nextLine();
        String s2 = scn.nextLine();
        int count = 0;
        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < n2; j++) {
                if (s1.charAt(i) == s2.charAt(j)) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}