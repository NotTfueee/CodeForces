package Contests.Feb_19_2024_Div_4;

//File Created by -- > anuragbhatt
//Created On -- > 19/02/24,Monday

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

import static java.lang.System.out;


public class VladAndShapes {

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

    public static void solve(FastReader sc) throws  IOException
    {
        int n = sc.nextInt();

        char[][]a = new char[n][n];

        for(int i = 0 ; i < n ; ++i)
        {
            String s = sc.next();

            for(int j = 0 ; j < s.length() ; ++j)
            {
                a[i][j] = s.charAt(j);
            }
        }

        var set = new HashSet<Integer>();

        for(int i = 0 ; i < n ; ++i)
        {
            int c = 0;
            for(int j = 0 ; j < n ; ++j)
            {
                char item = a[i][j];
                if(item == '1')c++;
            }

            if(c > 0) set.add(c);
        }

        if(set.size() == 1)out.println("SQUARE");
        else out.println("TRIANGLE");
    }
}
