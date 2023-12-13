package _800;//File Created by -- > anuragbhatt
//Created On -- > 15/09/23,Friday

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ArrivalOfTheGeneral {
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
        int n = sc.nextInt();

//        int [] arr = {10,10 ,58 ,31 ,63, 40 ,76};

        int max = Integer.MIN_VALUE , min = Integer.MAX_VALUE , maxIn = Integer.MAX_VALUE , minIn = Integer.MAX_VALUE ;
        for(int i = 0 ; i < n ; i ++)
        {
            int sold = sc.nextInt();

            if(max < sold)
            {
                max = sold;
                maxIn = i;
            }
            else if( max == sold && i < maxIn) maxIn = i;

            if(min >= sold )
            {
                min = sold;
                minIn = i;
            }
        }

        int total = 0 ;

        if(maxIn > minIn) total = maxIn + ((n - 1) - (minIn+1));
        else total = maxIn + ((n-1) - minIn);
        System.out.println(total);

    }
}
