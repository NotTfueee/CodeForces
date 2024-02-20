package Contests.Feb_19_2024_Div_4;

//File Created by -- > anuragbhatt
//Created On -- > 19/02/24,Monday

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

import static java.lang.System.out;


public class VladAndASumOfSumOfDigits {

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

    public static ArrayList<Long> arr = new ArrayList<>();
    public static void main(String[] args) throws IOException {
        var sc = new FastReader();
        int t = sc.nextInt();

        long val = 0;
        for(long i = 1 ; i <= 2e5 ; ++i)
        {
            long x = i;

            while(x > 0)
            {
                val += x % 10;
                x /= 10;
            }

            arr.add(val);
        }

        while(t-- > 0)
        {
            solve(sc );
        }
    }

    public static void solve(FastReader sc)throws  IOException {

        int n = sc.nextInt();

        out.println(arr.get(n-1));

    }

}
