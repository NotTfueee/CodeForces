package Practice.Round_903_Div_3;
//File Created by -- > anuragbhatt
//Created On -- > 27/12/23,Wednesday

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class DontTryToCount {
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

    public static void main(String[] args)
    {
        var sc = new FastReader();
        int t = sc.nextInt();

        while(t-- > 0)
        {
            int n = sc.nextInt() , m = sc.nextInt();

            String x = sc.nextLine() , s = sc.nextLine();

            if(x.contains(s))
            {
                System.out.println(0);
                continue;
            }

            int count = 0  , flag = 0;

            while(x.length() <= 25)
            {
                count++;
                x += x;

                if(x.contains(s)) {
                    flag = 1;
                    break;
                }
            }

            if(flag == 1) System.out.println(count);
            else System.out.println(-1);

        }
    }
}
