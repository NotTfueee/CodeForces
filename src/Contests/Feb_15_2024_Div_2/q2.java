package Contests.Feb_15_2024_Div_2;

//File Created by -- > anuragbhatt
//Created On -- > 15/02/24,Thursday

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class q2 {

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
            long n = sc.nextLong() , k = sc.nextLong();

            if (k == (4 * n - 2))
                System.out.println((k / 2) + 1);
            else {
                if (k % 2 == 0)
                    System.out.println(k / 2);
                else
                    System.out.println(k / 2 + 1);
            }
        }
    }
}
