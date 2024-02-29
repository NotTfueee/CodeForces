package Practice.Round_701_Div_2;

//File Created by -- > anuragbhatt
//Created On -- > 28/02/24,Wednesday

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

import static java.lang.System.out;


public class AddAndDivide {

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

    public static void solve(FastReader sc)throws IOException {
        long a = sc.nextLong(), b = sc.nextLong();

        if(a == 0)
        {
            out.println(0);
            return;
        }

        if (a == b ) {
            out.println(2);
            return;
        }

        if (b > a) {
            out.println(1);
            return;
        }

        long res = a + 3 , ans;

        for(long i = ( b<2 ? 2 - b : 0) ; i < res ; ++i)
        {
            b += i;
            long temp = a;
            ans = i;

            while(temp > 0)
            {
                temp /= b;
                ++ans;
            }

            if(ans < res)res = ans;
            b -= i;
        }
        out.println(res);
    }
}
