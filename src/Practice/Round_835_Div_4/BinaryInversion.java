package Practice.Round_835_Div_4;

//File Created by -- > anuragbhatt
//Created On -- > 03/02/24,Saturday

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BinaryInversion {

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

            for(int i = 0 ; i < n ; i ++)a[i] = sc.nextInt();

            int[] p0 = new int[n];
            int[] p1 = new int[n];

            int c0 = 0  , c1 = 0;
            for(int i = 0 ; i < n ; ++i)
            {
                if(a[i] == 0)
                {
                    c0++;
                    p0[i] = c0;
                    p1[i] = c1;
                }
                else
                {
                    c1++;
                    p1[i] = c1;
                    p0[i] = c0;
                }
            }

            int inv = 0 ;

            // for counting the inversion of the array
            for(int i = 0 ; i < n ; ++i)
            {
                if(a[i] == 0)
                {
                    inv += p1[i];
                }
            }

            //now for checking the max value by flipping each index
            int max = 0;

            for(int i = 0 ; i < n ; ++i)
            {
                if(a[i] == 1)
                {
                    max = Math.max(max , inv - (p0[n-1] - p0[i]) + p1[i]);
                }
                else
                {
                    max = Math.max(max , inv + (p0[n-1] - p0[i]) - p1[i]);
                }
            }

            System.out.println(max);
        }
    }
}
