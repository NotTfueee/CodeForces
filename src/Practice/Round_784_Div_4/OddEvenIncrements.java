package Practice.Round_784_Div_4;

//File Created by -- > anuragbhatt
//Created On -- > 16/02/24,Friday

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class OddEvenIncrements {

    public static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() throws IOException {
            while (st == null || !st.hasMoreElements()) {
                st = new StringTokenizer(br.readLine());
            }
            return st.nextToken();
        }

        int nextInt() throws IOException {
            return Integer.parseInt(next());
        }

        long nextLong() throws IOException {
            return Long.parseLong(next());
        }

        double nextDouble() throws IOException {
            return Double.parseDouble(next());
        }

        String nextLine() throws IOException {
            return br.readLine();
        }
    }

    public static void main(String[] args) throws IOException {
        var sc = new FastReader();
        int t = sc.nextInt();

        while(t-- > 0)
        {
            int n = sc.nextInt();
            int[] a = new int[n];

            for(int i = 0 ; i < n ; ++i)
            {
                a[i] = sc.nextInt();
            }

            int e = 0 , o = 0 , f = 0;

            if((a[0] & 1) == 0)e = 1;

            for(int i = 2 ; i < n ; i += 2)
            {
                if(e == 1 && (a[i] & 1) == 1)
                {
                    f = 1;
                    break;
                }

                if(e == 0 && (a[i] & 1) == 0)
                {
                    f = 1;
                    break;
                }
            }


            if(f == 1)
            {
                System.out.println("NO");
                continue;
            }

            if((a[1] & 1) == 1)o = 1;

            for(int i = 3 ; i < n ; i+= 2)
            {
                if(o == 1 && (a[i] & 1) == 0)
                {
                    f = 1;
                    break;
                }

                if(o == 0 && (a[i] & 1) == 1)
                {
                    f = 1;
                    break;
                }
            }

            if(f == 1)
            {
                System.out.println("NO");
            }
            else System.out.println("YES");
        }
    }
}
