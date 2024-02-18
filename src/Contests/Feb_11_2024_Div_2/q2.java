package Contests.Feb_11_2024_Div_2;

//File Created by -- > anuragbhatt
//Created On -- > 11/02/24,Sunday

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

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
        var scanner = new FastReader();
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            List<Long> v = new ArrayList<>();
            Set<Long> se = new HashSet<>();

            for (int i = 0; i < n; i++) {
                long num = scanner.nextLong();
                v.add(num);
                se.add(num);
            }

            List<Long> l = new ArrayList<>(se);
            Collections.sort(l);

            int k = n;
            n = l.size();
            int ans = 1;

            for (int i = 0; i < n; i++) {
                long en = l.get(i) + k - 1;
                int it = upperBound(l, en) - i;
                ans = Math.max(ans, it);
            }
            System.out.println(ans);
        }
    }

    private static int upperBound(List<Long> list, long target) {
        int left = 0;
        int right = list.size();
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (list.get(mid) <= target) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left;
    }
}
