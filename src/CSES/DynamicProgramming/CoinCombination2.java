package CSES.DynamicProgramming;
//File Created by -- > anuragbhatt
//Created On -- > 29/02/24,Thursday

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

import static java.lang.System.out;


public class CoinCombination2 {

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
        int t = 1;

        while(t-- > 0)
        {
            solve(sc);
        }
    }

    public static void solve(FastReader sc)throws IOException
    {
        int n = sc.nextInt();
        long sum = sc.nextLong();
        int mod = (int) (1e9 + 7);

        long[] coin = new long[n];
        for (int i = 0; i < n; ++i) coin[i] = sc.nextLong();

        long[] dp = new long[(int) (sum + 1)];
        dp[0] = 1;

        for (int i = 0; i < n; ++i) {
            long c = coin[i];
            for (long j = c; j < sum + 1; ++j) {
                dp[(int) j] = (dp[(int) j] + dp[(int) (j - c)]) % mod;
            }
        }

        out.println(dp[(int) sum]);
    }
}
