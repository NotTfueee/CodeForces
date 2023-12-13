package Contests;//File Created by -- > anuragbhatt
//Created On -- > 05/12/23,Tuesday

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class constest2 {
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

        FastReader sc = new FastReader();
        int t = sc.nextInt();

        while(t-- > 0)
        {
            int n = sc.nextInt();
            String s = sc.next();

            var map = new HashMap<Character , Integer>();

            for(int i = 0 ; i < n ; ++i)
            {
                char item = s.charAt(i);
                map.put(item , map.getOrDefault(item , 0 ) + 1);
            }

            int max = Integer.MIN_VALUE;
            for(var ch : map.keySet())
            {
                max = Math.max(max , map.get(ch));
            }

            if(max > (n /2))
            {
                int ans = n - (n - max)*2;
                System.out.println(ans);
            }
            else
            {
                System.out.println(n % 2);
            }
        }
    }
}
