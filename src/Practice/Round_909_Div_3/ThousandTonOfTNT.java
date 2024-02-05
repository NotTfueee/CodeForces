package Practice.Round_909_Div_3;

//File Created by -- > anuragbhatt
//Created On -- > 05/02/24,Monday

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class ThousandTonOfTNT {

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
            long[] a = new long[n];

            for(int i = 0 ; i < n ; ++i)a[i] = sc.nextLong();

            var fac = find(n);

            long max = 0;

            for (Integer integer : fac) {
                long val = check(a, integer);
                max = Math.max(max, val);
            }

            System.out.println(max);
        }
    }

    public static ArrayList<Integer> find(int n)
    {
        var f = new ArrayList<Integer>();
        for(int i = 1; i < n ; ++i)
        {
            if(n % i == 0)f.add(i);
        }

        return f;
    }

    public static long check(long[] a , int val)
    {
        long min = Long.MAX_VALUE, max = Long.MIN_VALUE , sum = 0;
        int j= 0;
        for(int i = 0 ; i < a.length ; ++i , ++j)
        {
            if(j < val)
            {
                sum += a[i];
            }
            else
            {
                min = Math.min(min , sum);
                max = Math.max(max , sum);
                sum = a[i];
                j = 0;
            }
        }

        min = Math.min(min , sum);
        max = Math.max(max , sum);
        return max - min;
    }
}
