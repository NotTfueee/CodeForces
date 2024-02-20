package Practice.Round_653_Div_3;

//File Created by -- > anuragbhatt
//Created On -- > 20/02/24,Tuesday

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

import static java.lang.System.out;


public class MultiplyBy2DivideBy6 {

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

    public static void solve(FastReader sc )throws IOException
    {
        int n = sc.nextInt();

        int c2 = 0 , c3 = 0;

        while(n % 2 == 0)
        {
            n /= 2;
            c2++;
        }

        while(n % 3 == 0 )
        {
            n /= 3;
            c3++;
        }

        if(c2 > c3 || n != 1)
        {
            out.println(-1);
        }
        else out.println( 2*(c3 - c2)+ c2);

    }
}
