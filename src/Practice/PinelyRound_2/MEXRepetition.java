package Practice.PinelyRound_2;

//File Created by -- > anuragbhatt
//Created On -- > 04/02/24,Sunday

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class MEXRepetition {

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
            long k = sc.nextInt();

            var set = new HashSet<Integer>();

            int[]a = new int[n];
            for(int i = 0 ; i < n ; ++i)
            {
                a[i] = sc.nextInt();
                set.add(a[i]);
            }

            int[] ans = new int[n+1];

            int miss = -1;
            for(int i = 0 ; i <= n ; ++i)
            {
                if(!set.contains(i))
                {
                    miss = i;
                    break;
                }
            }

            for(int i = 0 ; i < n ; ++i)ans[i+1] = a[i];

            ans[0] = miss;

            StringBuilder s = new StringBuilder();

            int rotate = (int) ((k-1) % (n+1));

            int len = ans.length;

            int l = 0 , r = (len-1) - rotate;

            while(l < r)
            {
                int temp = ans[r];
                ans[r] = ans[l];
                ans[l] = temp;

                l++;
                r--;
            }

            l =  len - rotate ;
            r =  len-1;

            while(l < r)
            {
                int temp = ans[r];
                ans[r] = ans[l];
                ans[l] = temp;
                l++;
                r--;
            }

            l = 0;
            r = len-1;

            while(l < r)
            {
                int temp = ans[r];
                ans[r] = ans[l];
                ans[l] = temp;

                l++;
                r--;
            }

            for(int i = 0 ; i < n ; ++i)
            {
                s.append(ans[i]).append(" ");
            }

            System.out.println(s);

        }
    }
}
