package Practice.Round_383_Div_2;
//File Created by -- > anuragbhatt
//Created On -- > 18/01/24,Thursday

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class ArpasHardExam {
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
        long n = sc.nextLong();

        if(n == 0)
        {
            System.out.println(1);
            return ;
        }
        var map = new HashMap<Integer , Integer>();
        map.put(1,8);
        map.put(2,4);
        map.put(3,2);
        map.put(0,6);

        int rem = (int)n % 4;

        System.out.println(map.get(rem));
    }
}
