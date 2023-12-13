package _1000;
//File Created by -- > anuragbhatt
//Created On -- > 03/12/23,Sunday

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.StringTokenizer;

public class NotACheapString {
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
            int c = sc.nextInt();

            var arr = new ArrayList<Integer>();

            int total = 0;
            for(int i = 0 ; i < s.length() ; ++i)
            {
                char ch = s.charAt(i);
                int num = ch-'a'+1;
                total += num;
                arr.add(num);
            }

            Collections.sort(arr);

            int j = arr.size()-1;
            while(total > c && j >= 0)
            {
                total -= arr.get(j);
                j--;
            }

            if(j < 0)
            {
                System.out.println(" ");
                continue;
            }

            var remain = new HashMap<Integer , Integer>();

            for(int i = 0 ; i <= j ; ++i)
            {
                remain.put(arr.get(i) , remain.getOrDefault(arr.get(i) , 0 ) + 1);
            }

            StringBuilder str = new StringBuilder();

            for(int i = 0 ; i < s.length() ; ++i)
            {
                char ch = s.charAt(i);

                if(remain.containsKey(ch-'a'+1))
                {
                    str.append(ch);
                    int val = remain.get(ch-'a'+1);

                    if(val > 1)
                    {
                        val--;
                        remain.put(ch-'a'+1 , val);
                    }
                    else remain.remove(ch-'a'+1);
                }
            }

            System.out.println(str.toString());
        }
    }
}
