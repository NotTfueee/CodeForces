package Practice.Round_905_Div_3;
//File Created by -- > anuragbhatt
//Created On -- > 27/12/23,Wednesday

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Chemistry {
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
            int n = sc.nextInt() , k = sc.nextInt();
            String s = sc.next();

            if(n == 1)
            {
                System.out.println("YES");
                continue;
            }

            System.out.println(find(s , k ));
        }
    }

    public static String find(String s , int k )
    {
        int n = s.length();

        var map = new HashMap<Character , Integer>();

        for(int i = 0 ; i < s.length() ; ++i)
        {
            char item = s.charAt(i);
            map.put(item , map.getOrDefault(item , 0) + 1);
        }

        int even = 0 , odd = 0 ;

        for(var ch : map.keySet())
        {
            int val = map.get(ch);

            if(val % 2 == 0 )even ++;
            else odd++;
        }

        if(odd > k + 1) return "NO";
        else return "YES";
    }
}
