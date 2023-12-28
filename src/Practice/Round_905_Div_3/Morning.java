package Practice.Round_905_Div_3;
//File Created by -- > anuragbhatt
//Created On -- > 27/12/23,Wednesday

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Morning {
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
            var map = new HashMap<Integer , Integer>();

            for(int i = 1 ; i <= 10 ; ++i)
            {
                if(i == 10) map.put(0 , i);
                else map.put(i , i);
            }

            int count = 0 , curr = 1;

            for(int i = 0 ; i < s.length() ; ++i)
            {
                int item = s.charAt(i)-'0';

                count += ((int)Math.abs(map.get(curr) - map.get(item))) + 1;
                curr = item;
            }

            System.out.println(count);
        }
    }
}
