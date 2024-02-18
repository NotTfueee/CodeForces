package Practice.Round_895_Div_3;

//File Created by -- > anuragbhatt
//Created On -- > 15/02/24,Thursday

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

import static java.lang.System.out;


public class PlusMinusPermutation {

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
            long n = sc.nextLong() , x = sc.nextLong() , y = sc.nextLong();

            if( x == y )
            {
                out.println(0);
                continue;
            }

            long a = n / x , b = n / y;
            long lcm = (x * y) / gcd(x , y) , c = n / lcm;
            long a1 = a - c , b1 = b - c;

            out.println((sum(n)- sum(n-a1)) - sum(b1));
        }
    }

    public static long gcd(long x , long y)
    {
        while(y != 0)
        {
            long temp = y;
            y = x % y;
            x = temp;
        }

        return x;
    }

    public static long sum(long n)
    {
        return (n * (n + 1))/2;
    }

}
