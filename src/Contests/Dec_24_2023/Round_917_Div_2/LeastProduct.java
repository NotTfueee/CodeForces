package Contests.Dec_24_2023.Round_917_Div_2;
//File Created by -- > anuragbhatt
//Created On -- > 24/12/23,Sunday

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class LeastProduct {
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
        var sc = new FastReader();

        int t = sc.nextInt();

        while(t-- > 0)
        {
            int n = sc.nextInt();
            long[] arr = new long[n];

            for(int i = 0 ; i < n ; ++i)
            {
                arr[i] = sc.nextInt();
            }

            boolean neg = false , zero = false;
            for(int i = 0 ; i < n ; ++i)
            {
                if(arr[i] < 0)neg = !neg;
                else if(arr[i] > 0)continue;
                else zero = true;
            }

            if(zero || neg) System.out.println(0);
            else {
                System.out.println(1);
                System.out.println("1 0");
            }
        }
    }
}
