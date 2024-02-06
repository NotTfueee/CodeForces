package Practice.Round_909_Div_3;

//File Created by -- > anuragbhatt
//Created On -- > 06/02/24,Tuesday

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class YarikAndArray {

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
            int[] a = new int[n];

            for(int i = 0 ; i < n ; ++i)a[i] = sc.nextInt();

            int sum = 0 , max = Integer.MIN_VALUE;

            int f ;
            if(a[0] % 2 == 0)f = 0;
            else f = 1;

            for(int i = 0 ; i < n ; ++i)
            {
                if(sum >= 0 && ((f == 0 && a[i] % 2 == 0) || (f == 1 && a[i] % 2 != 0)))
                {
                    sum += a[i];
                }
                else
                {
                    if(a[i] % 2 == 0)f = 0;
                    else f = 1;
                    sum = a[i];
                }

                f ^= 1;

                max = Math.max(max , sum);
            }

            System.out.println(max);
        }
    }
}
