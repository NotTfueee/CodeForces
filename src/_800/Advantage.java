package _800;
//File Created by -- > anuragbhatt
//Created On -- > 04/12/23,Monday

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Advantage {
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

        FastReader sc = new FastReader();
        int t = sc.nextInt();

        while(t -- > 0 )
        {
            int n = sc.nextInt();
            int[] arr = new int[n];
            int[] pre = new int[n];

            for(int i = 0 ; i < n; ++i)
            {
                arr[i] = sc.nextInt();
            }

            int max = arr[0];

            for(int i = 1 ; i < n ; ++i)
            {
                pre[i] = max;
                max = Math.max(max , arr[i]);
            }

            max = arr[n-1];

            for(int i =  n - 2 ; i >= 0 ; --i)
            {
                pre[i] = Math.max(max , pre[i]);
                max = Math.max(arr[i] , max);
            }

            for(int i = 0 ; i < n ; ++i)
            {
                System.out.print(arr[i] - pre[i] + " ");
            }

            System.out.println();
        }
    }
}
