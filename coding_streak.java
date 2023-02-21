import java.io.*;
import java.util.*;
import java.lang.*;

class Main {

    public static void func(int N, List<String> arr) {

        int X = 0;

        for (int i = 0; i < arr.size(); i++) {
            int x = 0;
            int w = 0;
            for (int j = 0; j < arr.get(i).length(); j++) {
                if (arr.get(i).charAt(j) == 'C') {
                    w++;
                    if (x < w) {
                        x = w;
                    }
                } else {
                    x = Math.max(x, w);
                    w = 0;
                }
            }
            X = Math.max(X, x);
        }

        StringBuilder strBuilder = new StringBuilder();
        for (int i = 0; i < N; i++) {
            strBuilder.append(arr.get(i));
        }
        String str = strBuilder.toString();

        int Y = 0;
        int z = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'C') {
                z++;
            } else {
                Y = Math.max(Y, z);
                z = 0;
            }
        }
        System.out.println(X + " " + Y);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();

        List<String> list = new ArrayList<>();
        for (int i = 0; i < t; i++) {
            String str = s.next();
            list.add(str);
        }
        func(t, list);
    }

}
