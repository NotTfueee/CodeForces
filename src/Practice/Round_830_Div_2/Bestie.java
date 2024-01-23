package Practice.Round_830_Div_2;

//File Created by -- > anuragbhatt
//Created On -- > 23/01/24,Tuesday

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bestie {

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

        while(tt-- > 0)
        {
            int n = sc.nextInt();
            long[] arr = new long[n];

            for(int i = 0 ; i < n ; ++i)
            {
                arr[i] = sc.nextLong();
            }

            long res = arr[0];

            for(int i = 1 ; i < n ; ++i)
            {
                res = gcd(arr[i] , res);

                if(res == 1)
                {
                    break;
                }
            }

            if(res == 1) System.out.println(0);
            else if(gcd(res , n) == 1) System.out.println(1);
            else if(gcd(res , n-1) == 1) System.out.println(2);
            else System.out.println(3);

        }
    }

    public static long gcd(long a , long b)
    {
        while(b != 0)
        {
            long temp = a % b;
            a = b;
            b = temp;
        }

        return a;
    }
}
