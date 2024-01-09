package Practice.Round_720_Div_2;
//File Created by -- > anuragbhatt
//Created On -- > 08/01/24,Monday

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class NastiaAndNearlyGoodNumber {
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
            long a = sc.nextLong() , b = sc.nextLong();

            if(b == 1)
            {
                System.out.println("NO");
                continue;
            }

            System.out.println("YES");
            System.out.println(a + " " + (a*b) + " " + (a*(b+1)));
        }
    }
}
