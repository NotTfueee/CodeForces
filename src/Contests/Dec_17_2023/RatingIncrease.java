package Contests.Dec_17_2023;
//File Created by -- > anuragbhatt
//Created On -- > 18/12/23,Monday

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class RatingIncrease {
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

        while (t-- > 0) {
            int number = sc.nextInt();
            int splitIndex = getSplitIndex(number);

            if (splitIndex == -1) {
                System.out.println(-1);
            } else {
                int firstNumber = Integer.parseInt(Integer.toString(number).substring(0, splitIndex));
                int secondNumber = Integer.parseInt(Integer.toString(number).substring(splitIndex));

                System.out.println(firstNumber + " " + secondNumber);
            }
        }
    }

    public static int getSplitIndex ( int number){
        String numStr = Integer.toString(number);
        for (int i = 1; i < numStr.length(); i++) {
            int firstPart = Integer.parseInt(numStr.substring(0, i));
            int secondPart = Integer.parseInt(numStr.substring(i));

            if (numStr.charAt(i) != '0' && secondPart > firstPart) {
                return i;
            }
        }
        return -1;
    }
}
