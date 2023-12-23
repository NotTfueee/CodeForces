package Practice.Round_367_Div_2;
//File Created by -- > anuragbhatt
//Created On -- > 23/12/23,Saturday

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class InterestingDrink {
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
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

        /*
         we create an array of 100001 because we are given that there are 100000 shops so to store the price of drinks
         from 1 to 100000 we need an array of 100001 that will have indexes from 0 to 100000 and in the shop no drink exceeds
          the price 100000
         now if we have money that is greater than this price we can obviously by all the beecola's from all the n shops
         */

        int[] val = new int[1000001];

        /*
        now we create a prefix sum array whose index will represent that how many items we have that has price equal to or smaller
        than the current index and if we have a price that exceeds 100 000 means we can buy drinks from every shop that is the
        current number of n
         */
        int[] pre = new int[1000001];

        int[] arr = new int[n];

        for (int i = 0; i < n; ++i) {
            arr[i] = sc.nextInt();
            val[arr[i]]++;
        }

        int sum = 0;
        for (int i = 0; i < 1000001; ++i) {
            sum += val[i];
            pre[i] = sum;
        }

        int q = sc.nextInt();

        while (q-- > 0) {
            int query = sc.nextInt();

            /*
            if we have money that is greater than the maximum item present in the array we can buy all the items in the array
            so we return n;
             */

            if (query > 1000000) {
                System.out.println(n);
            } else {
                System.out.println(pre[query]);
            }
        }
    }
}
