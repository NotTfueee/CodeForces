package Practice.Round_898_Div_4;

//File Created by -- > anuragbhatt
//Created On -- > 06/02/24,Tuesday

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class TargetPractice {

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

            int sum = 0 ;

            int[][] grid = new int[10][10];

            for(int i = 0 ; i < 10 ; ++i)
            {
                for(int j = 0 ; j < 10 ; ++j)
                {
                    if(i == 0 || i == 9 || j == 0 || j == 9)grid[i][j] = 1;
                    else if(i == 1 || i == 8 || j == 1 || j == 8)grid[i][j] = 2;
                    else if(i == 2 || i == 7 || j == 2 || j == 7)grid[i][j] = 3;
                    else if(i == 3 || i == 6 || j == 3 || j == 6)grid[i][j] = 4;
                    else grid[i][j] = 5;
                }
            }

            for(int i = 0 ; i < 10 ; ++i)
            {
                String s = sc.next();

                for(int j = 0 ; j < 10 ; ++j)
                {
                    if(s.charAt(j) == 'X')sum += grid[i][j];
                }
            }


            System.out.println(sum);
        }
    }
}
