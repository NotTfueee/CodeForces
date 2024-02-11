package Practice.Round_898_Div_4;

//File Created by -- > anuragbhatt
//Created On -- > 08/02/24,Thursday

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MoneyTrees {

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
            long k = sc.nextLong();

            int[] f = new int[n];
            long[] h = new long[n];

            int[] pfs  = new int[n];
            int sum = 0;
            for(int i = 0 ; i < n ; ++i)
            {
                f[i] = sc.nextInt();
                sum += f[i];
                pfs[i] = sum;
            }

            for(int i = 0 ; i < n ; ++i)h[i] = sc.nextLong();

            int start = 0 , max = 0;
            sum = f[0];

            if(sum <= k)max = 1;

            for(int i = 1 ; i < n ; ++i)
            {
                if(h[i-1] % h[i] == 0)sum += f[i];
                else
                {
                    sum = f[i];
                    start = i;
                }

                while(sum > k)
                {
                    sum -= f[start];
                    start ++;
                }

                max = Math.max(max , i - start + 1);
            }

            System.out.println(max);
        }
    }
}
