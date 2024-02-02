package Practice.Round_148_Div_2;

//File Created by -- > anuragbhatt
//Created On -- > 02/02/24,Friday

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ContrastValue {

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

            for(int i = 0 ; i < n ; ++i)
            {
                a[i] = sc.nextLong();
            }

            if(n == 1)
            {
                System.out.println(1);
                continue;
            }

            int count = 1 , state = 0;

            for(int i = 1 ; i < n ; ++i)
            {
                if (a[i - 1] > a[i] && state != -1)
                {
                    count ++;
                    state = -1;
                }
                else if(a[i-1] < a[i] && state != 1)
                {
                    count ++;
                    state = 1;
                }
            }

            System.out.println(count);
        }
    }
}
