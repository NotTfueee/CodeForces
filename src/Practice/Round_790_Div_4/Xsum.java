package Practice.Round_790_Div_4;

//File Created by -- > anuragbhatt
//Created On -- > 04/02/24,Sunday

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Xsum {

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

        while (t-- > 0) {
            int n = sc.nextInt(), m = sc.nextInt();

            int[][] a = new int[n][m];

            for (int i = 0; i < n; ++i) {
                for (int j = 0; j < m; ++j) {
                    a[i][j] = sc.nextInt();
                }
            }

            int mx = 0 ;

            for(int i = 0 ; i < n ; ++i)
            {
                for(int j = 0 ; j < m ; ++j)
                {
                    int now = 0;
                    int ci = i, cj = j;

                    while(ci >= 0 && ci < n && cj >= 0 && cj < m)
                    {
                        now+=a[ci][cj];
                        ci--;
                        cj--;
                    }
                    ci = i;
                    cj = j;


                    while(ci >= 0 && ci < n && cj >= 0 && cj < m)
                    {
                        now+=a[ci][cj];
                        ci++;
                        cj--;
                    }
                    ci = i;
                    cj = j;


                    while(ci >= 0 && ci < n && cj >= 0 && cj < m)
                    {
                        now+=a[ci][cj];
                        ci--;
                        cj++;
                    }
                    ci = i;
                    cj = j;


                    while(ci >= 0 && ci < n && cj >= 0 && cj < m)
                    {
                        now+=a[ci][cj];
                        ci++;
                        cj++;
                    }
                    now -= a[i][j]*3;
                    mx = Math.max(mx, now);
                }
            }

            System.out.println(mx);
        }
    }
}
