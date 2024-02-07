package Practice.Round_886_Div_4;

//File Created by -- > anuragbhatt
//Created On -- > 07/02/24,Wednesday

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CardboardForPictures {

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
            long c = sc.nextLong();

            int[] s = new int[n];

            for(int i = 0 ; i < n ; ++i)
            {
                s[i] = sc.nextInt();
            }

            long l = 0, r = (long)1e9, ans = 0;

            while(l <= r)
            {
                long mid = (l + r) / 2;
                long sum = 0;

                for(int i = 0 ; i < n ; ++i)
                {
                    sum += ((long)s[i] + (mid * 2)) * ((long)s[i] + (mid * 2));
                    if(sum > c)break;
                }

                if(sum == c)
                {
                    ans = mid;
                    break;
                }
                else if(sum > c)
                {
                    r = mid - 1;
                }
                else
                {
                    l = mid + 1;
                }
            }

            System.out.println(ans);
        }
    }
}
