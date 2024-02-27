package Practice.Round_851_Div_2;

//File Created by -- > anuragbhatt
//Created On -- > 27/02/24,Tuesday

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

import static java.lang.System.out;


public class SumOfTwoNumbers {

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
            solve(sc);
        }
    }

    public static void solve(FastReader sc)throws IOException
    {
        long n = sc.nextLong();

        if((n&1) == 0)
        {
            out.println((n>>1) + " "+ (n>>1));
            return;
        }

        String s = String.valueOf(n);

        var fir = new ArrayList<Integer>();
        var sec = new ArrayList<Integer>();

        int f = 0;

        for(int i = 0 ; i < s.length() ; ++i)
        {
            int digit = s.charAt(i)-'0';

            if((digit&1)== 0)
            {
                fir.add((digit>>1));
                sec.add((digit>>1));
            }
            else
            {
                if(f == 0)
                {
                    fir.add((digit >> 1) + 1);
                    sec.add((digit>>1));
                }
                else
                {
                    fir.add((digit>>1));
                    sec.add((digit>>1) + 1);
                }
                f ^= 1;
            }
        }

        printArray(fir);
        out.print(" ");
        printArray(sec);
        out.println();
    }

    public static void printArray(ArrayList<Integer>array)
    {
        StringBuilder ans = new StringBuilder();

        int z = 0;

        for(int i : array)
        {
            if( i != 0)
            {
                z++;
                ans.append(i);
            }

            if(i == 0 && z != 0)ans.append(i);
        }

        if(z == 0)ans.append(0);

        out.print(ans);
    }
}
