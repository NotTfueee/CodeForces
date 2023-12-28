package Practice.Round_719_Div_3;
//File Created by -- > anuragbhatt
//Created On -- > 28/12/23,Thursday

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class SameDifferences {
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

        var sc = new FastReader();
        int t =sc.nextInt();

        while(t-- > 0)
        {
            int n = sc.nextInt();

            var map = new HashMap<Long, Integer>();

            for(int i = 0 ; i < n ; ++i)
            {
                long item = sc.nextLong();
                long val = item - i;

                map.put(val , map.getOrDefault(val , 0)+1);
            }

            long ans = 0;
            for(long a : map.keySet())
            {
                long val = map.get(a);

                if(val > 1)
                {
                    ans += (val * (val-1) / 2);
                }
            }

            System.out.println(ans);
        }
    }
}
