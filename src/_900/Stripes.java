package _900;
//File Created by -- > anuragbhatt
//Created On -- > 30/11/23,Thursday

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Stripes {
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
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

        for(int k = 0 ; k < t ; ++k)
        {
            sc.nextLine();

            char[][] mat = new char[8][8];

            boolean red = false;

            for(int i = 0 ; i < 8 ; ++i)
            {
                String row = sc.nextLine();
                int count = 0;

                for(int j = 0 ; j < row.length() ; ++j)
                {
                    mat[i][j] = row.charAt(j);

                    if(mat[i][j] == 'R')count++;
                }

                if(count == 8)
                {
                    red = true;
                }
            }
            if(red) System.out.println("R");
            else System.out.println("B");
        }
    }
}
