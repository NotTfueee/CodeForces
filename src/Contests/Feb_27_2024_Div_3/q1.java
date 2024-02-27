package Contests.Feb_27_2024_Div_3;

//File Created by -- > anuragbhatt
//Created On -- > 27/02/24,Tuesday

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

import static java.lang.System.out;


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

    public static void solve(FastReader sc)throws IOException
    {
        int n = sc.nextInt();

        int[] a = new int[n];

        for(int i = 0 ; i < n ; ++i)a[i] = sc.nextInt();

        Arrays.sort(a);

        int sum1 = 0 , sum2 = 0;

        for(int i = 0 ; i < n ; ++i)
        {
            if(a[i] < 0) sum1+= a[i];
            else sum2 += a[i];
        }

        sum1 = -sum1;

        out.println(sum1 + sum2);
    }
}
