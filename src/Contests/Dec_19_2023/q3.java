package Contests.Dec_19_2023;
//File Created by -- > anuragbhatt
//Created On -- > 19/12/23,Tuesday

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class q3 {
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
        int t = sc.nextInt();

        while(t-- > 0)
        {
            int n = sc.nextInt();
            int k = sc.nextInt();

            int[] a = new int[n];
            int[] b = new int[n];

            for (int j = 0; j < n; j++) {
                a[j] = sc.nextInt();
            }

            for (int j = 0; j < n; j++) {
                b[j] = sc.nextInt();
            }

            int ans = 0;
            int fans = 0;
            int bmax = 0;

            for (int j = 0; j < n; j++) {
                if (k == j) {
                    break;
                }
                ans += a[j];
                bmax = Math.max(bmax, b[j]);
                fans = Math.max(ans + (k - j - 1) * bmax, fans);
            }


            System.out.println(fans);
        }
    }
}
