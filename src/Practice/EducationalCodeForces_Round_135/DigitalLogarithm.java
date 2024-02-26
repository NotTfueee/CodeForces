package Practice.EducationalCodeForces_Round_135;

//File Created by -- > anuragbhatt
//Created On -- > 01/02/24,Thursday

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class DigitalLogarithm {

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

        while(t-- > 0) {
            int n = sc.nextInt();

            long[] a = new long[n];
            long[] b = new long[n];

            var map1 = new HashMap<Long, Integer>();
            var map2 = new HashMap<Long, Integer>();

            for (int i = 0; i < n; ++i) {
                a[i] = sc.nextLong();
                map1.put(a[i] , map1.getOrDefault(a[i] , 0 ) + 1);
            }

            for(int i = 0 ; i < n ; ++i)
            {
                b[i] = sc.nextLong();

                if(map1.containsKey(b[i]))
                {
                    int val = map1.get(b[i]);

                    if(val > 1)
                    {
                        val--;
                        map1.put(b[i] , val);
                    }
                    else map1.remove(b[i]);
                }
                else map2.put(b[i] , map2.getOrDefault(b[i] , 0 ) + 1);
            }

            Arrays.sort(a);
            Arrays.sort(b);

            int count = 0;

        }
    }
}
