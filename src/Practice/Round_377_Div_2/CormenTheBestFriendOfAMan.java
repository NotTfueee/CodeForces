package Practice.Round_377_Div_2;
//File Created by -- > anuragbhatt
//Created On -- > 20/12/23,Wednesday

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CormenTheBestFriendOfAMan {
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
        int n = sc.nextInt() , k = sc.nextInt();

        int[] arr = new int[n];

        for(int i = 0 ; i < n ; ++i)
        {
            arr[i] = sc.nextInt();
        }

        int total = 0;

        for(int i = 1 ; i < n ; ++i)
        {
            int sum = arr[i] + arr[i-1];

            if(sum < k)
            {
                total += k - sum;
                arr[i] += k - sum;
            }
        }
        System.out.println(total);
        for(int i : arr)
        {
            System.out.print(i + " ");
        }
    }
}
