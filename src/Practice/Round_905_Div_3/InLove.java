package Practice.Round_905_Div_3;

//File Created by -- > anuragbhatt
//Created On -- > 12/02/24,Monday

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class InLove {

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

        int q = sc.nextInt();

        var start = new TreeMap<Long , Integer>();
        var end = new TreeMap<Long , Integer>();

        while(q-- > 0)
        {
            char c = sc.next().charAt(0);
            long l = sc.nextLong();
            long r = sc.nextLong();

            if(c == '+')
            {
                start.put(l , start.getOrDefault(l , 0 ) + 1);
                end.put(r , end.getOrDefault(r , 0 ) + 1);
            }
            else
            {
                int valL = start.get(l);

                if(valL > 1)
                {
                    valL--;
                    start.put(l , valL);
                }
                else start.remove(l);

                int valR = end.get(r);

                if(valR > 1)
                {
                    valR -- ;
                    end.put(r , valR);
                }
                else end.remove(r);
            }

            if(start.isEmpty()) System.out.println("NO");
            else if(start.lastKey() > end.firstKey()) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
