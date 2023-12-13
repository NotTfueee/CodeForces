package _800;
//File Created by -- > anuragbhatt
//Created On -- > 16/11/23,Thursday

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class PolycarpAndCoin {
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
        int t = sc.nextInt();

        for(int j = 0 ; j < t; ++j)
        {
            int n = sc.nextInt();

            if(n % 3 == 0 )
            {
                System.out.println(n/3 + " "+ n/3);
            }
            else if( n % 3 == 1)
            {
                int c2 = n/3 , c1 = n- (c2 *2);
                System.out.println(c1 + " " + c2);
            }
            else
            {
                int c1 = n/3 , c2 = (n/3)+1;
                System.out.println(c1 + " " +c2);
            }
        }
    }
}
