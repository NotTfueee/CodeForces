package Practice.Round_827_Div_4;
//File Created by -- > anuragbhatt
//Created On -- > 21/12/23,Thursday

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class CoPrime {
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

        while(t-- > 0)
        {

            int n = sc.nextInt() , max = Integer.MIN_VALUE;
            int[] arr = new int[n] ;

            var map = new HashMap<Integer , Integer>();

            for(int i = 0 ; i < n ; ++i)
            {
                arr[i] = sc.nextInt();
                map.put(arr[i] , i);
            }

            for(int v1 : map.keySet())
            {
                for(int v2 : map.keySet())
                {
                    if(coPrime(v1 , v2))
                    {
                        int idx1 = map.get(v1) , idx2  = map.get(v2);
                        max = Math.max(max , idx1 + idx2 + 2);
                    }
                }
            }
            System.out.println(max == Integer.MIN_VALUE ? -1 : max);
        }
    }

    public static boolean coPrime(int a , int b)
    {
        while(b != 0)
        {
            int temp = b;
            b = a % b;
            a = temp;
        }

       return a == 1;
    }
}
