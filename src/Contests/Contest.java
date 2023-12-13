package Contests;//File Created by -- > anuragbhatt
//Created On -- > 17/11/23,Friday

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Contest {
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
            String s = sc.next();
            String col = s.charAt(0)+"";
            int row = s.charAt(1)-'0';

            for(int i = 1 ; i <= 8 ; ++i)
            {
                if(i != row) System.out.println(col+""+i);
            }

            for(int i = 97 ; i <= 104 ; ++i)
            {
                if((char)i != s.charAt(0))
                {
                    System.out.println((char)i+""+row);
                }
            }
        }
    }
}
