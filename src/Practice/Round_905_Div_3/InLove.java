package Practice.Round_905_Div_3;

//File Created by -- > anuragbhatt
//Created On -- > 12/02/24,Monday

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.StringTokenizer;

public class InLove {

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

    public static class Pair
    {
        long l ;
        long r ;

        Pair(long l , long r)
        {
            this.l = l ;
            this.r = r;
        }

        public int compareTo(Pair o)
        {
            return Long.compare(this.l , o.l);
        }
    }

    public static void main(String[] args) throws IOException {
        var sc = new FastReader();
        int t = sc.nextInt();

        while (t-- > 0)
        {
            int q = sc.nextInt();

            var dq = new ArrayDeque<Pair>();

            while(q-- > 0)
            {
                dq.add(new Pair(sc.nextLong() , sc.nextLong()));
            }
        }
    }
}
