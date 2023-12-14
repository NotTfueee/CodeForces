package _1000;
//File Created by -- > anuragbhatt
//Created On -- > 13/12/23,Wednesday

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ChallengingValleys {
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
            int n = sc.nextInt();

            int[] arr = new int[n];

            for(int i = 0 ; i < n ; ++i)
            {
                arr[i] = sc.nextInt();
            }

            int increment = 0 , decrement = 0 , flag = 0;

            for(int i = 1 ; i < n ; ++i)
            {
                if(arr[i] > arr[i-1])increment++;
                else if(arr[i] < arr[i-1])
                {
                    decrement++;
                    if(increment > 0)
                    {
                        flag++;
                        break;
                    }
                }
            }

            if(flag > 0 ) System.out.println("NO");
            else System.out.println("YES");
        }
    }
}
