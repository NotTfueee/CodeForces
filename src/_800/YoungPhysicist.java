package _800;//File Created by -- > anuragbhatt
//Created On -- > 15/09/23,Friday

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class YoungPhysicist {
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

        int sumA = 0 , sumB = 0 , sumC = 0;

        for(int i = 0 ; i < n ; i ++)
        {
            sumA += sc.nextInt();
            sumB += sc.nextInt();
            sumC += sc.nextInt();
        }

        if(sumA == 0 && sumB == 0 && sumC == 0)System.out.println("YES");
        else System.out.println("NO");
    }
}
