package Contests.Feb_11_2024_Div_2;

//File Created by -- > anuragbhatt
//Created On -- > 11/02/24,Sunday

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class q1 {

    public static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() throws IOException {
            while (st == null || !st.hasMoreElements()) {
                st = new StringTokenizer(br.readLine());
            }
            return st.nextToken();
        }

        int nextInt() throws IOException {
            return Integer.parseInt(next());
        }

        long nextLong() throws IOException {
            return Long.parseLong(next());
        }

        double nextDouble() throws IOException {
            return Double.parseDouble(next());
        }

        String nextLine() throws IOException {
            return br.readLine();
        }
    }

    public static void main(String[] args) throws IOException {
        var sc = new FastReader();
        int t = sc.nextInt();

        while(t-- > 0)
        {
            long a = sc.nextLong(), b = sc.nextLong();

            if ((a % 2 != 0 && b % 2 != 0) || (a % 2 != 0 && b == a * 2) || (b % 2 != 0 && a == b * 2)) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
        }
    }
}
