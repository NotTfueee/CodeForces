package Contests.Dec_17_2023;
//File Created by -- > anuragbhatt
//Created On -- > 18/12/23,Monday

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SwapAndDelete {
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
            String s = sc.next();
            int countZero = 0, countOne = 0;

            // Count the number of 0s and 1s in the string
            for (char c : s.toCharArray()) {
                if (c == '0') {
                    countZero++;
                } else {
                    countOne++;
                }
            }

            // Calculate the minimum count between 0s and 1s
            int minCount = Math.min(countZero, countOne);

            // Calculate the total cost
            System.out.println( s.length() - 2 * minCount);
        }
    }
}
