package Contests.Feb_18_2024_Div_3;

//File Created by -- > anuragbhatt
//Created On -- > 18/02/24,Sunday

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;


public class q1 {

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

    public static void solve(FastReader sc )throws IOException
    {
        int n = sc.nextInt();

        long[] A = new long[n];
        for (int i = 0; i < n; i++) {
            A[i] = sc.nextLong();
        }

        Set<Long> s = new HashSet<>();
        long ans = 0;

        for (int i = 0; i < n; i++) {
            long x = 1;
            long v = A[i];
            while (true) {
                if (A[i] > ans && !s.contains(A[i])) {
                    break;
                }
                A[i] = x * v;
                x++;
            }
            s.add(A[i]);
            ans = A[i];
        }
        System.out.println(A[n - 1]);
    }
}
