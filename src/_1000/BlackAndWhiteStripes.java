package _1000;
//File Created by -- > anuragbhatt
//Created On -- > 02/12/23,Saturday

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BlackAndWhiteStripes {
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

        while(t-- > 0 )
        {
            int l = sc.nextInt() , k = sc.nextInt();
            String s = sc.next();

            int start = 0  , count = 0 , min = Integer.MAX_VALUE;

            for(int i = 0 ; i < l ; ++i)
            {
                char item = s.charAt(i);

                if(item == 'B')count ++;
                if(i - start == k - 1)
                {
                    min = Math.min (min , (i - start + 1) - count);
                    if(s.charAt(start) == 'B')count--;
                    start ++;
                }
            }

            System.out.println(min);
        }
    }
}
