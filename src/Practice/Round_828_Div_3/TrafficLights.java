package Practice.Round_828_Div_3;
//File Created by -- > anuragbhatt
//Created On -- > 28/12/23,Thursday

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class TrafficLights {
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

    public static void main(String[] args) {
        var sc = new FastReader();
        int t = sc.nextInt();

        while(t-- > 0)
        {
            int n = sc.nextInt();
            char c = sc.next().charAt(0);

            StringBuilder s = new StringBuilder(sc.next());
            s.append(s);

            if(c == 'g')
            {
                System.out.println(0);
                continue;
            }

            int[] suff = new int[n*2];
            int val = -1;
            for(int i = n*2 - 1 ; i >= 0 ; --i)
            {
                char item = s.charAt(i);

                if(item == 'g')
                {
                    suff[i] = i;
                    val = suff[i];
                }
                else suff[i] = val;
            }

            int ans = Integer.MIN_VALUE;
            for(int i = 0 ; i < n * 2 ; ++i)
            {
                if(s.charAt(i) == c)
                {
                    ans = Math.max(ans , suff[i] - i);
                }
            }

            System.out.println(ans);
        }
    }
}
