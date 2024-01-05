package Practice.Round_812_Div_2;
//File Created by -- > anuragbhatt
//Created On -- > 05/01/24,Friday

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class OptimalReduction {
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
        int t = sc.nextInt();

        while(t-- > 0)
        {
            int n = sc.nextInt();
            int[] arr = new int[n];

            for(int i = 0 ; i < n ; ++i)
            {
                arr[i] = sc.nextInt();
            }

            System.out.println(find(arr));
        }
    }

    public static String find(int[] arr )
    {
        boolean increasing = false ,  decreasing = false;

        for(int i = 1 ; i < arr.length ; ++i)
        {
            if(arr[i] > arr[i-1])
            {
                if(!decreasing)increasing = true;
                else return "NO";
            }
            else if(arr[i] < arr[i-1])
            {
                decreasing = true;
            }
        }

        return "YES";
    }
}
