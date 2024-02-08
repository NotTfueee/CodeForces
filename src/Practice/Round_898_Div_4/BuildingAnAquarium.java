package Practice.Round_898_Div_4;

//File Created by -- > anuragbhatt
//Created On -- > 08/02/24,Thursday

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BuildingAnAquarium {

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
            long x = sc.nextLong();

            long[] a = new long[n];

            for(int i = 0 ; i < n ; ++i)a[i] = sc.nextLong();

            long l = 1L , r = (long)1e10 , ans = 0;

            while(l <= r) {
                long mid = (l + r) / 2;

                long sum = 0;

                for(long i : a) {
                    sum += Math.max(mid - i, 0L);
                    if(sum > x)break;
                }

                if(sum == x)
                {
                    ans = mid;
                    break;
                }
                else if(sum < x)
                {
                    ans = Math.max(ans , mid);
                    l = mid +1;
                }
                else r = mid -1;
            }

            System.out.println(ans);

        }
    }
}
