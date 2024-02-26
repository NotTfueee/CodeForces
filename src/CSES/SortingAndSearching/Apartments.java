package CSES.SortingAndSearching;//File Created by -- > anuragbhatt
//Created On -- > 26/02/24,Monday

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

import static java.lang.System.out;


public class Apartments {

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

    public static void solve(FastReader sc)throws IOException
    {
        int n = sc.nextInt() , m = sc.nextInt();
        long k = sc.nextLong();

        long[] a = new long[n];

        for(int i = 0 ; i < n ; ++i)a[i] = sc.nextLong();

        long[] b = new long[m];

        for(int i = 0 ; i < m ; ++i)b[i] = sc.nextLong();

        Arrays.sort(a);
        Arrays.sort(b);

        int j = 0 , c = 0;

        for(int i = 0 ; i < n && j < m ; ++i)
        {
            if(a[i] - k > b[j])j ++;
            else if(b[j] > a[i] + k)continue;
            else
            {
                c++;
            }
        }

        out.println(c);
    }
}
