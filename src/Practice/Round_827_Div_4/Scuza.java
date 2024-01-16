package Practice.Round_827_Div_4;
//File Created by -- > anuragbhatt
//Created On -- > 16/01/24,Tuesday

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Scuza {
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(
                    new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                if (st.hasMoreTokens()) {
                    str = st.nextToken("\n");
                } else {
                    str = br.readLine();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }

    public static class Pair
    {
        int idx;
        long val ;

        Pair(int idx , long val)
        {
            this.idx = idx;
            this.val = val;
        }
    }

    public static void main(String[] args) {

        var sc = new FastReader();
        int t = sc.nextInt();

        while(t-- > 0)
        {
            int n = sc.nextInt() , q = sc.nextInt();

            long[] arr = new long[n];
            long[] ans = new long[q];

            var query = new ArrayList<Pair>();

            for(int i = 0 ; i < n ; ++i)arr[i] = sc.nextLong();
            for(int i = 0 ; i < q ; ++i)query.add(new Pair(i , sc.nextLong()));

            query.sort((p1, p2) -> Long.compare(p1.val, p2.val));

            long sum = 0;
            int j = 0;

            for(int i = 0 ; i < q ; ++i)
            {
                long item = query.get(i).val ;

                while(j < n && item >= arr[j])
                {
                    sum += arr[j];
                    j++;
                }

                ans[query.get(i).idx] = sum;
            }

            for(long i : ans)
            {
                System.out.print(i + " ");
            }

            System.out.println();
        }

    }
}
