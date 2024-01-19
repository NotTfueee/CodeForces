package Practice.Round_280_Div_2;

//File Created by -- > anuragbhatt
//Created On -- > 19/01/24,Friday

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class VanyaAndLanterns {

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
        int n = sc.nextInt() ;
        long l = sc.nextLong();

        long[] arr = new long[n];

        for(int i = 0 ; i < n ; ++i)
        {
            arr[i] = sc.nextLong();
        }

        Arrays.sort(arr);

        long diff = Math.max(arr[0], l - arr[n-1]);

        long maxDiff = Integer.MIN_VALUE;
        for(int i = 1 ; i < n ; ++i)
        {
            maxDiff = Math.max(maxDiff , arr[i] - arr[i-1]);
        }

        double ans = Math.max((double)maxDiff/2 , diff);

        System.out.println(ans);
    }
}
