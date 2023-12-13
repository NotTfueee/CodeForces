package _800;//File Created by -- > anuragbhatt
//Created On -- > 12/09/23,Tuesday

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class NearlyLuckyNumber {
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

    public static void main(String[] args)
    {
        FastReader read = new FastReader();
        long n = read.nextLong();
        var map = new HashMap<Long , Integer>();

        while(n > 0)
        {
            long last = n % 10;
            if(last == 7 || last == 4) map.put(last , map.getOrDefault(last , 0)+1);
            n = n / 10;
        }

        int sum = 0 ;

        for(int val : map.values())
        {
            sum += val;
        }

        if(sum == 7 || sum == 4)System.out.println("YES");
        else System.out.println("NO");
    }
}
