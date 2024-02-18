package Practice.Round_640_Div_4;

//File Created by -- > anuragbhatt
//Created On -- > 17/02/24,Saturday

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

import static java.lang.System.out;


public class SameParitySummands {

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
            long n = sc.nextLong() ;
            int k = sc.nextInt();

            StringBuilder ans = new StringBuilder();

            long n1 = n - (k-1);

            if( n1 > 0 && (n1 & 1) == 1)
            {
                out.println("YES");

                for(int i = 0 ; i < k-1 ; ++i)
                {
                    ans.append(1).append(" ");
                }

                ans.append(n1);
                out.println(ans);
                continue;
            }

            long n2 = n - 2*(k-1);

            if( n2 > 0 && (n2 & 1) == 0)
            {
                out.println("YES");

                for(int i = 0 ; i < k-1 ; ++i)
                {
                    ans.append(2).append(" ");
                }

                ans.append(n2);

                out.println(ans);
                continue;
            }

            out.println("NO");
        }
    }
}
