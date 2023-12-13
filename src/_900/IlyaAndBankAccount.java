package _900;
//File Created by -- > anuragbhatt
//Created On -- > 07/11/23,Tuesday

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class IlyaAndBankAccount {
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
        int n = -102;

        if(n >= 0 )
        {
            System.out.println(n);
        }
        else {


            int temp = n;

            int lastDigit = temp % 10;

            int lastDigitRemove = temp / 10;

            temp = temp / 10;

            int secondLastDigitRemove = temp / 10;

            int max = Integer.MIN_VALUE;
            if((int) Math.abs(n) > 99)
            {
                max = Math.max(lastDigitRemove , (secondLastDigitRemove * 10 ) + lastDigit);
            }
            else
            {
                max = Math.max (lastDigitRemove , lastDigit);
            }
            System.out.println(max);
        }
    }
}
