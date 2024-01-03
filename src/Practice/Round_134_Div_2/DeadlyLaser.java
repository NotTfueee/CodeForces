package Practice.Round_134_Div_2;
//File Created by -- > anuragbhatt
//Created On -- > 31/12/23,Sunday

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class DeadlyLaser {
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
        var sc = new FastReader();
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt(), m = sc.nextInt(), x = sc.nextInt(), y = sc.nextInt(), d = sc.nextInt();
            int min = findSteps(n, m, x, y, d);
            System.out.println(min);
        }
    }

    public static int findSteps(int n, int m, int x, int y, int d) {
        if (Math.abs(n - x) + Math.abs(m - y) <= d) {
            return -1; // Impossible to reach destination due to the laser
        }

        if (Math.abs(x - 1) + Math.abs(y - 1) <= d) {
            return Math.min(Math.abs(n - 1) + Math.abs(m - 1), Math.abs(x - 1) + Math.abs(y - 1)) + 1;
        }

        if (Math.abs(n - x) + Math.abs(m - y) <= 2 * d) {
            return Math.max(Math.abs(n - 1), Math.abs(m - 1)) + 2;
        }

        return Math.abs(n - 1) + Math.abs(m - 1);
    }
}
