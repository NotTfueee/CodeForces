package _800;//File Created by -- > anuragbhatt
//Created On -- > 21/09/23,Thursday

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class RemoveSmallest {
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
        int T = sc.nextInt();

        for(int i = 0 ;i < T; ++i) {
            int len = sc.nextInt();
            int[] arr = new int[len];

            for (int j = 0; j < len; ++j) {
                arr[j] = sc.nextInt();
            }

            Arrays.sort(arr);

            boolean notPossible = false;
            int first = arr[0];

            for (int j = 1; j < len; j++) {
                if (Math.abs(first - arr[j]) > 1) {
                    System.out.println("NO");
                    notPossible = true;
                    break;
                } else first = arr[j];
            }

            if (!notPossible) System.out.println("YES");
        }

    }
}
