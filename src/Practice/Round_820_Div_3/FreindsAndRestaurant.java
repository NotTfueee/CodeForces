package Practice.Round_820_Div_3;

//File Created by -- > anuragbhatt
//Created On -- > 31/01/24,Wednesday

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class FreindsAndRestaurant {

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
            int n = sc.nextInt();
            long[] x = new long[n];

            for(int i = 0 ; i < n ; ++i)
            {
                x[i] = sc.nextLong();
            }

            long[] y = new long[n];

            for(int i = 0 ; i < n ; ++i)
            {
                y[i] = sc.nextLong();
            }

            long[] a = new long[n];

            for(int i = 0 ; i <n  ; ++i)
            {
                a[i] = y[i] - x[i];
            }

            Arrays.sort(a);

            int left = 0 , right = n-1 , count = 0;

            while(left < right)
            {
                if(a[left] + a[right] >= 0)
                {
                    left ++;
                    right--;
                    count++;
                }
                else if(a[left] + a[right] < 0)
                {
                    left ++;
                }
            }

            System.out.println(count);
        }
    }
}
