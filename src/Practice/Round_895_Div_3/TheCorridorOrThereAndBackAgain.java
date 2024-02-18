package Practice.Round_895_Div_3;

//File Created by -- > anuragbhatt
//Created On -- > 15/02/24,Thursday

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

import static java.lang.Math.min;
import static java.lang.System.out;

public class TheCorridorOrThereAndBackAgain {

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

    public static class Pair implements Comparable<Pair>
    {
        int d ;
        int s ;

        Pair(int d, int s)
        {
            this.d = d;
            this.s = s;
        }

        public int compareTo(Pair o)
        {
            return this.d - o.d;
        }
    }

    public static void main(String[] args) throws IOException {
        var sc = new FastReader();
        int t = sc.nextInt();

        while(t-- > 0)
        {
            int n = sc.nextInt();

            Pair[] trap = new Pair[n];

            for(int i = 0 ; i < n ; ++i)
            {
                trap[i] = new Pair(sc.nextInt() , sc.nextInt());
            }

            Arrays.sort(trap);

            int min = Integer.MAX_VALUE;

            for(int i = 0 ; i < n ; ++i)
            {
                var item = trap[i];

                if((item.s & 1) == 0)
                {
                    int r = (item.s / 2)-1;
                    min = min(min , r + item.d);
                }
                else
                {
                    min = min(min , item.d + (item.s/2));
                }
            }

            out.println(min);
        }
    }
}
