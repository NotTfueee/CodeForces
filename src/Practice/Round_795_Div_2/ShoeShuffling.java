package Practice.Round_795_Div_2;

//File Created by -- > anuragbhatt
//Created On -- > 24/01/24,Wednesday

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ShoeShuffling {

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

        while (tt-- > 0)
        {
            int n = sc.nextInt();
            long[] a = new long[n];
            int[] idx = new int[n];

            for(int i = 0 ; i < n ; ++i)
            {
                a[i] = sc.nextLong();
                idx[i] = i + 1;
            }

            StringBuilder ans = new StringBuilder();
            int flag = 0;
            for(int i = 0 ; i < n ; ++i)
            {
                long curr = a[i];
                int start = i , j = i+1;

                while(j < n && a[j] == curr)
                {
                    j++;
                }

                if(j-start == 1)
                {
                    flag = 1;
                    break;
                }
                ans.append(rotate(start, j - 1, idx));
                i = j-1;
            }

            if(flag == 1) System.out.println(-1);
            else System.out.println(ans);
        }
    }

    public static String rotate(int start , int end , int[] idx)
    {
        StringBuilder ans = new StringBuilder();
        ans.append(idx[end]).append(" ");
        end--;

        for(int i = start ; i <= end; ++i)
        {
            ans.append(idx[i]).append(" ");
        }

        return ans.toString();
    }
}
