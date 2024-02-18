package Contests.Jan_27_2024.Round_921_Div_2;

//File Created by -- > anuragbhatt
//Created On -- > 27/01/24,Saturday

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.TreeSet;

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
            long x = sc.nextInt() , n = sc.nextInt();
            long q = x / n;
            TreeSet<Integer> set = new TreeSet<>();

            for (int i = 1; i <= Math.sqrt(x); i++) {
                if (x % i == 0) {
                    set.add(i);
                    set.add((int) (x / i));
                }
            }

            Integer result = set.ceiling((int) q);

            if (result == null || result > q) {
                result = set.lower((int) q);
            }

            System.out.println(result);
        }

    }

}
