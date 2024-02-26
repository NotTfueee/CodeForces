package Practice.Round_808_Div_2;

//File Created by -- > anuragbhatt
//Created On -- > 26/02/24,Monday

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

import static java.lang.System.out;


public class DifferencesOfGCD {

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
        int n = sc.nextInt();
        long l = sc.nextLong() , r = sc.nextLong();

        StringBuilder ans = new StringBuilder();
        ans.append(l).append(" ");

        for(int i = 2 ; i <= n ; ++i)
        {
            long num = r / i;

            if(num * i >= l && num * i <= r)
            {
                ans.append(num * i).append(" ");
            }
            else
            {
                out.println("NO");
                return ;
            }
        }

        out.println("YES");
        out.println(ans);
    }
}
