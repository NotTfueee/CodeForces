package Practice.Round_481_Div_3;

//File Created by -- > anuragbhatt
//Created On -- > 18/02/24,Sunday

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

import static java.lang.System.out;


public class FileName {

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
        int n = sc.nextInt() , ans = 0 , c = 0;

        String s = sc.next();

        for(int i = 0 ; i < n ; ++i)
        {
            if(s.charAt(i) == 'x')
            {
                c = 0;
                while(i < n && s.charAt(i) == 'x')
                {
                    i++;
                    c++;
                }

                if(c >= 3)
                {
                    ans += (c - 2);
                }
            }
        }

        out.println(ans);

    }
}
