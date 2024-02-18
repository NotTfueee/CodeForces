package Contests.Feb_18_2024_Div_3;

//File Created by -- > anuragbhatt
//Created On -- > 18/02/24,Sunday

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

import static java.lang.System.out;


public class q3 {

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

    public static void solve(FastReader sc) throws IOException
    {
        int n = sc.nextInt();

        String s = sc.next();

        int b = -1;

        for(int i = 0 ; i < n ; ++i)
        {
            char item = s.charAt(i);

            if(item == '*')
            {
                int count = 0;
                b = i;
                while(i < n && s.charAt(i) == '*')
                {
                    count ++;
                    i++;
                }

                if(count >= 2)
                {
                    break;
                }
                else b = -1;
            }
        }

        if(b == -1)
        {
            int c = 0;
            for(int i = 0 ; i <n ; ++i)
            {
                char item = s.charAt(i);

                if(item == '@')c++;
            }

            out.println(c);
        }
        else
        {
            int c = 0;
            for(int i = 0 ; i < b ; ++i)
            {
                char item = s.charAt(i);
                if(item == '@')c++;
            }

            out.println(c);
        }
    }

}
