package Practice.Round_871_Div_4;

//File Created by -- > anuragbhatt
//Created On -- > 29/01/24,Monday

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class GoldRush {

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
            long n = sc.nextLong() , m = sc.nextLong();

            if(n == m)
            {
                System.out.println("YES");
                continue;
            }
            else if(n % 3 != 0 || m > n)
            {
                System.out.println("NO");
                continue;
            }

            if(find(n , m)) System.out.println("YES");
            else System.out.println("NO");
        }
    }

    public static boolean find(long n , long m )
    {

        if(n < m || n == 0)return false;

        if(n % 3 != 0)return false;

        long one = n / 3;
        long two = one * 2;

        if (one == m || two == m) return true;

        return find(one, m) || find(two, m);

    }
}
