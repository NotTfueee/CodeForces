package Practice.Round_871_Div_4;

//File Created by -- > anuragbhatt
//Created On -- > 11/02/24,Sunday

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class MrPerfectlyFine {

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
            var map = new HashMap<String , Integer>();
            map.put("00" , (int)1e6);
            map.put("11" , (int)1e6);
            map.put("01" , (int)1e6);
            map.put("10" , (int)1e6);

            while(n-- > 0)
            {
                int m = sc.nextInt();
                String s = sc.next();

                map.put(s , Math.min(map.get(s) , m));
            }

            if(Math.min(map.get("11") , map.get("01") + map.get("10")) >= (int)1e6) System.out.println(-1);
            else System.out.println(Math.min(map.get("11") , map.get("10") + map.get("01")));
        }
    }
}
