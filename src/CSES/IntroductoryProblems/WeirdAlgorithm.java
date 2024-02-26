package CSES.IntroductoryProblems;

//File Created by -- > anuragbhatt
//Created On -- > 26/02/24,Monday

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

import static java.lang.System.out;


public class WeirdAlgorithm {

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
        long n = sc.nextLong();

        while(n > 1)
        {
            out.print(n + " ");
            if((n&1) == 0)n = n >>1 ;
            else
            {
                n = (n * 3) + 1;
            }
        }

        out.print(1);
    }
}
