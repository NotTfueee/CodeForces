package Practice.CodeTon_Round_2_Div_1_Div_2;

//File Created by -- > anuragbhatt
//Created On -- > 28/02/24,Wednesday

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

import static java.lang.Math.max;
import static java.lang.Math.min;
import static java.lang.System.out;


public class LukeIsAFoodie {

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

        while(t-- >0)
        {
            solve(sc);
        }
    }

    public static void solve(FastReader sc)throws IOException
    {
        int n = sc.nextInt();
        long x = sc.nextLong();

        long[] a = new long[n];

        for(int i = 0 ; i < n ; ++i)a[i] = sc.nextLong();

        long l = a[0] - x, r = a[0] + x;
        int c = 0;

        for(int i = 1 ; i < n ; ++i)
        {
            // this code finds the common part of the segments

            l = max(l , a[i] - x);
            r = min(r , a[i] + x);

            if(l > r)
            {
                c++;
                l = a[i] - x;
                r = a[i] + x;
            }
        }

        out.println(c);
    }
}
