package _900;
//File Created by -- > anuragbhatt
//Created On -- > 10/11/23,Friday

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MarkTheDustSweeper {
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

        for(int i = 0 ; i < t ; ++i)
        {
            int len = sc.nextInt();
            long[] arr = new long[len];

            int first = -1;
            for(int j = 0 ;j < len ; ++j)
            {
                arr[j] = sc.nextLong();

                if(first < 0 && arr[j] > 0)
                {
                    first = j;
                }
            }

            if(first < 0)
            {
                System.out.println(0);
                continue;
            }

            long count = 0 , ans = 0;

            for(int j = 0 ; j < len -1 ; ++j)
            {
                if(arr[j] > 0)
                {
                    count += arr[j]-1;
                }
            }

            ans = count + (len -1 - first);

            System.out.println(ans);
        }
    }
}
