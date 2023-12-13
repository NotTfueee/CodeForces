package _800;
//File Created by -- > anuragbhatt
//Created On -- > 13/11/23,Monday

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BalancedArray {
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

        int n = sc.nextInt();

        for (int i = 0; i < n; ++i)
        {
            int len = sc.nextInt();

            if(len % 4 == 0)
            {
                int[] arr = new int[len];
                int even = 2 , odd = 1;

                for(int j = 0 ; j < len ; ++j)
                {
                    if(j < len/2)
                    {
                        arr[j] = even ;
                        even += 2;
                    }
                    else
                    {
                        arr[j] = odd;
                        odd += 2;
                    }
                }
                arr[len-1] = arr[len-1] + len/2;

                System.out.println("YES");
                for(int j = 0 ; j < len ; ++j)
                {
                    System.out.print(arr[j] + " ");
                }
                System.out.println();
            }
            else System.out.println("NO");
        }
    }
}
