package Practice.Round_91_Div_2;
//File Created by -- > anuragbhatt
//Created On -- > 20/12/23,Wednesday

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class LuckyDivision {
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

        int n = sc.nextInt() , num = 1;

        while(num <= n)
        {
            if(n % num == 0 )
            {
                if(isLucky(num))
                {
                    System.out.println("YES");
                    return;
                }
            }
            num++;
        }

        System.out.println("NO");
    }

    public static boolean isLucky(int n)
    {
       var set = new HashSet<Integer>();
       set.add(4); set.add(7);

        int temp = n ;

        while(temp > 0)
        {
            int digit = temp % 10;

            if(!set.contains(digit))return false;

            temp /= 10;
        }

        return true;
    }
}
