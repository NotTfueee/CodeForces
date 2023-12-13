package _900;
//File Created by -- > anuragbhatt
//Created On -- > 01/11/23,Wednesday

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class EveryoneLovesToSleep {
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

        for(int i = 0 ; i < t ; ++i)
        {
            int n = sc.nextInt();
            int time, h, m;
            h = sc.nextInt();
            m = sc.nextInt();
            time = 60 * h + m;
            int ans = 24 * 60;
            for (int j = 0; j < n; ++j) {
                h = sc.nextInt();
                m = sc.nextInt();
                int x = 60 * h + m - time;
                if (t < 0) x += 24 * 60;
                ans = Math.min(ans, x);
            }
            System.out.println(ans / 60 + " " + ans % 60);
        }
    }
}
