package _800;//File Created by -- > anuragbhatt
//Created On -- > 17/09/23,Sunday

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Panagram {
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
        FastReader sc  = new FastReader();
        int n = sc.nextInt();
        String s = sc.next().toLowerCase();
        var map = new HashMap<Character , Integer>();

        for(int i = 0 ;i < n ; i ++)
        {
            char item = s.charAt(i);

            map.put(item , map.getOrDefault(item , 0 )+1);
        }

        if(map.size() == n / 2)System.out.println("YES");
        else System.out.println("NO");
    }
}
