package Practice.GoodBye2022;
//File Created by -- > anuragbhatt
//Created On -- > 13/01/24,Saturday

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class KoxiaAndWhiteBoard {
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
            int n = sc.nextInt() , m = sc.nextInt();
            var pq = new PriorityQueue<Long>();

            for(int i = 0 ; i < n ; ++i)
            {
                long item = sc.nextLong();
                pq.add(item);
            }

            for(int i = 0 ; i < m ; ++i)
            {
                pq.remove();
                pq.add(sc.nextLong());
            }

            long sum = 0L;

            while(!pq.isEmpty()) sum += pq.remove();

            System.out.println(sum);
        }
    }
}
