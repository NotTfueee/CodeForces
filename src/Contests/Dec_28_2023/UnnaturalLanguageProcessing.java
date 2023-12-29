package Contests.Dec_28_2023;
//File Created by -- > anuragbhatt
//Created On -- > 28/12/23,Thursday

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class UnnaturalLanguageProcessing {
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
            int n = sc.nextInt();

            StringBuilder s = new StringBuilder(sc.next());
            StringBuilder res = new StringBuilder();


            while (!s.isEmpty()) {
                int x;
                if (s.charAt(s.length() - 1) == 'a' || s.charAt(s.length() - 1) == 'e') {
                    x = 2;
                } else {
                    x = 3;
                }

                while (x-- > 0) {
                    res.append(s.charAt(s.length()-1));
                    s.deleteCharAt(s.length()-1);
                }
                res.append('.');
            }
            res.deleteCharAt(res.length() - 1);
            res.reverse();
            System.out.println(res);
        }
    }
}
