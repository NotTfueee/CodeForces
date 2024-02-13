package Practice.Round_895_Div_3;

//File Created by -- > anuragbhatt
//Created On -- > 13/02/24,Tuesday

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class TwoVessels {

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
            int a = sc.nextInt() , b = sc.nextInt() , c = sc.nextInt();

            if(a == b)
            {
                System.out.println(0);
                continue;
            }

            if(a < b)
            {
                int temp = a ;
                a = b;
                b = temp;
            }

            int count = 0;
            while(a > b)
            {
                a -= c;
                count ++;
                b += c;
            }

            System.out.println(count);
        }
    }
}
