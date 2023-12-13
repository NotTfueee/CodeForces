package _800;//File Created by -- > anuragbhatt
//Created On -- > 15/09/23,Friday

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SortTheArray {
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
        long [] arr = new long[n];

        boolean sorted = true;

        for(int i = 0 ;i < n ;i ++)
        {
            long item = sc.nextLong();
            arr[i] = item;
            if(i != 0 && item < arr[i-1])sorted = false;
        }

        if(sorted)
        {
            System.out.println("yes");
            System.out.println(1+" "+1);
            return;
        }

        boolean decFound = false ;

        int increase = n-1 , decrease = 0;

        for(int i = 1 ;i < n ; i ++)
        {
            long item = arr[i];
            if(!decFound)
            {
                if(item < arr[i-1])
                {
                    decrease = i-1;
                    decFound = true;
                }
            }
            else
            {
                if(item > arr[i-1])
                {
                    increase = i-1;
                    break;
                }
            }

        }



            int start = decrease , end = increase;

            while(start < end)
            {
                long temp = arr[start];
                arr[start] = arr[end] ;
                arr[end] = temp;

                start ++;
                end--;
            }


            for(int i = 1 ; i < n ; i ++)
            {
                if(arr[i] < arr[i-1])
                {
                    System.out.println("no");
                    return;
                }
            }


        System.out.println("yes");
        System.out.println(decrease+1 + " "+(increase+1));
    }
}
