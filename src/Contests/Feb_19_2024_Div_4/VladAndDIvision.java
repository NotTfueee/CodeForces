package Contests.Feb_19_2024_Div_4;

//File Created by -- > anuragbhatt
//Created On -- > 19/02/24,Monday

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

import static java.lang.System.out;


public class VladAndDIvision {

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

    public static void solve(FastReader sc)throws IOException
    {
        int n = sc.nextInt();

        long[] a = new long[n];

        var map = new HashMap<Long , Integer>();
        for(int i = 0 ; i < n ; ++i)
        {
            a[i] = sc.nextLong();
            map.put(a[i] , map.getOrDefault(a[i] , 0 ) + 1);
        }

        int ans = n ;

        for(int i = 0 ; i <n ; ++i)
        {
            long item = Integer.MAX_VALUE ^ a[i];

            if(map.containsKey(item) && map.containsKey(a[i]))
            {
                int v1 = map.get(item) , v2 = map.get(a[i]);

                if(v1 > 1)
                {
                    v1--;
                    map.put(item , v1);
                }
                else map.remove(item);

                if(v2 > 1)
                {
                    v2--;
                    map.put(a[i] , v2);

                }
                else map.remove(a[i]);

                ans--;
            }
        }

        out.println(ans);
    }
}
