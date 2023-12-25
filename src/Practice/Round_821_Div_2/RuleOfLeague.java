package Practice.Round_821_Div_2;
//File Created by -- > anuragbhatt
//Created On -- > 24/12/23,Sunday

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class RuleOfLeague {
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
        var sc = new FastReader();

        int t = sc.nextInt();

        while(t-- > 0)
        {
            int n = sc.nextInt() , x = sc.nextInt() , y = sc.nextInt();


            if(x > 0 && y > 0 || x == 0 && y == 0 )
            {
                System.out.println(-1);
                continue;
            }

            int win = x != 0 ? x : y;

            if((n-1) % win != 0)
            {
                System.out.println(-1);
                continue;
            }

            int prev = 1 , count = 0 ;

            for(int i = 0 ; i < n-1 ; ++i)
            {
                if(count < win) {
                    System.out.print(prev + " ");
                    count++;
                }

                else
                {
                    if(prev == 1)
                    {
                        prev += (win+1);
                    }
                    else prev += win;

                    System.out.print(prev + " ");
                    count = 1;
                }
            }

            System.out.println();
        }
    }
}
