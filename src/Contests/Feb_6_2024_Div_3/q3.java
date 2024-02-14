package Contests.Feb_6_2024_Div_3;

//File Created by -- > anuragbhatt
//Created On -- > 06/02/24,Tuesday

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class q3 {

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
            int n = sc.nextInt() , m = sc.nextInt() , k = sc.nextInt();

            int[]a = new int[n];
            int[]b = new int[m];

            for(int i = 0 ; i < n ; ++i)a[i] = sc.nextInt();
            for (int i = 0 ; i < m ; ++i)b[i] = sc.nextInt();

            var seta = new HashSet<Integer>();
            var setb = new HashSet<Integer>();


            for(int i = 0 ; i < n ; ++i)
            {
                if(a[i] >= 1 && a[i] <= k)
                {
                    seta.add(a[i]);
                }
            }

            if(seta.size() < (k/2))
            {
                System.out.println("NO");
                continue;
            }

            for(int i = 0 ; i < m ; ++i)
            {
                if(b[i] >= 1 && b[i] <= k)
                {
                    setb.add(b[i]);
                }
            }

            if(setb.size() < (k/2))
            {
                System.out.println("NO");
                continue;
            }

            int flag = 0;
            for(int i = 1 ; i <= k ; ++i)
            {
                if(!seta.contains(i) && !setb.contains(i))
                {
                    flag =1;
                    break;
                }
            }

            if(flag == 1) System.out.println("NO");
            else System.out.println("YES");
        }
    }
}
