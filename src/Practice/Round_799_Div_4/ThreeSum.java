package Practice.Round_799_Div_4;

//File Created by -- > anuragbhatt
//Created On -- > 17/02/24,Saturday

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;


public class ThreeSum {

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

    public static void solve(FastReader sc) throws IOException {

        int n = sc.nextInt();

        int[] cnt = new int[10];

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            cnt[x % 10]++;
        }

        ArrayList<Integer> v = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < Math.min(cnt[i], 3); j++) {
                v.add(i);
            }
        }

        int m = v.size();
        for (int i = 0; i < m; i++) {
            for (int j = i + 1; j < m; j++) {
                for (int k = j + 1; k < m; k++) {
                    if ((v.get(i) + v.get(j) + v.get(k)) % 10 == 3) {
                        System.out.println("YES");
                        return;
                    }
                }
            }
        }

        System.out.println("NO");
    }
}
