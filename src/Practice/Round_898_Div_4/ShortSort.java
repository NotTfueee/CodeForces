package Practice.Round_898_Div_4;
//File Created by -- > anuragbhatt
//Created On -- > 30/12/23,Saturday

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class ShortSort {
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
            String s = sc.next();

            if(s.equals("abc"))
            {
                System.out.println("YES");
                continue;
            }

            var map = new HashMap<Character , Integer>();
            map.put('a', 0);
            map.put('b', 1);
            map.put('c', 2);

            boolean isPossible = false;
            for(int i = 0 ; i < s.length() ; ++i)
            {
                char item = s.charAt(i);

                if(i == map.get(item))
                {
                    isPossible = true;
                    break;
                }
            }

            if(isPossible) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
