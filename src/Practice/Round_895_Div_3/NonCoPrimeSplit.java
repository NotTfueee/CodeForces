package Practice.Round_895_Div_3;

//File Created by -- > anuragbhatt
//Created On -- > 13/02/24,Tuesday

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class NonCoPrimeSplit {

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
            long l = sc.nextLong() , r = sc.nextLong();

            int flag = 0;

            for(long left = l ; left <= r ; ++left)
            {
                var f = find(left);

                if(!f.isEmpty() && f.get(0) != left)
                {
                    flag = 1;
                    System.out.println(left - f.get(0) + " " + f.get(0));
                    break;
                }
            }

            if(flag == 0) System.out.println(-1);
        }
    }

    public static ArrayList<Integer> find(long n)
    {
        var set = new ArrayList<Integer>();

        if(n % 2 == 0)
        {
            set.add(2);
            while(n % 2 == 0)
            {
                n /= 2;
            }
        }

        for(int i = 3; (long) i * i <= n ; i += 2)
        {
            if(n % i == 0)
            {
                set.add(i);
                while(n % i == 0)
                {
                    n /= i;
                }
            }
        }

        if(n > 2)set.add((int)n);

        return set;
    }
}
