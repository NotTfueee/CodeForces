package _800;
//File Created by -- > anuragbhatt
//Created On -- > 13/12/23,Wednesday

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class PolyCarpWritesAStringFromMemory {
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

        while(t-- > 0 )
        {
            String s = sc.next();
            var set = new HashSet<Character>();
            int count =0;


            for(int i = 0 ; i < s.length() ; ++i)
            {
                char ch = s.charAt(i);
                set.add(ch);

                if(set.size() > 3)
                {
                    count ++;
                    set.clear();
                    set.add(ch);
                }
            }

            if(!set.isEmpty())count ++;

            System.out.println(count);
        }
    }
}
