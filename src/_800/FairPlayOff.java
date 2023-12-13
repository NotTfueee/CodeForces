package _800;
//File Created by -- > anuragbhatt
//Created On -- > 14/11/23,Tuesday

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class FairPlayOff {
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

        for (int j = 0; j < t; ++j) {
            int[] arr = new int[4];

            for (int i = 0; i < 4; ++i) {
                arr[i] = sc.nextInt();
            }

            int large1 = Math.max(arr[0], arr[1]);
            int small1 = Math.min(arr[0], arr[1]);
            int large2 = Math.max(arr[2], arr[3]);
            int small2 = Math.min(arr[2], arr[3]);

            int smallerOfLarges = Math.min(large1, large2);

            if (smallerOfLarges < small1 || smallerOfLarges < small2) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
        }
    }
}
