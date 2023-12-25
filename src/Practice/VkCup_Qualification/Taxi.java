package Practice.VkCup_Qualification;
//File Created by -- > anuragbhatt
//Created On -- > 25/12/23,Monday

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Taxi {
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
        var sc = new FastReader();

        int n = sc.nextInt();
        int[] arr = new int[n];

        int one = 0 , two = 0 , three = 0 , count = 0 ;

        for(int i = 0 ; i < n ; ++i)
        {
            arr[i] = sc.nextInt();
            if(arr[i] == 4)count++;
            else if(arr[i] == 1)one++;
            else if(arr[i] == 2) two ++;
            else three++;
        }

        count += three;
        one -= three;
        if(one < 0)one = 0;

        if(two % 2 == 0 )
        {
            count += two/2;
            two = 0;
        }
        else
        {
            count += two / 2 + 1;

            one -= 2;
            if(one < 0)one = 0;
        }

        count  += (int)(Math.ceil((double)one / 4));

        System.out.println(count);
    }
}
