package Practice.Round_913_Div_3;

//File Created by -- > anuragbhatt
//Created On -- > 12/02/24,Monday

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class JumpingThroughSegments {

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

            long[] l = new long[n];
            long[] r = new long[n];

            for(int i = 0 ; i < n;  ++i)
            {
                l[i] = sc.nextLong();
                r[i] = sc.nextLong();
            }

            long low = 0 , high = (long)1e9 , left , right , k  , isShort ;


            while(low <= high)
            {
                k = (low + high)/2;

                left = 0 ; right = k ; isShort = 0;

                for(int i = 0 ; i < n ; ++i)
                {
                    if(right < l[i] || r[i] < left)
                    {
                        isShort = 1;
                        break;
                    }

                    left = Math.max(left , l[i]);
                    right = Math.min(right , r[i]);
                    left = Math.max(0L , left - k);
                    right = right + k;
                }

                if(isShort == 0)high = k - 1;
                else low = k + 1;
            }

            System.out.println(low);
        }
    }
}
