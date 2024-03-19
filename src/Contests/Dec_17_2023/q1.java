package Contests.Dec_17_2023;

//File Created by -- > anuragbhatt
//Created On -- > 19/03/24,Tuesday

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

import static java.lang.Math.ceil;
import static java.lang.System.out;


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
            solve(sc);
        }
    }

    public static void solve(FastReader sc) throws  IOException
    {
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();

        if(b % 3 == 0)
        {
            a += (b / 3);
            a += (long) ceil((double) c / 3);

            out.println(a);
            return;
        }

        a += (b / 3);

        long remain = b % 3;

        if(remain + c < 3)
        {
            out.println(-1);
            return;
        }

        if(remain == 1)
        {
            c -= 2;
            a++;
        }
        else
        {
            c -= 1;
            a++;
        }

        a += (long) ceil((double) c / 3);

        out.println(a);

        return;
    }
}
