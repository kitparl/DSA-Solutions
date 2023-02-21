// You are playing the famous Maze Runner Arcade Game. The game contains a maze which has values{'L', 'R', 'U', 'D'}, where L -> indicates that you move left, R -> indicates that you move right

import java.util.*;
import java.io.*;

class Main {
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }

    public static void main(String[] args) {
        FastReader scanner = new FastReader();

        // int tc = sc.nextInt();

        int T = scanner.nextInt();

        for (int i = 0; i < T; i++) {
            int N = scanner.nextInt();
            // scanner.nextLine();

            char[][] arr = new char[N][N];
            for (int j = 0; j < N; j++) {
                String row = scanner.nextLine();
                for (int k = 0; k < N; k++) {
                    arr[j][k] = row.charAt(k);
                }
            }

            if (isRowSymmetrical(arr) && isColumnSymmetrical(arr)) {
                System.out.println("BOTH");
            } else if (isRowSymmetrical(arr)) {
                System.out.println("VERTICAL");
            } else if (isColumnSymmetrical(arr)) {
                System.out.println("HORIZONTAL");
            } else {
                System.out.println("NO");
            }
        }
    }

    public static boolean isRowSymmetrical(char[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            char[] row = arr[i];
            int j = 0;
            int k = row.length - 1;
            while (j < k) {
                if (row[j] != row[k]) {
                    return false;
                }
                j++;
                k--;
            }
        }
        return true;
    }

    public static boolean isColumnSymmetrical(char[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            int j = 0;
            int k = arr.length - 1;
            while (j < k) {
                if (arr[j][i] != arr[k][i]) {
                    return false;
                }
                j++;
                k--;
            }
        }
        return true;
    }

}