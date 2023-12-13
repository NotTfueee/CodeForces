package _800;//File Created by -- > anuragbhatt
//Created On -- > 03/10/23,Tuesday

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class PresentFromLena {
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

        FastReader scanner = new FastReader();
        int n = 2;

        // Upper part of the rhombus
        for (int i = 0; i <= n; i++) {
            // Print spaces
            for (int j = 0; j < 2 * (n - i); j++) {
                System.out.print(" ");
            }

            // Print _800.increasing sequence
            for (int j = 0; j < i; j++) {
                System.out.print(j + " ");
            }

            // Print center number
            System.out.print(i);

            // Print decreasing sequence
            for (int j = i - 1; j >= 0; j--) {
                System.out.print(" " + j);
            }

            // Move to the next line
            System.out.println();
        }

        // Lower part of the rhombus
        for (int i = n - 1; i >= 0; i--) {
            // Print spaces
            for (int j = 0; j < 2 * (n - i); j++) {
                System.out.print(" ");
            }

            // Print _800.increasing sequence
            for (int j = 0; j < i; j++) {
                System.out.print(j + " ");
            }

            // Print center number
            System.out.print(i);

            // Print decreasing sequence
            for (int j = i - 1; j >= 0; j--) {
                System.out.print(" " + j);
            }

            // Move to the next line
            System.out.println();
        }
    }
}
