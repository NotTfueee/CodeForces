package Practice.Round_86_Div_2;

//File Created by -- > anuragbhatt
//Created On -- > 25/01/24,Thursday

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class RoadToZero {

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

        while(tt -- > 0)
        {
            long x = sc.nextLong() , y = sc.nextLong();
            long a = sc.nextLong() , b = sc.nextLong();

            long total = 0;

            if(x > y)
            {
                long temp = x;
                x = y;
                y = temp;
            }

            total = (y - x) * a;

            long min = Math.min(2*a , b);
            total += x * min;

            System.out.println(total);

        }
    }
}
