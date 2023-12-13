package _800;//File Created by -- > anuragbhatt
//Created On -- > 29/09/23,Friday

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class NextPrimeNumber {
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
        int n = sc.nextInt() , m = sc.nextInt();


        for(int i = n + 1 ; i <= m ; ++i)
        {
            boolean isPrime = false;

            for(int j = 2 ; j < i ; ++j )
            {
                if( i % j == 0 )isPrime = true;
            }

            if(!isPrime)
            {
                if( i == m)
                {
                    System.out.println("YES");
                    return;
                }
                else
                {
                    System.out.println("NO");
                    return;
                }
            }
        }

        System.out.println("NO");
    }
}
