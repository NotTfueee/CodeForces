package Practice.Round_138_Div_2;
//File Created by -- > anuragbhatt
//Created On -- > 22/12/23,Friday

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class DeathsBlessing {
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(
                    new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                if (st.hasMoreTokens()) {
                    str = st.nextToken("\n");
                } else {
                    str = br.readLine();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }

    public static void main(String[] args) {

        FastReader sc = new FastReader();
        int t = sc.nextInt();

        while(t-- > 0)
        {
            int n = sc.nextInt();

            long[] a = new long[n];
            long[] b = new long[n];

            for(int i = 0 ; i < n ; ++i)
            {
                a[i] = sc.nextLong();
            }

            long max = Integer.MIN_VALUE ;

            for(int i = 0 ; i < n ; ++i)
            {
                b[i] = sc.nextLong();
                max = Math.max(max , b[i]);
            }

            if(n == 1)
            {
                System.out.println(a[0]);
                continue;
            }

            long sumA = Arrays.stream(a).sum() + Arrays.stream(b).sum()-max;

            System.out.println(sumA);
        }
    }
}
