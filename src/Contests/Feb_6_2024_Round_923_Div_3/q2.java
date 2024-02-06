package Contests.Feb_6_2024_Round_923_Div_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
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
            int n = sc.nextInt();
            int[] a= new int[n];

            for(int i = 0 ; i <n ; ++i)
            {
                a[i] = sc.nextInt();
            }

            int[] count = new int[26];

            StringBuilder ans = new StringBuilder();

            for(int i = 0 ; i < n ; ++i)
            {
                char next = find(count , a[i]);
                ans.append(next);

                count[next-'a']++;
            }

            System.out.println(ans);
        }
    }

    public static char find(int[] count , int freq)
    {
        for(int i = 0 ; i < 26 ; ++i)
        {
            if(count[i] == freq)return (char)('a' + i);
        }

        return ' ';
    }
}