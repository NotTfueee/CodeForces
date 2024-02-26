package Practice.Round_271_Div_2;

//File Created by -- > anuragbhatt
//Created On -- > 25/02/24,Sunday

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

import static java.lang.System.out;


public class Worms {

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
        int n = sc.nextInt();
        long[] a = new long[n];

        long sum = 0;
        for(int i = 0 ; i < n ; ++i)
        {
            sum += sc.nextLong();
            a[i] = sum;
        }

        int m = sc.nextInt();

        for(int i = 0 ; i < m ; ++i)
        {
            long val = sc.nextLong();

            out.println(solve( a , val));
        }
    }

    public static int solve(long[] a , long target)
    {
        int n = a.length , l = 0 , r = n -1 ;

        while(l <= r)
        {
            int mid = (l + r) >> 1;

            if(target <= a[mid])
            {
                if(mid == 0 || target > a[mid-1])return mid + 1;
                else r = mid - 1;
            }
            else  l = mid + 1;
        }

        return -1;
    }

}
