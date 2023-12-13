package _1000;
//File Created by -- > anuragbhatt
//Created On -- > 23/11/23,Thursday

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class PresentFromLena {
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
        String[][] arr = new String[n*2+1][n*2+1];

        int countUp = 0 , countDown = n-1;
        for(int i = 0 ; i < n * 2 + 1 ; ++i)
        {
            if(i <= n)
            {
                int numUp = 0 , flagUp = 0;
                for(int j = 0 ; j < n * 2 + 1 ; ++j)
                {

                    if(j < n-countUp || j > n + countUp)
                    {
                        arr[i][j] = " ";
                    }
                    else if(j >= n-countUp && j <= n+countUp)
                    {
                        arr[i][j] = numUp+"";
                        if(flagUp == 0)
                        {
                            if(numUp == countUp )
                            {
                                flagUp = 1;
                                numUp--;
                            }
                            else numUp ++;
                        }
                        else
                        {
                            numUp--;
                        }
                    }
                }
                countUp ++;
            }
            else
            {
                int numDown = 0 , flagDown = 0;
                for(int j = 0 ; j < n * 2 + 1 ; ++j)
                {

                    if(j < n-countDown || j > n + countDown)
                    {
                        arr[i][j] = " ";
                    }
                    else if(j >= n-countDown && j <= n+countDown)
                    {
                        arr[i][j] = numDown+"";
                        if(flagDown == 0)
                        {
                            if(numDown == countDown )
                            {
                                flagDown = 1;
                                numDown--;
                            }
                            else numDown ++;
                        }
                        else
                        {
                            numDown--;
                        }
                    }
                }
                countDown --;
            }
        }

        for (int i = 0; i < n * 2 + 1; ++i) {
            for (int j = 0; j < n * 2 + 1; ++j) {
                // Adjust spacing for alignment
                if (j == n * 2) {
                    System.out.print(arr[i][j]);
                } else {
                    System.out.print(arr[i][j] + " ");
                }
            }
            System.out.println();
        }


    }
}
