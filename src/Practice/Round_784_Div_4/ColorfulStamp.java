package Practice.Round_784_Div_4;

//File Created by -- > anuragbhatt
//Created On -- > 16/02/24,Friday

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class ColorfulStamp {

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

        while(t-- > 0)
        {
            int n = sc.nextInt();
            String s = sc.next();

            int f  = 0 ;

            for(int i = 0 ; i < n ; ++i)
            {
                if(s.charAt(i) != 'W')
                {
                    int b = 0 , r = 0;
                    while(i < n && s.charAt(i) != 'W')
                    {
                        if(s.charAt(i) == 'B')b++;
                        else r++;
                        i++;
                    }

                    if(b == 0 || r == 0)
                    {
                        f = 1;
                        break;
                    }
                }
            }


            if(f == 1) System.out.println("NO");
            else System.out.println("YES");
        }
    }
}
