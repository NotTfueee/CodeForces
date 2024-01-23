package Practice.Round_825_Div_2;

//File Created by -- > anuragbhatt
//Created On -- > 23/01/24,Tuesday

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class PlayingWithGCD {

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
        int tt = sc.nextInt();

        while(tt -- > 0)
        {
            int n = sc.nextInt();
            int[] a = new int[n];

            for(int i = 0 ; i < n ; ++i)
            {
                a[i] = sc.nextInt();
            }

            int[] b = new int[n+1];
            b[0] = a[0];
            b[n] = a[n-1];

            for(int i = 1 ; i < n ; ++i)
            {
                b[i] = (a[i] * a[i-1])/gcd(a[i] , a[i-1]);
            }

            int flag = 0;

            for(int i = 1 ; i < n + 1 ; ++i)
            {
                if(gcd(b[i] , b[i-1]) != a[i-1])
                {
                    flag = 1;
                    break;
                }
            }

            if(flag == 1) System.out.println("NO");
            else System.out.println("YES");
        }
    }

    public static int gcd(int a , int b)
    {
        while(b != 0)
        {
            int temp = a % b;
            a = b ;
            b = temp;
        }

        return a;
    }


}
