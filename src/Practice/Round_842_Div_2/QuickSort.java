package Practice.Round_842_Div_2;

//File Created by -- > anuragbhatt
//Created On -- > 25/02/24,Sunday

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

import static java.lang.Math.min;
import static java.lang.System.out;


public class QuickSort {

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

    public static void solve(FastReader sc) throws IOException
    {

        int n = sc.nextInt() , k = sc.nextInt();
        int[] a = new int[n];

        for(int i = 0 ; i < n ; ++i)
        {
            a[i] = sc.nextInt();
        }

        int small = n + 1 , ans = n + 1;

        for(int i = n-1 ; i >= 0; --i)
        {
            if(a[i] > small)ans = min(ans , a[i]);

            small = min(small , a[i]);
        }

        if(ans == n + 1)out.println(0);
        else
        {
            ans = n - ans + 1;

            if(ans % k == 0)out.println(ans / k);
            else out.println((ans/k) + 1);
        }

    }
}
