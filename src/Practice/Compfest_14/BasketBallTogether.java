package Practice.Compfest_14;

//File Created by -- > anuragbhatt
//Created On -- > 28/01/24,Sunday

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class BasketBallTogether {

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

        long n = sc.nextLong() , d = sc.nextLong();
        var a = new ArrayList<Long>();

        for(long i = 0 ; i < n ; ++i)
        {
            a.add(sc.nextLong());
        }

        Collections.sort(a);

        var dq = new ArrayDeque<Long>(a);

        long count = 0 ;

        while(!dq.isEmpty())
        {
            long last = dq.removeLast() , r;

            if(d % last == 0)
            {
                r = d / last;
            }
            else
            {
                r = (long) Math.ceil((double)d / last);
                r--;
            }

            if(dq.size() < r)break;

            while(r-- > 0)
            {
                dq.removeFirst();
            }

            count ++;
        }

        System.out.println(count);
    }
}
