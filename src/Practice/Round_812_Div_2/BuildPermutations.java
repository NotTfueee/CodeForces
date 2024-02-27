package Practice.Round_812_Div_2;

//File Created by -- > anuragbhatt
//Created On -- > 27/02/24,Tuesday

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

import static java.lang.Math.sqrt;
import static java.lang.System.out;


public class BuildPermutations {

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
            solve(sc);
        }
    }

    public static void solve(FastReader sc)throws  IOException
    {
        int n = sc.nextInt();
        int[] ans = new int[n];

        for(int i = n - 1; i >= 0 ;)
        {
            for(int k = 0 ; k <= i ; ++k)
            {
                int sq = (int) sqrt(k +i);

                if(sq * sq == k+i)
                {
                    int k1 = k , i1 = i;

                    while(k1 <= i1)
                    {
                        ans[k1] = i1;
                        ans[i1] = k1;

                        i1--;
                        k1++;
                    }

                    i = k -1;
                    break;
                }
            }
        }

        StringBuilder s = new StringBuilder();

        for(int i : ans)
        {
            s.append(i).append(" ");
        }

        out.println(s);
    }
}
