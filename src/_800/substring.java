package _800;//File Created by -- > anuragbhatt
//Created On -- > 25/09/23,Monday

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class substring {
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

        
        int T = sc.nextInt();

        for(int i = 0 ; i < T ; ++i)
        {
            String s = sc.nextLine();

            if(s.length() == 2)
            {
                System.out.println(s);
                continue;
            }

            String ans = "";

            for(int j = 1; j <= s.length()-2 ; ++j)
            {
                if(s.charAt(j) == s.charAt(j+1))
                {
                    ans += s.charAt(j);
                    j++;
                }
            }

            System.out.println(ans);
        }

    }
}
