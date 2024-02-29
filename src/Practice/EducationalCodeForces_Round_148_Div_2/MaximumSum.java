package Practice.EducationalCodeForces_Round_148_Div_2;

//File Created by -- > anuragbhatt
//Created On -- > 29/02/24,Thursday

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

import static java.lang.Math.max;
import static java.lang.System.out;


public class MaximumSum {

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

    public static void solve(FastReader sc)throws IOException {
        int n = sc.nextInt(), k = sc.nextInt();

        long[] a = new long[n];

        for(int i = 0 ; i < n ; ++i) a[i] = sc.nextLong();

        Arrays.sort(a);

        long[] pfs = new long[n+1];
        long sum = 0;
        for(int i = 0 ; i < n ; ++i)
        {
            sum += a[i];
            pfs[i+1] = sum;
        }

        long ans = 0;
        for(int i = 0 ; i <= k ; ++i)
        {
            ans = max(ans , pfs[n-i] - pfs[2*(k-i)]);
        }

        out.println(ans);
    }
}
