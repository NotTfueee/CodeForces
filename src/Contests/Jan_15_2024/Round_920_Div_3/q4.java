package Contests.Jan_15_2024.Round_920_Div_3;
//File Created by -- > anuragbhatt
//Created On -- > 15/01/24,Monday

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class q4 {
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(
                    new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                if (st.hasMoreTokens()) {
                    str = st.nextToken("\n");
                } else {
                    str = br.readLine();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }

    public static void main(String[] args) {

        var sc = new FastReader();
        int t = sc.nextInt();

        while(t-- > 0)
        {
            int n = sc.nextInt() , m = sc.nextInt();
            var a = new ArrayList<Long>();
            var b = new ArrayList<Long>();

            for(int i = 0 ; i < n ; ++i) a.add(sc.nextLong());

            for(int i = 0 ; i < m ; ++i) b.add(sc.nextLong());


            Collections.sort(a);
            b.sort(Collections.reverseOrder());

            long res = 0;
            int i = 0 ;
            while(n-- > 0)
            {
                if(Math.abs(b.get(i) - a.get(i)) >= Math.abs(b.get(b.size()-1) - a.get(a.size() -1)))
                {
                    res += Math.abs(b.get(i) - a.get(i));
                    i++;
                }
                else
                {
                    res += Math.abs(b.get(b.size()-1) - a.get(a.size()-1));
                    b.remove(b.size()-1);
                    a.remove(a.size()-1);
                }

            }

            System.out.println(res);
        }
    }
}
