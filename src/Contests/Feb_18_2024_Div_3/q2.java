package Contests.Feb_18_2024_Div_3;

//File Created by -- > anuragbhatt
//Created On -- > 18/02/24,Sunday

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;


public class q2 {

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
            solve(sc);
        }
    }

    public static void solve(FastReader sc)throws IOException {

        int n = sc.nextInt();
        long m = sc.nextLong();

        ArrayList<Long> nums = new ArrayList<>();
        long prod = 1;

        for (int i = 0; i < n; i++) {
            nums.add(sc.nextLong());
        }

        String str = sc.next();
        int left = -1;
        int right = n;
        ArrayList<Long> res = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (str.charAt(i) == 'L') {
                left++;
            } else {
                right--;
            }
        }

        for (int i = n - 1; i >= 0; i--) {
            if (str.charAt(i) == 'L' && left >= 0) {
                prod *= nums.get(left--);
                res.add(prod % m);
                prod %= m;
            }
            if (str.charAt(i) == 'R' && right <= n - 1) {
                prod *= nums.get(right++);
                res.add(prod % m);
                prod %= m;
            }
        }

        Collections.reverse(res);
        for (long ii : res)
            System.out.print(ii + " ");
        System.out.println();

    }
}
