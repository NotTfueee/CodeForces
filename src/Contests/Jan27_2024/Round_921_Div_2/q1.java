package Contests.Jan27_2024.Round_921_Div_2;

//File Created by -- > anuragbhatt
//Created On -- > 27/01/24,Saturday

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class q1 {

    public static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() throws IOException {
            while (st == null || !st.hasMoreElements()) {
                st = new StringTokenizer(br.readLine());
            }
            return st.nextToken();
        }

        int nextInt() throws IOException {
            return Integer.parseInt(next());
        }

        long nextLong() throws IOException {
            return Long.parseLong(next());
        }

        double nextDouble() throws IOException {
            return Double.parseDouble(next());
        }

        String nextLine() throws IOException {
            return br.readLine();
        }
    }

    public static void main(String[] args) throws IOException {
        var sc = new FastReader();
        int t = sc.nextInt();

        while(t-- > 0)
        {
            int n = sc.nextInt() , k = sc.nextInt() , i = 0;

            StringBuilder s = new StringBuilder();

            for(char ch = 'a' ; ch <= 'z' && i < k ; ++ch , ++i)
            {
                s.append(ch);
            }

            StringBuilder ans = new StringBuilder();

            while(n-- > 0)
            {
                ans.append(s);
            }

            System.out.println(ans.toString());
        }
    }
}
