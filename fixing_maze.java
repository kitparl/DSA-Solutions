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
            int M = scanner.nextInt();
            int N = scanner.nextInt();
            // scanner.nextLine();

            char[][] arr = new char[M][N];
            for (int j = 0; j < M; j++) {
                String row = scanner.nextLine();
                for (int k = 0; k < N; k++) {
                    arr[j][k] = row.charAt(k);
                }

            }
            System.out.println(func(M, N, arr));
        }
    }

    public static int func(int n, int m, char[][] arr) {

        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i][m - 1] != 'C' && arr[i][m - 1] == 'R') {
                count++;
            }
        }

        for (int i = 0; i < m; i++) {
            if (arr[n - 1][i] != 'C' && arr[n - 1][i] == 'D') {
                count++;
            }
        }

        return count;
    }
}