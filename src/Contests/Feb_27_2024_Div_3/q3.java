package Contests.Feb_27_2024_Div_3;

//File Created by -- > anuragbhatt
//Created On -- > 27/02/24,Tuesday

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

import static java.lang.System.out;


public class q3 {

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

    public static void solve(FastReader sc)throws IOException
    {
        long a = sc.nextLong() , b = sc.nextLong();
        long l = sc.nextLong();

        var set = new HashSet<Long>();

        for(int x = 0 ; ; ++x)
        {
            long powA = power(a , x);
            if(powA > l)break;

            for(int y = 0 ; ; ++y)
            {
                long powB = power(b , y);
                long mul = powA * powB;

                if(powB > l || mul > l)break;

                if(l % mul == 0)
                {
                    set.add(l / mul);
                }
            }
        }

        out.println(set.size());
    }

    public static long power(long base , int ex)
    {
        long ans = 1;
        while(ex-- > 0) ans *= base;
        return ans;
    }
}
