package _900;
//File Created by -- > anuragbhatt
//Created On -- > 08/11/23,Wednesday

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MknezConstructiveForcesTask {
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

            String ans = "";

            if(len % 2 == 0)
            {
                System.out.println("YES");
                int flip = 0;
                for(int j = 0 ; j < len ; ++j)
                {
                    if(flip == 0)ans += 5 + " ";
                    else ans += -5 + " ";

                    flip ^= 1;
                }
            }
            else if(len >= 5)
            {
                System.out.println("YES");

                int flip = 0;
                int k = len / 2;

                for(int j = 0 ; j < len ; ++j)
                {
                    if(flip == 0)ans += -(k-1) + " ";
                    else ans += k + " ";

                    flip ^= 1;
                }
            }
            else System.out.println("NO");


            System.out.println(ans);
        }
    }
}
