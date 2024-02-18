package Practice.Round_817_Div_4;

//File Created by -- > anuragbhatt
//Created On -- > 16/02/24,Friday

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;


public class Line {

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
            String s = sc.next();

            long total = 0;

            for(int i = 0 ; i < n ; ++i)
            {
                if(s.charAt(i) == 'L')
                {
                    total += i;
                }
                else
                {
                    total += (n-1 - i);
                }
            }


            long[] change = new long[n];

            for(int i = 0 ; i < n ; ++i)
            {
                if(s.charAt(i) == 'L')
                {
                    change[i] = (n-1-i) - i;
                }
                else
                {
                    change[i] = (i) - (n-1-i) ;
                }
            }

            Arrays.sort(change);

            change = rotate(change);

            for(int i = 0 ; i < n ; ++i)
            {
                if(change[i] >= 0)
                {
                    total += change[i];
                }

                System.out.print(total + " ");
            }

            System.out.println();
        }
    }

    public static long[] rotate (long[] arr)
    {
        int left = 0 , right = arr.length-1;

        while(left < right)
        {
            arr[left] ^= arr[right];
            arr[right] ^= arr[left];
            arr[left] ^= arr[right];

            left ++;
            right--;
        }

        return arr;
    }
}
