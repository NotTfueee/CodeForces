package Contests.Jan_15_2024.Round_920_Div_3;
//File Created by -- > anuragbhatt
//Created On -- > 15/01/24,Monday

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class q1 {
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
            int[][] arr = new int[4][2];

            for(int i = 0 ; i < 4 ; ++i)
            {
                for(int j = 0 ; j < 2 ; ++j)
                {
                    arr[i][j] = sc.nextInt();
                }
            }

            var set = new HashSet<Integer>();
            int side = 0;
            for(int i = 1 ; i < 4 ; ++i)
            {
                    int x1 = arr[0][0] , y1 = arr[0][1] , x2 = arr[i][0] , y2 = arr[i][1];
                    int distance = (int)Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

                    if(set.contains(distance))side = distance;
                    else set.add(distance);
            }

            System.out.println(side * side );
        }
    }
}
