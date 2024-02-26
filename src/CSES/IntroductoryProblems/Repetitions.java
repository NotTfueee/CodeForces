package CSES.IntroductoryProblems;

//File Created by -- > anuragbhatt
//Created On -- > 26/02/24,Monday

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

import static java.lang.Math.max;
import static java.lang.System.out;


public class Repetitions {

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
            out.println(solve(sc));
        }
    }

    public static int solve(FastReader sc)throws IOException
    {
        String s = sc.next();

        int max = 0 , start = 0;

        for(int i = 1 ; i < s.length() ; ++i)
        {
            char item = s.charAt(i);

            if(item != s.charAt(i-1))
            {
                max = max(max , i - start);
                start = i;
            }
        }

        max = max(max , s.length() - start);
        return max;
    }
}
