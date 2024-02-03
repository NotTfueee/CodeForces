package Practice.Round_847_Div_3;

//File Created by -- > anuragbhatt
//Created On -- > 03/02/24,Saturday

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Matryoshkas {

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
            long[] a = new long[n];

            var map = new HashMap<Long , Integer>();

            for(int i = 0; i < n ; ++i)
            {
                a[i] = sc.nextLong();
                map.put(a[i] , map.getOrDefault(a[i] , 0 ) + 1);
            }

            Arrays.sort(a);

            int count = 0;

            for(int i = 0 ; i < n ; ++i)
            {
                long item = a[i];

                if(!map.isEmpty() && map.containsKey(item) && !map.containsKey(item-1))
                {
                    while(map.containsKey(item))
                    {
                        int val = map.get(item);

                        if(val > 1)
                        {
                            val--;
                            map.put(item ,val);
                        }
                        else map.remove(item);

                        item++;
                    }

                    count++;
                }
            }

            System.out.println(count);
        }
    }
}
