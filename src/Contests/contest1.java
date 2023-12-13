package Contests;//File Created by -- > anuragbhatt
//Created On -- > 05/12/23,Tuesday

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;
import java.util.StringTokenizer;

public class contest1 {
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

        while(t-- > 0) {
            String s = sc.next();

            var cap = new Stack<Integer>();
            var small = new Stack<Integer>();

            for (int i = 0; i < s.length(); ++i) {
                char item = s.charAt(i);

                if(item == 'b')
                {
                    if( !small.isEmpty())small.pop();
                }
                else if (item == 'B')
                {
                    if(!cap.isEmpty()) cap.pop();
                }
                else if(item >= 65 && item <= 90)cap.push(i);
                else if(item >= 97 && item <= 122)small.push(i);
            }

            var idx = new ArrayList<Integer>();

            while (!small.isEmpty() || !cap.isEmpty()) {
                if (!small.isEmpty()) idx.add(small.pop());
                if (!cap.isEmpty()) idx.add(cap.pop());
            }

            Collections.sort(idx);

            String ans = "";

            for(int i = 0 ; i < idx.size() ; ++i)
            {
                ans += s.charAt(idx.get(i));
            }

            System.out.println(ans);
        }
    }
}
