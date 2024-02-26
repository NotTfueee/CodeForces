package CSES.IntroductoryProblems;

//File Created by -- > anuragbhatt
//Created On -- > 26/02/24,Monday

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

import static java.lang.System.out;


public class Permutations {

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

        if(n == 1)
        {
            out.println(1);
            return ;
        }

        if(n == 2 || n == 3)
        {
            out.println("NO SOLUTION");
            return;
        }

        StringBuilder ans = new StringBuilder();

        int l = 1 , r = (n>>1) + 1;

        while(l <= (n>>1))
        {
            ans.append(r).append(" ").append(l).append(" ");
            l++;
            r++;
        }

        if((n&1) == 1)ans.append(n);

        out.println(ans);

    }
}
