package Practice.Round_832_Div_2;
//File Created by -- > anuragbhatt
//Created On -- > 21/12/23,Thursday

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BanBan {
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
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

        int nextInt() { return Integer.parseInt(next()); }

        long nextLong() { return Long.parseLong(next()); }

        double nextDouble() { return Double.parseDouble(next()); }

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

            if(n == 1)
            {
                System.out.println(1);
                System.out.println(1 + " "+ 2);
                continue;
            }

            int len = n * 3;

            if(n % 2 == 0)
            {
                int k = n / 2;
                System.out.println(k);
                int bi = 1 , ai = len - 1;

                for(int i = 0 ; i < k ; ++i)
                {
                    System.out.println(bi + " " + ai);
                    bi += 3;
                    ai -= 3;
                }
            }
            else
            {
                int k = (n / 2 ) + 1;
                System.out.println(k);

                int bi = 1 , ai = len - 1;
                for(int i = 0 ; i < k ; ++i)
                {
                    System.out.println(ai + " " + bi);
                    bi += 3;
                    ai -= 3;
                }
            }
        }
    }
}