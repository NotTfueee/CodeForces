package Practice.Round_855_Div_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CountTheNumberOfPairs {

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

            int[] small = new int[26];
            int[] big = new int[26];

            for(int i = 0 ; i < n ; ++i)
            {
                char item = s.charAt(i);

                if(Character.isLowerCase(item))
                {
                    small[item-'a']++;
                }
                else big[item-'A']++;
            }

            int ans = 0 , extra = 0;
            for(int i = 0 ; i < 26 ; ++i)
            {
                ans += Math.min(small[i] , big[i]);
                small[i] = Math.abs(small[i] - big[i]);

                extra += small[i] / 2;
            }

            ans += Math.min(k , extra);

            System.out.println(ans);
        }
    }
}
