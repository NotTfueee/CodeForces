package Contests.Dec_28_2023_Div_4;
//File Created by -- > anuragbhatt
//Created On -- > 28/12/23,Thursday

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class OddOneOut {
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
            int a = sc.nextInt() , b = sc.nextInt() , c = sc.nextInt();
            var map = new HashMap<Integer , Integer>();
            for(int i = 0 ; i < 3; ++i)
            {
                if(i == 0)map.put(a , map.getOrDefault(a , 0) + 1);
                if(i == 1 )map.put(b , map.getOrDefault(b , 0) + 1);
                if(i == 2 )map.put(c , map.getOrDefault(c , 0) + 1);
            }

            int ans = 0;
            for(int x : map.keySet())
            {
                int val = map.get(x);

                if(val == 1)
                {
                 ans = x;
                 break;
                }
            }

            System.out.println(ans);
        }
    }
}
