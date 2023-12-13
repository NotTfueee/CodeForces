package _1000;
//File Created by -- > anuragbhatt
//Created On -- > 11/12/23,Monday

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class DistinctSplit {
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

    public static void main(String[] args)
    {

        FastReader sc = new FastReader();
        int t = sc.nextInt();

        while(t-- > 0)
        {
            int n = sc.nextInt();
            String s = sc.next();

            var set = new HashSet<Character>();

            // prefix
            int[] pre = new int[n];
            for(int i = 0 ; i < n ; ++i)
            {
                char item = s.charAt(i);

                set.add(item);

                pre[i] = set.size();
            }

            // for suffix
            int[] suff = new int[n];
            set.clear();
            for(int i = n-1 ; i>= 0 ; --i)
            {
                char item = s.charAt(i);
                set.add(item);
                suff[i] = set.size();
            }

            int ans = 0;
            for(int i = 0 ; i < n-1 ; ++i)
            {
                ans = Math.max(ans , pre[i] + suff[i+1]);
            }

            System.out.println(ans);
        }
    }
}
