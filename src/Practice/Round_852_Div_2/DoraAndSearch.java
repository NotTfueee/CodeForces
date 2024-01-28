package Practice.Round_852_Div_2;

//File Created by -- > anuragbhatt
//Created On -- > 28/01/24,Sunday

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class DoraAndSearch {

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
            for(int i = 0 ; i <n ; ++i)
            {
                a[i] = sc.nextInt();
            }

            int l = 0 , r = n-1 , mn = 1 , mx = n;

            while(l <= r)
            {
                if(a[l] == mn)
                {
                    l++;
                    mn++;
                }
                else if(a[l] == mx)
                {
                    l++;
                    mx--;
                }
                else if(a[r] == mn)
                {
                    r--;
                    mn++;
                }
                else if(a[r] == mx)
                {
                    r--;
                    mx--;
                }
                else break;
            }

            if(l <= r) System.out.println((l+1) + " " + (r+1));
            else System.out.println(-1);
        }
    }
}
