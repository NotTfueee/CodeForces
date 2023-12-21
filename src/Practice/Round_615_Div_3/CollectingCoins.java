package Practice.Round_615_Div_3;
//File Created by -- > anuragbhatt
//Created On -- > 21/12/23,Thursday

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CollectingCoins {
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

        FastReader sc = new FastReader();
        int t = sc.nextInt();

        while(t-- > 0)
        {
            int a = sc.nextInt() , b = sc.nextInt() , c = sc.nextInt() , n = sc.nextInt() ;

            int max = Math.max(a, Math.max(b , c));

            int sum = (max - a) + (max - b) + (max - c);

            if(sum > n || (n - sum) % 3 != 0) System.out.println("NO");
            else if((n-sum) % 3 == 0) System.out.println("YES");
        }
    }
}
