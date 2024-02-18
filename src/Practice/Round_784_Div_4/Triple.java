package Practice.Round_784_Div_4;

//File Created by -- > anuragbhatt
//Created On -- > 16/02/24,Friday

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;


public class Triple {

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
            int[] a = new int[n];

            var map = new HashMap<Integer , Integer>();
            for(int i = 0 ; i <n ; ++i)
            {
                a[i] = sc.nextInt();
                map.put(a[i] , map.getOrDefault(a[i] , 0 ) + 1);
            }

            int ans = -1;
            for(int i : map.keySet())
            {
                int val = map.get(i);

                if(val >= 3)
                {
                    ans = i;
                    break;
                }
            }

            System.out.println(ans);
        }
    }
}
