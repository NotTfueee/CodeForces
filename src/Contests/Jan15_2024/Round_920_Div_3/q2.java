package Contests.Jan15_2024.Round_920_Div_3;
//File Created by -- > anuragbhatt
//Created On -- > 15/01/24,Monday

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class q2 {
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

        while(t-- > 0 )
        {
            int n = sc.nextInt();
            String s = sc.next() , f = sc.next();

            if(s.equals(f))
            {
                System.out.println(0);
                continue;
            }

            int c1 = 0 , c2 = 0 ;
            for(int i = 0 ; i < s.length() ; ++i)
            {
                char i1 = s.charAt(i);
                char i2 = f.charAt(i);

                if(i1 == '1')c1++;
                if(i2 == '1')c2++;
            }

            for(int i = 0 ; i < s.length() ; ++i)
            {
                char i1 = s.charAt(i);
                char i2 = f.charAt(i);

                if(i1 == '1' && i2 == '1')
                {
                    c1--;
                    c2--;
                }
            }


            System.out.println(Math.max(c1 , c2));
        }
    }
}
