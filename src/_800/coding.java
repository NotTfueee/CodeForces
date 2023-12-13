package _800;//File Created by -- > anuragbhatt
//Created On -- > 03/10/23,Tuesday

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class coding {
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

        int[] arr = {-2, 0 , 2};

        System.out.println(min (arr , 3));

    }

    public static  int min (int[] arr , int n )
    {
        int min = Integer.MAX_VALUE;

        for(int i = 0 ; i < n ; ++i)
        {
            for(int j = i + 1 ; j < n  ; ++j)
            {
                min = Math.min ((int) Math.abs(arr[i] - arr[j]) , min );
            }
        }


        int count = 0 ;
        for(int i = 0 ; i < n ; ++ i )
        {
            for(int j = i + 1 ; j < n ; ++ j)
            {
                if((int) Math.abs(arr[i] - arr[j]) == min )count ++;
            }
        }

        return count ;
    }
}
