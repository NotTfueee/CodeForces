package Practice.Round_822_Div_2;

//File Created by -- > anuragbhatt
//Created On -- > 24/01/24,Wednesday

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class RemovingSmallestMultiple {

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
        int tt = sc.nextInt();

        while(tt -- > 0)
        {
            long n = sc.nextLong();
            String s = sc.next();

            long ans = 0;
            char[] marked = new char[(int) n];

            Arrays.fill(marked, '1');

            for (long i = 0; i < n; ++i)
            {
                if (s.charAt((int) i) == '0')
                {
                    for (int j = (int) (i + 1); j <= n; j += (int) (i + 1))
                    {

                        /*
                        this line of code is important as if the next multiple of the current number is not 0 we cannot take the
                        current number now as its next multiple is present in the set S and we can only delete smallest multiple of a
                        number if they are present in the set T
                         */
                        if (s.charAt(j - 1) == '1') break;
                        if (marked[j - 1] == '0') continue;
                        marked[j - 1] = '0';
                        ans += i + 1;
                    }
                }
            }

            System.out.println(ans);
        }
    }
}
