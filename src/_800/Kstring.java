package _800;//File Created by -- > anuragbhatt
//Created On -- > 03/10/23,Tuesday

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Kstring {
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

        int k = 2 ;
        String s = "zzccdd";

        var map = new HashMap<Character , Integer>();

        for(int i = 0 ; i < s.length() ; ++i)
        {
            map.put(s.charAt(i) , map.getOrDefault(s.charAt(i) , 0) + 1);
        }

        String ans = "";
        int i = 0 ;

        while(ans.length() != s.length())
        {
            char item = s.charAt(i);

        }

    }
}
