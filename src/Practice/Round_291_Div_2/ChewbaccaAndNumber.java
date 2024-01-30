package Practice.Round_291_Div_2;

//File Created by -- > anuragbhatt
//Created On -- > 29/01/24,Monday

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ChewbaccaAndNumber {

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

        String s = sc.next();

        StringBuilder ans = new StringBuilder();

        for(int i = 0 ; i < s.length() ; ++i)
        {
            int num = s.charAt(i) - '0';
            int diff = 9- num;

            if(diff == 0 && i == 0 )
            {
                ans.append(num);
            }
            else ans.append(Math.min(diff, num));
        }

        System.out.println(ans);
    }
}
