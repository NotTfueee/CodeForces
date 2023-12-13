package _900;
//File Created by -- > anuragbhatt
//Created On -- > 28/11/23,Tuesday

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Contest {
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
        double a = sc.nextDouble() , b = sc.nextDouble() , c = sc.nextDouble(), d = sc.nextDouble();

        double m = (double)Math.max( (3*a)/10 , a - (a / 250) * c);
        double v = (double)Math.max( (3*b)/10 ,  b -(b / 250) * d);

        System.out.println(m + " " + v);
        if(m > v)
        {
            System.out.println("Misha");
        }
        else if(v > m)
        {
            System.out.println("Vasya");
        }
        else System.out.println("Tie");
    }
}
