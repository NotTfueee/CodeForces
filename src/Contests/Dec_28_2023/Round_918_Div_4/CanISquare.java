package Contests.Dec_28_2023.Round_918_Div_4;
//File Created by -- > anuragbhatt
//Created On -- > 28/12/23,Thursday

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CanISquare {
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

            long sum = 0 ;

            for(int i = 0 ; i < n ; ++i)
            {
                sum += sc.nextInt();
            }

            long num = (long)Math.sqrt(sum);

            if(num * num == sum) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
