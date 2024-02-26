package Practice.Round_142_Div_2;

//File Created by -- > anuragbhatt
//Created On -- > 31/01/24,Wednesday

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class TPrimes {

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

        int n = sc.nextInt() , limit = 1000001;

        boolean[] check = new boolean[limit];

        for(int i = 2 ; i * i < limit ; ++i)
        {

            if(!check[i])
            {
                for(int j = i * i ; j < limit ; j += i)
                {
                    check[j] = true;
                }
            }
        }

        var set = new HashSet<Long>();
        for(int i = 2 ; i < limit ; ++i)
        {
            if(!check[i])
            {
                set.add((long) i * i);
            }
        }

        for(int i = 0 ; i < n ; ++i)
        {
            long item = sc.nextLong();

            if(set.contains(item)) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
