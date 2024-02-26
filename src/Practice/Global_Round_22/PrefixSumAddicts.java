package Practice.Global_Round_22;

//File Created by -- > anuragbhatt
//Created On -- > 25/01/24,Thursday

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class PrefixSumAddicts {

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
        int tt = sc.nextInt();

        while(tt -- > 0) {
            long n = sc.nextLong();
            long k = sc.nextLong();
            long k1 = n - k + 1;
            long[] s = new long[(int)k];
            long[] a = new long[(int)k];

            for(int i = 0; i < k; i++) {
                s[i] = sc.nextLong();
            }

            if(s[0] <= 0) {
                a[0] = s[0] / k1;
            } else {
                a[0] = s[0] / k1;
                if((s[0] % k1) > 0) {
                    a[0]++;
                }
            }

            for(int i = 1; i < k; i++) {
                a[i] = s[i] - s[i - 1];
            }

            int f = 0;

            for(int i = 1; i < k; i++) {
                if(a[i] < a[i - 1]) {
                    f++;
                    break;
                }
            }

            if(f == 0) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}
