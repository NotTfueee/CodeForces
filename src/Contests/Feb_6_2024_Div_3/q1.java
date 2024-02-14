package Contests.Feb_6_2024_Div_3;

//File Created by -- > anuragbhatt
//Created On -- > 06/02/24,Tuesday

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
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
            int n = sc.nextInt();

            String s = sc.next();

            var arr = new ArrayList<Integer>();

            for(int i = 0 ; i < n ;++i)
            {
                if(s.charAt(i) == 'B')arr.add(i);
            }

            if(!arr.isEmpty())
            {
                System.out.println(arr.get(arr.size()-1) - arr.get(0) + 1);
            }
            else System.out.println(0);
        }
    }
}
