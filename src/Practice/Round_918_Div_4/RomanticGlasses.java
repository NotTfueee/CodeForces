package Practice.Round_918_Div_4;

//File Created by -- > anuragbhatt
//Created On -- > 05/02/24,Monday

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class RomanticGlasses {

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

        while (t-- > 0)
        {
            int n = sc.nextInt();
            long[] a = new long[n];

            for(int i = 0 ; i < n ; ++i)
            {
                a[i] = sc.nextLong();
                if( (i+1) % 2 == 0)a[i] = -a[i];
            }

            long[] pre = new long[n];

            long sum = 0;
            for(int i = 0 ; i < n ; ++i)
            {
                sum += a[i];
                pre[i] = sum;
            }

            var set = new HashSet<Long>();
            int flag = 0;
            for(int i = 0 ; i < n ; ++i)
            {
                if(set.contains(pre[i]) || pre[i] == 0 )flag = 1;
                else set.add(pre[i]);
            }

            if(flag == 1) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
