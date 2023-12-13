package _800;//File Created by -- > anuragbhatt
//Created On -- > 12/09/23,Tuesday

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class AntonAndDanik {
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

        FastReader read = new FastReader();
        int n = read.nextInt();
        String s = read.next();

        var map = new HashMap<Character , Integer>();

        for(int i = 0 ; i < n ; i ++)
        {
            char item = s.charAt(i);
            map.put(item , map.getOrDefault(item , 0 )+1);
        }

        int a = 0 , d = 0;
        a = map.getOrDefault('A', 0);

         d = map.getOrDefault('D' , 0);

        if(a < d) System.out.println("Danik");
        else if(a > d) System.out.println("Anton");
        else System.out.println("Friendship");
    }
}
