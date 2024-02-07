package Practice.Round_886_Div_4;

//File Created by -- > anuragbhatt
//Created On -- > 07/02/24,Wednesday

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class WordOnThePaper {

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

            char[][] grid = new char[8][8];

            for(int i = 0 ; i < 8 ; ++i)
            {
                String s = sc.next();

                for(int j = 0 ; j < 8 ; ++j)
                {
                    grid[i][j] = s.charAt(j);
                }
            }

            StringBuilder ans = new StringBuilder();

            for(int j = 0 ; j < 8 ; ++j)
            {
                for(int i = 0 ; i < 8 ; ++i)
                {
                    if(grid[i][j] != '.')ans.append(grid[i][j]);
                }
            }

            System.out.println(ans);
        }
    }
}
