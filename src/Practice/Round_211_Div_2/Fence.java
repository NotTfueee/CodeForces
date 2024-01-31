package Practice.Round_211_Div_2;

//File Created by -- > anuragbhatt
//Created On -- > 31/01/24,Wednesday

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Fence {

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
        int n = sc.nextInt()  , k = sc.nextInt();

        int[] f = new int[n];

        for(int i = 0 ; i < n ; ++i)
        {
            f[i] = sc.nextInt();
        }

        int start = 0 , min = Integer.MAX_VALUE , sum = 0 , ans = -1;

        for(int i = 0 ; i < n ; ++i)
        {
            sum += f[i];

            if(i - start == k-1)
            {
                if(min > sum)
                {
                    min = sum ;
                    ans = start +1;
                }

                sum -= f[start];
                start ++;
            }
        }

        System.out.println(ans);
    }
}
