package Practice.Round_855_Div_3;

//File Created by -- > anuragbhatt
//Created On -- > 20/01/24,Saturday

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class PoweringtheHero {

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
        int t = sc.nextInt();

        while(t-- > 0)
        {
            int n = sc.nextInt();
            long[] arr = new long[n];

            for(int i = 0 ; i < n ; ++i)
            {
                arr[i] = sc.nextLong();
            }

            var pq = new PriorityQueue<Long>(Comparator.reverseOrder());
            long sum = 0;

            for(int i = 0 ; i < n ; ++i)
            {
                if(arr[i] > 0)pq.add(arr[i]);
                else if(arr[i] == 0 && !pq.isEmpty())
                {
                    sum += pq.remove();
                }
            }

            System.out.println(sum);
        }
    }
}
