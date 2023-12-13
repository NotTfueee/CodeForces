package _800;//File Created by -- > anuragbhatt
//Created On -- > 21/09/23,Thursday

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class YetAnotherTwoIntegerProblem {
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

        FastReader read = new FastReader();
        int T = read.nextInt();

        for(int i = 0; i < T ; ++i) {
            long a = read.nextLong(), b = read.nextLong();

            if (a == b) {
                System.out.println(0);
                continue;
            }

            long diff = Math.abs(a - b), count = 0;

            while (diff > 9) {
                count += diff / 10;
                diff = diff % 10;
            }

            if (diff != 0) System.out.println(count + 1);
            else System.out.println(count);
        }
    }
}
