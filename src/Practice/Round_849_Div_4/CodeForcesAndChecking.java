package Practice.Round_849_Div_4;

//File Created by -- > anuragbhatt
//Created On -- > 16/02/24,Friday

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class CodeForcesAndChecking {

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
            String s = "codeforces";

            char c = sc.next().charAt(0);

            int flag = 0;

            for(int i = 0 ; i < s.length() ; ++i)

            {
                if(s.charAt(i) == c)
                {
                    flag = 1;
                    break;
                }
            }


            if(flag == 1) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
