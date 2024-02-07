package Practice.Round_886_Div_4;

//File Created by -- > anuragbhatt
//Created On -- > 07/02/24,Wednesday

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BalancedRound {

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
            int n = sc.nextInt() ;
            long k = sc.nextLong();
            long[] a = new long[n];

            for(int i = 0 ; i < n ; ++i)a[i] = sc.nextLong();

            if(n == 1)
            {
                System.out.println(0);
                continue;
            }

            Arrays.sort(a);

            int max = 0;

            int start = 0;
            for(int i = 1 ; i < n ; ++i)
            {
                if((int)Math.abs(a[i] - a[i-1]) > k)
                {
                    start = i;
                }
                max = Math.max(max , i - start+1);
            }

            System.out.println(n-max);
        }
    }
}
