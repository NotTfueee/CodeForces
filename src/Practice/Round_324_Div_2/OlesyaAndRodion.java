package Practice.Round_324_Div_2;
//File Created by -- > anuragbhatt
//Created On -- > 04/01/24,Thursday

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class OlesyaAndRodion {
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

        int n = sc.nextInt() , t = sc.nextInt();

        if(t == 10 && n == 1) System.out.println(-1);
        else if(t == 10 && n > 1)
        {
            StringBuilder ans = new StringBuilder();
            for(int i = 0 ; i < n-2 ; ++i)
            {
                ans.append("1");
            }

            ans.append("10");

            System.out.println(ans);
        }
        else
        {
            StringBuilder ans = new StringBuilder();
            for(int i = 0 ; i < n ; ++i)
            {
                ans.append(t);
            }

            System.out.println(ans);
        }
    }
}
