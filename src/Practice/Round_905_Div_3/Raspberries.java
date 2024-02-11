package Practice.Round_905_Div_3;

//File Created by -- > anuragbhatt
//Created On -- > 11/02/24,Sunday

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Raspberries {

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
            int n = sc.nextInt() , k = sc.nextInt() , ans = k , count = 0;

            for(int i = 0 ; i < n ; ++i)
            {
                int x = sc.nextInt();

                if(x % k == 0)ans = 0;

                if(x % 2 == 0 )count ++;

                ans = Math.min(ans , k - x%k);
            }

            if(k == 4)
            {
                if(count >=2 )ans = 0;
                else if(count == 1)ans = Math.min(ans , 1);
                else ans = Math.min(ans , 2);
            }

            System.out.println(ans);

        }

    }
}
