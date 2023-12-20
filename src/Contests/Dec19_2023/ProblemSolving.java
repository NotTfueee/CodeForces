package Contests.Dec19_2023;
//File Created by -- > anuragbhatt
//Created On -- > 19/12/23,Tuesday

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class ProblemSolving {
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

        while(t-- > 0)
        {
            int n = sc.nextInt();
            String s = sc.next();

            var map = new HashMap<Character , Integer>();
            for(char ch = 'A' ; ch <= 'Z' ; ++ch)
            {
                map.put(ch , ch-'A'+1);
            }

            var map2 = new HashMap<Character , Integer>();
            for(int i = 0 ; i < n ; ++i)
            {
                char ch = s.charAt(i);
                map2.put(ch , map2.getOrDefault(ch , 0) + 1);
            }

            int count = 0;
            for(char ch : map2.keySet())
            {
                int val1 = map.get(ch) , val2 = map2.get(ch);

                if(val2 >= val1)count++;
            }

            System.out.println(count);
        }
    }
}
