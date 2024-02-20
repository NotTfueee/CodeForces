package Contests.Feb_19_2024_Div_4;

//File Created by -- > anuragbhatt
//Created On -- > 19/02/24,Monday

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

import static java.lang.System.out;


public class VladAndTheBestOfFive {

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

    public static void solve(FastReader sc)throws  IOException
    {
        String s = sc.next();

        int ca = 0 , cb = 0;

        for(int i = 0 ; i < s.length() ; ++i)
        {
            char item = s.charAt(i);
            if(item == 'A')ca ++;
            else cb++;
        }

        if(ca > cb)out.println("A");
        else out.println("B");

    }
}
