package CSES.SortingAndSearching;
//File Created by -- > anuragbhatt
//Created On -- > 26/02/24,Monday

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

import static java.lang.System.out;


public class SumOfTwoValues {

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
        int t =1;

        while(t-- > 0)
        {
            out.println(solve(sc));
        }
    }

    public static StringBuilder solve(FastReader sc)throws IOException
    {
        int n = sc.nextInt();
        long x = sc.nextLong();

        long [] a = new long[n];

        var map = new HashMap<Long , Integer>();

        for(int i = 0 ; i < n ; ++i)
        {
            a[i] = sc.nextLong();
            map.put(a[i] , i+1);
        }

        Arrays.sort(a);

        int l = 0 , r = n - 1;

        StringBuilder ans = new StringBuilder();

        while(l < r)
        {
            if(a[l] + a[r] == x)return ans.append(map.get(a[l])).append(" ").append(map.get(a[r]));
            else if(a[l] + a[r] > x)r --;
            else l ++;
        }

        return new StringBuilder("IMPOSSIBLE");
    }
}
