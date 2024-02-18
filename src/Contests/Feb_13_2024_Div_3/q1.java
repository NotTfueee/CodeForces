package Contests.Feb_13_2024_Div_3;

//File Created by -- > anuragbhatt
//Created On -- > 13/02/24,Tuesday

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class q1 {

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
            int n = sc.nextInt();

            if(n == 78)
            {
                System.out.println("zzz");
                continue;
            }

            if(n <= 28 )
            {
                StringBuilder ans = new StringBuilder("aa");
                n -= 2;
                ans.append((char)(n + 96));

                System.out.println(ans);
            }
            else
            {
                StringBuilder ans = new StringBuilder();

                int r = n / 26;

                if((26*r) == n)r = 1;

                n = n - (r * 26);

                for(int i = 0 ; i < r ; ++i)ans.append('z');

                if(ans.length() == 1)
                {
                    ans.append((char)((n-1) + 96));
                    ans.append('a');

                    System.out.println(ans.reverse());
                }
                else
                {
                    ans.append((char)(n + 96));

                    System.out.println(ans.reverse());
                }
            }

        }
    }
}
