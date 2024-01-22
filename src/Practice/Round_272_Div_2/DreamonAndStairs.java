package Practice.Round_272_Div_2;

//File Created by -- > anuragbhatt
//Created On -- > 22/01/24,Monday

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class DreamonAndStairs {

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

            int n = sc.nextInt() , m = sc.nextInt();

            if(n < m)
            {
                System.out.println(-1);
            }
            else
            {
                if(n % 2 == 0)
                {
                    int q = n/2;

                    if(q % m == 0) System.out.println(q);
                    else
                    {
                        int c = (int)Math.ceil((double) q / m);
                        System.out.println(m * c);
                    }
                }
                else
                {
                    int q = (n/2) + 1;

                    if(q % m == 0) System.out.println(q);
                    else
                    {
                        int c = (int)Math.ceil((double)q / m);
                        System.out.println(m * c);
                    }
                }
            }

    }
}
