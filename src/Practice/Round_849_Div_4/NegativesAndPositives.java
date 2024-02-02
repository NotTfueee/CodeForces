package Practice.Round_849_Div_4;

//File Created by -- > anuragbhatt
//Created On -- > 02/02/24,Friday

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class NegativesAndPositives {

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
            long[] a = new long[n];

            int neg = 0;
            long sum = 0 , small = Integer.MAX_VALUE;

            for(int i = 0 ; i < n  ; ++i)
            {
                a[i] = sc.nextLong();
                if(a[i] < 0)neg++;

                sum = sum + Math.abs(a[i]);

                small = Math.min(small , Math.abs(a[i]));
            }

            if(neg % 2 == 0 )
            {
                System.out.println(sum);
            }
            else
            {
                System.out.println(sum - (2*small));
            }
        }
    }
}
