package Practice.Round_836_Div_2;

//File Created by -- > anuragbhatt
//Created On -- > 02/02/24,Friday

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class AlmostAllMultiples {

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
            int n = sc.nextInt() , x = sc.nextInt();
            int[] a = new int[n];

            if(n % x != 0 )
            {
                System.out.println(-1);
                continue;
            }

            a[0] = x;
            a[n-1] = 1;

            var f = factors(n/x);

            for(int i = 0 ; i < n ; ++i)
            {
                if(x < n)
                {
                    a[x-1] = x * f.get(i);
                    x = x * f.get(i);
                }
            }

            for(int i = 0 ; i < n ; i++)
            {
                if(a[i] == 0 )a[i] = i+1;
            }

            for(int i : a)
            {
                System.out.print(i + " ");
            }

            System.out.println();
        }
    }

    public static ArrayList<Integer> factors(int n)
    {
        var f = new ArrayList<Integer>();

        while(n % 2 == 0)
        {
            f.add(2);
            n = n /2;
        }

        for(int i = 3 ; i <= Math.sqrt(n) ; i += 2)
        {
            while(n % i == 0)
            {
                f.add(i);
                n /= i;
            }
        }

        if(n > 2)f.add(n);

        return f;
    }
}
