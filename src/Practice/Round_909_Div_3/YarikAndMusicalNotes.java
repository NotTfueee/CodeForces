package Practice.Round_909_Div_3;

//File Created by -- > anuragbhatt
//Created On -- > 12/02/24,Monday

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class YarikAndMusicalNotes {

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

            var map = new HashMap<Long , Long>();

            boolean one = false , two = false;

            for(int i = 0 ; i < n ; ++i)
            {
                a[i] = sc.nextLong();
                map.put(a[i] , map.getOrDefault(a[i] , 0L ) + 1);

                if(a[i] == 1)one = true;
                if(a[i] == 2)two = true;
            }

            long sum = 0 ;

            for(long k : map.keySet())
            {
                long count = map.get(k);
                sum += (count * (count - 1))/2;
            }

            if(one && two)
            {
                sum += (map.get(1L) * map.get(2L));
            }

            System.out.println(sum);
        }
    }
}
