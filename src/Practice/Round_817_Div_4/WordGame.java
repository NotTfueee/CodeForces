package Practice.Round_817_Div_4;

//File Created by -- > anuragbhatt
//Created On -- > 16/02/24,Friday

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.StringTokenizer;


public class WordGame {

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

            var map = new HashMap<String , ArrayList<Integer>>();

            for(int i = 0 ; i < 3 ; ++i)
            {
                for(int j = 0 ; j < n ; ++j)
                {
                    String s = sc.next();

                    if(map.containsKey(s))
                    {
                        var idx = map.get(s);
                        idx.add(i + 1);

                        map.put(s , idx);
                    }
                    else
                    {
                        var idx = new ArrayList<Integer>();
                        idx.add(i + 1);
                        map.put(s , idx);
                    }
                }
            }


            int a = 0 , b = 0 , c = 0;

            for(String s : map.keySet())
            {
                var idx = map.get(s);

                if(idx.size() == 2)
                {
                    for(int i : idx)
                    {
                        if(i == 1)a++;
                        else if(i == 2)b++;
                        else c++;
                    }
                }
                else if(idx.size() == 1)
                {
                    for(int i : idx)
                    {
                        if(i == 1)a += 3;
                        else if(i == 2) b += 3;
                        else c += 3;
                    }
                }
            }


            System.out.println(a + " " + b + " " + c);
        }
    }
}
