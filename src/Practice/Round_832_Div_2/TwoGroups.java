package Practice.Round_832_Div_2;
//File Created by -- > anuragbhatt
//Created On -- > 21/12/23,Thursday

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class TwoGroups {
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

        while(t-- > 0)
        {
            int n = sc.nextInt();

            long[] arr = new long [n];

            for(int i = 0 ; i < n ; ++i)
            {
                arr[i] = sc.nextInt();
            }

            Arrays.sort(arr);

            long g1 = 0 , g2 = 0;

            for(int i = 0 ; i < n ; ++i)
            {
                if(arr[i] < 0)g1 += arr[i];
                else g2 += arr[i];
            }

            System.out.println(Math.abs(Math.abs(g1) - Math.abs(g2)));
        }
    }
}
