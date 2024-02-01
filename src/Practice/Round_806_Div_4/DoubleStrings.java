package Practice.Round_806_Div_4;

//File Created by -- > anuragbhatt
//Created On -- > 01/02/24,Thursday

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class DoubleStrings {

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

            String[] strs = new String[n];

            var set = new HashSet<String>();

            for(int i = 0 ; i < n ; ++i)
            {
                strs[i] = sc.next();
                set.add(strs[i]);
            }

            StringBuilder ans = new StringBuilder();

            for(int i = 0 ; i < n ; ++i)
            {
                boolean ok = false;

                String s = strs[i];

                for(int j = 1 ; j < s.length() ; ++j)
                {
                    String prev = s.substring(0 , j) , next = s.substring(j);

                    if(set.contains(prev) && set.contains(next))
                    {
                        ok = true;
                        break;
                    }
                }

                if(ok)ans.append(1);
                else ans.append(0);
            }

            System.out.println(ans);
        }
    }
}
