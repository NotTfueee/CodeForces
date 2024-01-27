package Practice.Round_799_Div_4;

//File Created by -- > anuragbhatt
//Created On -- > 27/01/24,Saturday

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BinaryDeque {

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
            int n = sc.nextInt() , s = sc.nextInt();
            int[] a = new int[n];

            int total = 0;
            for(int i = 0 ; i < n ; ++i)
            {
                a[i] = sc.nextInt();
                if(a[i] == 1)total++;
            }

            if(total == s)
            {
                System.out.println(0);
                continue;
            }
            else if(total < s)
            {
                System.out.println(-1);
                continue;
            }

            int max = Integer.MIN_VALUE , start = 0 , sum = 0;

            for(int i = 0 ; i < n ; ++i)
            {
                sum += a[i];

                while(start < n && sum > s)
                {
                    sum -= a[start];
                    start ++;
                }

                if(sum == s)max = Math.max(max , i -start + 1);
            }

            System.out.println(n-max);
        }
    }
}
