package Contests.Dec_28_2023_Div_4;
//File Created by -- > anuragbhatt
//Created On -- > 28/12/23,Thursday

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class NotQuiteLatinSquare {
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

            char[][] mat = new char[3][3];

            for (int i = 0; i < 3; i++) {
                String rowInput = sc.next();

                for (int j = 0; j < 3; j++) {
                    mat[i][j] = rowInput.charAt(j);
                }
            }

            char ans = '.';
            for(int i = 0 ; i < 3 ; ++i)
            {
                var set = new HashSet<Character>();
                for(int j = 0 ; j < 3 ; ++j)
                {
                    set.add(mat[i][j]);
                }

                for(char ch = 'A' ; ch <= 'C' ; ch++)
                {
                    if(!set.contains(ch))
                    {
                        ans = ch;
                        break;
                    }
                }
            }

            System.out.println(ans);

        }
    }
}
