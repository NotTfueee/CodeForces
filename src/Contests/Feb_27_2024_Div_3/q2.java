package Contests.Feb_27_2024_Div_3;

//File Created by -- > anuragbhatt
//Created On -- > 27/02/24,Tuesday

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

import static java.lang.Math.ceil;
import static java.lang.System.out;


public class q2 {

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

        var map = new HashMap<Integer, Integer>();

        long sum = 0 ;
        for(int i = 0 ; i <n ; ++i)
        {
            a[i] = sc.nextInt();
            sum += a[i];

            map.put(a[i] , map.getOrDefault(a[i] , 0 ) + 1);
        }

        if((sum % 3 == 0))
        {
            out.println(0);
            return ;
        }

        long temp = sum;

        for(int i = 0 ; i < n ; ++i)
        {
            if((temp - a[i]) % 3 == 0)
            {
                out.println(1);
                return;
            }

            temp = sum;

        }

        int r = (int) ceil((double) sum / 3);

        out.println(r* 3L - sum);
    }
}
