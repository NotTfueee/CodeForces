package Practice.Round_836_Div_2;
//File Created by -- > anuragbhatt
//Created On -- > 24/12/23,Sunday

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class SeeingDouble {
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
        int t = sc.nextInt();

        while(t-- > 0)
        {
            String s = sc.next();

            var map = new HashMap<Character , Integer>();

            for(int i = 0 ; i < s.length() ; ++i)
            {
                char item = s.charAt(i);
                map.put(item , map.getOrDefault(item , 0) + 1);
            }

            StringBuilder ans = new StringBuilder();

            for(var ch : map.keySet())
            {
                int val = map.get(ch);

                ans.append(String.valueOf(ch).repeat(val));
            }

            StringBuilder s2 = new StringBuilder(ans);

            System.out.println(ans.append(s2.reverse()));
        }
    }
}
