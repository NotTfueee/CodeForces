package _900;
//File Created by -- > anuragbhatt
//Created On -- > 27/11/23,Monday

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class DevuTheSingerChuruTheJoker {
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

        int songs = sc.nextInt() , d = sc.nextInt() , sum = 0;

        for(int i = 0 ; i < songs ; ++i)
        {
            sum += sc.nextInt();
        }

        int breakTime = (songs-1) * 10;

        int churuJokesCount = breakTime/5 ;

        int totalTime = sum + breakTime ;

        if(totalTime > d) System.out.println(-1);
        else System.out.println( churuJokesCount+(d - totalTime) / 5);
    }
}
