package _900;
//File Created by -- > anuragbhatt
//Created On -- > 18/11/23,Saturday

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class OddQueries {
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

        int t = sc.nextInt();

        while(t -- > 0)
        {
            int n = sc.nextInt() , q = sc.nextInt() , sum = 0;
            int[] arr = new int[n];

            for(int i = 0 ; i < n ; ++i) {
                arr[i] = sum + sc.nextInt();
                sum = arr[i];
            }


            while(q-- > 0)
            {
                int l = sc.nextInt() -1 , r = sc.nextInt()-1 , k = sc.nextInt() , ans = 0;

                if(l > 0)
                {
                    ans = arr[n-1] - (arr[r] - arr[l-1]) + ( (r - l + 1) * k);
                }
                else
                {
                    ans = arr[n-1] - (arr[r]) + ( (r - l + 1) * k);
                }
                if(ans % 2 == 0)System.out.println("NO");
                else System.out.println("YES");
            }
        }
    }
}
