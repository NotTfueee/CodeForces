package Practice.Round_481_Div_3;

//File Created by -- > anuragbhatt
//Created On -- > 18/02/24,Sunday

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

import static java.lang.System.out;


public class Letters {

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

    public static void solve(FastReader sc) throws IOException
    {
        int n = sc.nextInt(), m = sc.nextInt();
        long[] a = new long[n+1];

        long sum = 0;
        for(int i = 1 ; i <= n ; ++i)
        {
           long item = sc.nextLong();
           sum += item;
           a[i] = sum ;
        }
        a[0] = 0L;

        int l = 1;
        for(int i = 0 ; i < m ; ++i)
        {
            long item = sc.nextLong();

            if(item <= a[l])
            {
                out.println(l + " " + (item - a[l-1]));
            }else
            {
                while(l < n && a[l] < item)
                {
                    l++;
                }

                out.println(l + " " + (item - a[l-1]));
            }
        }

        out.println();
    }

}
