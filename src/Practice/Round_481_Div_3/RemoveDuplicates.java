package Practice.Round_481_Div_3;

//File Created by -- > anuragbhatt
//Created On -- > 18/02/24,Sunday

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

import static java.lang.System.out;


public class RemoveDuplicates {

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
        int t = 1;

        while(t-- > 0)
        {
            solve(sc);
        }
    }

    public static class Pair implements Comparable<Pair>
    {
        int val ;
        int e;

        Pair(int val , int e)
        {
            this.val = val;
            this.e = e;

        }

        public int compareTo(Pair o)
        {
            return this.e - o.e;
        }
    }

    public static void solve(FastReader sc) throws IOException {
        int n = sc.nextInt();
        int[] a = new int[n];

        var map = new HashMap<Integer , Integer>();
        var q = new PriorityQueue<Pair>();

        for(int i = 0 ; i < n ; ++i)
        {
            a[i] = sc.nextInt();
            map.put(a[i] , i);
        }


        for(int i : map.keySet())
        {
            q.add(new Pair(i , map.get(i)));
        }

        StringBuilder ans = new StringBuilder();
        out.println(q.size());
        while(!q.isEmpty())
        {
            ans.append(q.remove().val).append(" ");
        }

        out.println(ans);
    }
}
