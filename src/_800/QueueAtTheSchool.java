package _800;//File Created by -- > anuragbhatt
//Created On -- > 13/09/23,Wednesday

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class QueueAtTheSchool {
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
        int time = sc.nextInt();
        String str = sc.next();

        StringBuilder s = new StringBuilder(str);

        for(int i = 0 ; i < time ; i ++)
        {
            for(int j = 0 ; j < s.length() ; j ++)
            {
                if(s.charAt(j) == 'B' && j != s.length()-1)
                {
                    if(s.charAt(j+1) =='G')
                    {
                        s.setCharAt(j,'G');
                        s.setCharAt(j+1 , 'B');
                        j++;
                    }
                }
            }
        }

        System.out.println(s);
    }
}
