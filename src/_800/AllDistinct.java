package _800;
//File Created by -- > anuragbhatt
//Created On -- > 15/11/23,Wednesday

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class AllDistinct {
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

        FastReader sc = new FastReader();

        int t = sc.nextInt();

        for(int j = 0 ; j < t; ++j)
        {
            int len = sc.nextInt();
            var set = new HashSet<Integer>();

            for(int i = 0 ; i < len ; ++i)
            {
                set.add(sc.nextInt());
            }

            if( len % 2 == 0 && set.size() % 2 == 0 )System.out.println(set.size());
            else if(len % 2 != 0 && set.size() % 2 != 0 ) System.out.println(set.size());
            else System.out.println(set.size()-1);

        }
    }
}
