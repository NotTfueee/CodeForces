package _800;
//File Created by -- > anuragbhatt
//Created On -- > 15/11/23,Wednesday

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class DoNotBeDistracted {
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

        for(int j = 0 ; j < t ; ++j)
        {
            int len = sc.nextInt();
            String s = sc.nextLine();

            var map = new HashMap<Character , Integer>();

            for(int i = 0 ; i < len ; ++i)
            {
                char item = s.charAt(i);

                map.put(item , map.getOrDefault(item , 0 ) + 1);
            }
            boolean flag = true;
            for(int i = 0 ; i < len ; ++i)
            {
                char item = s.charAt(i);

                int count = map.get(item);

                while(i < len && s.charAt(i) == item)
                {
                    count--;
                    i++;
                }
                --i;

                if(count != 0)
                {
                    flag = false;
                    break;
                }
            }

            if(flag)System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
