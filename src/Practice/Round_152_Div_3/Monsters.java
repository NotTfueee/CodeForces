package Practice.Round_152_Div_3;

//File Created by -- > anuragbhatt
//Created On -- > 22/01/24,Monday

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Monsters {

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
        long i ;
        ArrayList<Integer> idx;

        Pair(long i ,  ArrayList<Integer> idx)
        {
            this.i = i;
            this.idx = idx;
        }
        @Override
        public int compareTo(Pair o) {
           return Long.compare(o.i , this.i);
        }
    }

    public static void main(String[] args) throws IOException {

        var sc = new FastReader();
        int tt = sc.nextInt();

        while(tt -- > 0)
        {
            int n = sc.nextInt();
            long k = sc.nextLong();

            long[] arr = new long[n];

            for(int i = 0 ; i < n ; ++i)
            {
                arr[i] = sc.nextLong();
            }

            var map = new HashMap<Long , ArrayList<Integer>>();
            var ans = new ArrayList<Integer>();

            for(int i = 0 ; i < n ; ++i)
            {
                long r = arr[i] % k;

                if(r == 0)
                {
                    ans.add(i+1);
                    continue;
                }

                if(map.containsKey(r))
                {
                    var idx = map.get(r);
                    idx.add(i+1);
                    map.put(r , idx);
                }
                else
                {
                    var idx = new ArrayList<Integer>();
                    idx.add(i + 1);
                    map.put(r , idx);
                }
            }

            var pq = new PriorityQueue<Pair>();

            for(long i : map.keySet())
            {
                pq.add(new Pair(i , map.get(i)));
            }


            while(!pq.isEmpty())
            {
                var top = pq.remove();
                ans.addAll(top.idx);
            }

            StringBuilder s = new StringBuilder();
            for (Integer an : ans) {
                s.append(an).append(" ");
            }

            System.out.println(s);

        }
    }
}
