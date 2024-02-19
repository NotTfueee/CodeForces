package Practice.Round_820_Div_3;

//File Created by -- > anuragbhatt
//Created On -- > 19/02/24,Monday

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.StringTokenizer;

import static java.lang.Math.abs;
import static java.lang.System.out;


public class JumpingOnTiles {

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
            solve(sc);
        }
    }

    public static class Pair implements Comparable<Pair>
    {
        int num ;
        StringBuilder str;

        Pair(int num , StringBuilder str)
        {
            this.num = num;
            this.str = str;
        }

        public int compareTo(Pair o)
        {
            return this.num - o.num;
        }
    }

    public static void solve(FastReader sc)throws IOException
    {
        String s = sc.next();
        int n = s.length();

        int f = s.charAt(0) - '0' , l = s.charAt(n-1)- '0' , small = 0 , big = 0;
        var map = new HashMap<Integer , StringBuilder >();

        for(int i = 0 ; i < n ; ++i) {
            int item = s.charAt(i) - '0';

            if (f > l && item <= f && item >= l) small++;
            else if (f <= l && item >= f && item <= l) big++;


            if(map.containsKey(item))
            {
                var idx = map.get(item);
                idx.append(i+1).append(" ");
                map.put(item , idx);
            }
            else
            {
                var idx = new StringBuilder();
                idx.append(i+1).append(" ");
                map.put(item , idx);
            }
        }

        var arr = new ArrayList<Pair>();

        for(int i : map.keySet())
        {
            arr.add(new Pair(i , map.get(i)));
        }

        Collections.sort(arr);

        StringBuilder ans = new StringBuilder();

        if(f > l)
        {
            for(int i = arr.size() - 1; i >= 0 ; --i)
            {
                var item = arr.get(i);

                if(item.num <= f && item.num >= l)ans.append(item.str);
            }
        }
        else
        {
            for(var i : arr)
            {
                if(i.num >= f && i.num <= l )ans.append(i.str);
            }
        }

        out.print(abs(f - l) + " ");
        out.print(small != 0 ? small : big);
        out.println("\n"+ans);
    }
}
