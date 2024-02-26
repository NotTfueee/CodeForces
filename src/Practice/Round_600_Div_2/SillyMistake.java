package Practice.Round_600_Div_2;

//File Created by -- > anuragbhatt
//Created On -- > 30/01/24,Tuesday

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class SillyMistake {

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

        int n = sc.nextInt();
        long[] a = new long[n];

        for(int i = 0 ; i < n ; ++i)
        {
            a[i] = sc.nextLong();
        }

        for(int i = 0 ; i < n ; ++i)
        {

        }
    }
}
