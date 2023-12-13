package _800;//File Created by -- > anuragbhatt
//Created On -- > 04/10/23,Wednesday

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class JeffAndPeriods {
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

        int n = 9876 , count = 0 ;

        var ans = new ArrayList<Integer>();

        while( n / 10 != 0 )
        {
            int remain = n % 10 ;
            n = n / 10 ;

            if(remain != 0 )
            {
                ans.add((int) Math.pow(10,count) * remain);
            }

            count++;
        }
        ans.add((int) Math.pow(10 , count) * n);
        System.out.println(ans.size());
        System.out.println(ans);
    }
}
