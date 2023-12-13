package _900;
//File Created by -- > anuragbhatt
//Created On -- > 07/11/23,Tuesday

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class HossamAndCombanatorics {
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

        for (int i = 0; i < t; ++i) {
            int n = sc.nextInt();

            long[] arr = new long[n];

            for (int j = 0; j < n; ++j) {
                arr[j] = sc.nextLong();
            }

            Arrays.sort(arr);

            long max = (long) Math.abs(arr[n-1] - arr[0]);

            if(max == 0 )
            {
                System.out.println((long) n * (n-1));

            }
            else
            {
                int small = 0, big = 0;

                for (int j = 0; j < n; ++j) {
                    if (arr[j] == arr[0]) small++;
                    if (arr[j] == arr[n - 1]) big++;
                }

                int ans = small * big * 2;

                System.out.println(ans);
            }
        }
    }
}
