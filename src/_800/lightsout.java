package _800;//File Created by -- > anuragbhatt
//Created On -- > 28/09/23,Thursday

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class lightsout {
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(
                    new InputStreamReader(System.in));
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
                if (st.hasMoreTokens()) {
                    str = st.nextToken("\n");
                } else {
                    str = br.readLine();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }

    public static void main(String[] args) {

        FastReader sc = new FastReader();
        int[][] lights = new int[3][3];
        int[][] initial = new int[3][3];

        // Initialize the initial grid with 1's
        for (int i = 0; i < 3; i++) {
            Arrays.fill(initial[i], 1);
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                lights[i][j] = sc.nextInt();
                if (lights[i][j] > 0 && lights[i][j] % 2 != 0) {
                    checker(initial, i, j);
                }
            }
        }

        // Print the initial grid
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(initial[i][j]);
            }
            System.out.println();
        }
    }

    public static void checker(int[][] initial, int i, int j) {
        initial[i][j] ^= 1; // Toggle the value

        // Toggle neighbors
        if (i > 0) {
            initial[i - 1][j] ^= 1;
        }
        if (i < 2) {
            initial[i + 1][j] ^= 1;
        }
        if (j > 0) {
            initial[i][j - 1] ^= 1;
        }
        if (j < 2) {
            initial[i][j + 1] ^= 1;
        }
    }
}
