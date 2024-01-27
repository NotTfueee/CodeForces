package Practice.GoodBye2014;

//File Created by -- > anuragbhatt
//Created On -- > 27/01/24,Saturday

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class NewYearTransportation {

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
        int n = sc.nextInt(), d = sc.nextInt();

        int[] a = new int[n];

        for(int i = 1 ; i < n ; ++i)
        {
            a[i] = sc.nextInt();
        }

        int i = 1;

        while(i < d )
        {
            i += a[i];
        }

        System.out.println(i == d ? "YES" : "NO");
    }
}
