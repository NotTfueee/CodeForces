package Practice.Round_142_Div_2;

//File Created by -- > anuragbhatt
//Created On -- > 22/01/24,Monday

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

import static java.lang.Math.min;
import static java.lang.System.out;


public class StandUpComedian {

    public static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() throws IOException {
            while (st == null || !st.hasMoreElements()) {
                st = new StringTokenizer(br.readLine());
            }
            return st.nextToken();
        }

        int nextInt() throws IOException {
            return Integer.parseInt(next());
        }

        long nextLong() throws IOException {
            return Long.parseLong(next());
        }

        double nextDouble() throws IOException {
            return Double.parseDouble(next());
        }

        String nextLine() throws IOException {
            return br.readLine();
        }
    }

    public static void main(String[] args) throws IOException {
        var sc = new FastReader();
        int tt = sc.nextInt();

        while(tt-- > 0)
        {
            long a1 = sc.nextLong() , a2 = sc.nextLong() , a3 = sc.nextLong() , a4 = sc.nextLong();

            if(a1 == 0)
            {
                out.println(1);
            }
            else
            {

                long ans = 0;
                if(a2 > a3)
                {
                    long temp = a2;
                    a2 = a3;
                    a3 = temp;
                }

                ans = a1 + 2*(a2) + min(a1 + 1 , (a3-a2) + a4);

                out.println(ans);
            }
        }
    }
}
