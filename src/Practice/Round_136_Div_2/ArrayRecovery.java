package Practice.Round_136_Div_2;
//File Created by -- > anuragbhatt
//Created On -- > 23/12/23,Saturday

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ArrayRecovery {
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

        while(t-- > 0) {
            int n = sc.nextInt();
            int[] d = new int[n];
            int[] a = new int[n];

            for (int i = 0; i < n; ++i) {
                d[i] = sc.nextInt();
            }
            a[0] = d[0];

            int flag = 0;
            for (int i = 1; i < n; ++i)
            {
                if(d[i] == 0)a[i] = a[i-1];
                else
                {
                    int v2 = a[i-1] - d[i];

                    if(v2 >= 0)
                    {
                        flag = 1;
                        break;
                    }

                    a[i] = a[i-1] + d[i];
                }
            }

            if (flag == 1)
            {
                System.out.println(-1);
                continue;
            }
            else
            {
                for(int i = 0 ; i < n ; ++i)
                {
                    System.out.print(a[i] + " ");
                }
            }
            System.out.println();
        }

        }
}
