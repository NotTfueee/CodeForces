package CSES.IntroductoryProblems;

//File Created by -- > anuragbhatt
//Created On -- > 26/02/24,Monday

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

import static java.lang.System.out;


public class MissingNumber {

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
            out.println(solve(sc));
        }
    }

    public static int solve(FastReader sc) throws  IOException
    {
        int n = sc.nextInt();

        var set = new HashSet<Integer>();

        for(int i = 0 ; i < n - 1; ++i)
        {
            set.add(sc.nextInt());
        }

        for(int i = 1 ; i <= n ; ++i)
        {
            if(!set.contains(i))return i;
        }

        return -1;
    }
}
