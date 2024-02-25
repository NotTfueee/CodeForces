package Practice.Round_189_Div_2;

//File Created by -- > anuragbhatt
//Created On -- > 25/02/24,Sunday

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

import static java.lang.System.out;


public class MagicNumber {

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

    public static void solve(FastReader sc)throws IOException
    {
        String s = sc.next();

        if(s.charAt(0) != '1')
        {
            out.println("NO");
            return;
        }

        if(s.contains("444"))
        {
            out.println("NO");
            return;
        }

        for(int i = 0 ; i < s.length() ; ++i)
        {
            if(s.charAt(i) != '1' && s.charAt(i) != '4')
            {
                out.println("NO");
                return;
            }
        }

        out.println("YES");
    }
}
