package _900;
//File Created by -- > anuragbhatt
//Created On -- > 09/11/23,Thursday

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class NotDividing {
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

        for (int i = 0; i < t; ++i) {
            int len = sc.nextInt();
            int[] arr = new int[len];
            for (int j = 0; j < len; ++j) {
                arr[j] = sc.nextInt();
            }
            int count = 0;

            for(int j = 0 ; j < len ; ++j)
            {
                arr[j] = arr[j] + 1;
                count ++;
            }

            for (int j = 1; j < len  && count <= 2 * len; ++j)
            {
                 while (arr[j] % arr[j-1] == 0  ) {
                    count++;
                    arr[j] = arr[j] + 1;
                }
            }

            for (int j = 0; j < len; ++j) {
                System.out.print(arr[j] + " ");
            }

            System.out.println();
        }
    }
}
