package Practice.Round_823_Div_2;

//File Created by -- > anuragbhatt
//Created On -- > 30/01/24,Tuesday

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class MinimumNotation {

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
            String s = sc.next();
            int n = s.length();

            int[] ss = new int[n];

            for(int i = 0 ; i < n ; ++i)
            {
                int item = s.charAt(i) - '0';
                ss[i] = item;
            }

            int prev = ss[n-1];

            for(int i = n - 2 ; i >= 0 ; --i)
            {
                if(ss[i] > prev)
                {
                    ss[i] = Math.min(ss[i] + 1 , 9);
                }
                else
                {
                    prev = ss[i];
                }
            }

            Arrays.sort(ss);

            StringBuilder ans = new StringBuilder();

            for(int i : ss)
            {
                ans.append(i);
            }

            System.out.println(ans);
        }
    }
}
