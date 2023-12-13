package _900;
//File Created by -- > anuragbhatt
//Created On -- > 29/11/23,Wednesday

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class CaseOfZeroAndOnes {
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

        int n = sc.nextInt();
        String s = sc.next();

        if(n == 1)
        {
            System.out.println(1);
            return ;
        }

        var stack = new Stack<Character>();

        for(int i = 0 ; i < n ; ++i)
        {
            char item = s.charAt(i);

            if(!stack.isEmpty())
            {
                String check = ""+item + stack.peek();

                if(check.equals("01") || check.equals("10"))stack.pop();
                else stack.push(item);
            }
            else stack.push(item);

        }

        System.out.println(stack.size());
    }
}
