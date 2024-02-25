package Practice.Round_805_Div_3;

//File Created by -- > anuragbhatt
//Created On -- > 25/02/24,Sunday

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

import static java.lang.System.out;


public class NotACheapString {

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

        while(t-- >0)
        {
            solve(sc);
        }
    }

    public static void solve(FastReader sc)throws IOException
    {
        String s = sc.next();
        int n = sc.nextInt();

        int[] ch = new int[26];

        long total = 0;
        for(int i = 0 ; i < s.length() ; ++i)
        {
            int idx = s.charAt(i) - 'a';
            ch[idx]++;
            total += (idx +1);
        }

        if(total <= n)
        {
            out.println(s);
            return;
        }

        for(int i = 25 ; i >= 0 ; --i)
        {
            while(ch[i] > 0 && total > n)
            {
                total -= (i+1);
                ch[i]--;
            }

            if(total <= n)break;
        }

        StringBuilder ans = new StringBuilder();

        for(int i = 0 ; i < s.length() ; ++i)
        {
            int idx = s.charAt(i) - 'a';

            if(ch[idx] > 0)
            {
                ans.append((char)('a'+(idx)));
                ch[idx]--;
            }
        }

        out.println(ans);
    }
}
