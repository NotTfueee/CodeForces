package Practice.Round_819_Div1_Div2;

//File Created by -- > anuragbhatt
//Created On -- > 12/02/24,Monday

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MainakAndArray {

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
            int n =  sc.nextInt();
            int[] a = new int[n];

            for(int i = 0 ; i < n ; ++i) a[i] = sc.nextInt();


            int max = 0 , min = 1000 , c = 0;
            for(int i = 0 ; i < n ; ++i)
            {
                max = Math.max(max , a[i]);
                min = Math.min(min , a[i]);

                if(i < n-1)
                {
                    c = Math.max(c , a[i] - a[i+1]);
                }
            }


            if(max == a[n-1])
            {
                System.out.println(max - min);
            }
            else if(max == a[0])
            {
                System.out.println(c);
            }
            else
            {

                int m = 1000;
                for(int i = 0 ; i < n-1 ; ++i)
                {
                    m = Math.min(m , a[i]);
                }

                int ans = Math.max(max - a[0] , Math.max(a[n-1] - m , c));

                System.out.println(ans);
            }
        }
    }
}
