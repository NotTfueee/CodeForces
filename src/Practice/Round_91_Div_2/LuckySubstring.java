package Practice.Round_91_Div_2;
//File Created by -- > anuragbhatt
//Created On -- > 20/12/23,Wednesday

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class LuckySubstring {
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

        String s = sc.next();

        var map = new HashMap<Character , Integer>();

        for(int i = 0 ; i < s.length() ; ++i)
        {
            char ch = s.charAt(i);
            map.put(ch , map.getOrDefault(ch , 0 ) + 1);
        }

        if(!map.containsKey('7') && !map.containsKey('4'))
        {
            System.out.println(-1);
            return ;
        }

        int ans = Integer.MIN_VALUE , count = 0;
        for(Character c : map.keySet())
        {
            if(c == '4' || c == '7')
            {
                int val = map.get(c);

                if(val > count)
                {
                    count = val;
                    ans = c - '0';
                }
                else if(val == count)
                {
                    count = val ;

                    ans = Math.min(ans , c - '0');
                }
            }
        }

        System.out.println(ans);
    }
}
