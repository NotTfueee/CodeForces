package Practice.Round_886_Div_4;

//File Created by -- > anuragbhatt
//Created On -- > 07/02/24,Wednesday

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.StringTokenizer;

public class WeWereBothChildren {

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

    public static void main(String[] args) throws IOException
    {
        var sc = new FastReader();
        int t = sc.nextInt();

        while(t-- > 0)
        {
            int n = sc.nextInt();
            long[] a = new long[n];

            var map = new HashMap<Long , Integer>();

            for(int i = 0 ; i < n ; ++i)
            {
                a[i] = sc.nextLong();
                map.put(a[i] , map.getOrDefault(a[i] , 0 ) + 1);
            }

            int max = 0;
            for(int i = 1 ; i <= n ; ++i)
            {
                var fac = count(map , i);
                int c = 0;
                for(int f : fac)
                {
                    if(map.containsKey((long)f))
                    {
                        c += map.get((long)f);
                    }
                }

                max = Math.max(max , c);
            }

            System.out.println(max);
        }

    }

    public static ArrayList<Integer> count(HashMap<Long, Integer> map, int n)
    {
        var set = new HashSet<Integer>();
        for (int i = 1; i * i <= n; ++i)
        {
            if (n % i == 0) {
                set.add(i);
                set.add(n / i);
            }
        }

        return new ArrayList<>(set);
    }
}
