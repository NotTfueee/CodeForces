package _1000;
//File Created by -- > anuragbhatt
//Created On -- > 02/12/23,Saturday

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CapsLock {
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

        int count = 0;

        for(int i = 0 ; i < s.length() ; ++i)
        {
            char item = s.charAt(i);

            if(item >= 65 && item <= 90)count ++;
        }

        if((count == s.length()-1 && s.charAt(0) >= 97 && s.charAt(0) <= 122 ))
        {
            String ans = Character.toUpperCase(s.charAt(0)) + s.substring(1).toLowerCase();
            System.out.println(ans);
        }
        else if(count == s.length())
        {
            System.out.println(s.toLowerCase());
        }
        else System.out.println(s);
    }
}
