package Practice.Round_898_Div_4;

//File Created by -- > anuragbhatt
//Created On -- > 06/02/24,Tuesday

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.StringTokenizer;

public class OneDEraser {

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
            int n = sc.nextInt() , k = sc.nextInt();

            String s = sc.next();

            var q = new ArrayDeque<Integer>();

            for(int i = 0; i < n ; ++i)
            {
                char item = s.charAt(i);

                if(item == 'B')
                {
                    q.add(i);
                }
            }

            if(k == 1)
            {
                System.out.println(q.size());
                continue;
            }

            int ans = 0;

            while(!q.isEmpty())
            {
                int start = q.peek() , j = 0;
                while(!q.isEmpty() && j < k )
                {
                    if(s.charAt(start) == 'B')q.remove();
                    start++;
                    j++;
                }
                ans++;
            }

            System.out.println(ans);
        }
    }
}
