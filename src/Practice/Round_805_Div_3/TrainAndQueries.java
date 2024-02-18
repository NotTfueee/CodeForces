package Practice.Round_805_Div_3;

//File Created by -- > anuragbhatt
//Created On -- > 17/02/24,Saturday

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

import static java.lang.System.out;


public class TrainAndQueries {

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

    public static class Pair
    {
        int s ;
        int e ;

        Pair(int s , int e )
        {
            this.s = s;
            this.e = e;
        }
    }

    public static void main(String[] args) throws IOException {
        var sc = new FastReader();
        int t = sc.nextInt();


        while (t-- > 0) {
            sc.nextLine();

            int n = sc.nextInt() , k = sc.nextInt();

            long[] a = new long[n];

            var map = new HashMap<Long , Pair>();

            for(int i = 0 ; i <n ; ++i)
            {
                a[i] = sc.nextLong();

                if(!map.containsKey(a[i]))
                {
                    map.put(a[i] , new Pair(i , i));
                }
                else
                {
                    var idx = map.get(a[i]);
                    idx.e = i;

                    map.put(a[i] , idx);
                }
            }

            for(int i = 0 ; i < k ; ++i)
            {
                long s1 = sc.nextLong() , s2 = sc.nextLong();

                if(!map.containsKey(s1) || !map.containsKey(s2))
                {
                    out.println("NO");
                    continue;
                }

                if(map.get(s2).e > map.get(s1).s)out.println("YES");
                else out.println("NO");

            }
        }

    }
}
