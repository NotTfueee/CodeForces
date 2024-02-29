package Practice.Round_534_Div_2;

//File Created by -- > anuragbhatt
//Created On -- > 29/02/24,Thursday

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

import static java.lang.System.out;


public class GameWithString {

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
        int t = 1;

        while(t-- > 0)
        {
            solve(sc);
        }
    }

    public static void solve(FastReader sc)throws IOException
    {
        String s = sc.next();

        var stack = new Stack<Character>();
        int count = 0;

        for(int i = 0 ; i < s.length() ; ++i)
        {
            char item = s.charAt(i);
            if(stack.isEmpty())
            {
                stack.push(item);
                continue;
            }

            if(stack.peek() == item)
            {
                stack.pop();
                count++;
            }
            else stack.push(item);
        }

        if((count & 1) == 0)out.println("NO");
        else out.println("YES");
    }
}
