package Practice.Round_284_Div_2;

//File Created by -- > anuragbhatt
//Created On -- > 31/01/24,Wednesday

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Lecture {

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
        int n = sc.nextInt() , m = sc.nextInt();

        var map = new HashMap<Set, String>();

        for(int i = 0 ; i < m ; ++i)
        {
            String s = sc.nextLine();

            String[] tokens = s.split(" ");

            String small = tokens[0];

            var set = new HashSet<String>();

            for(int j = 0 ; j < 2 ; ++j)
            {
                if(tokens[j].length() < small.length())
                {
                    small = tokens[j];
                }

                set.add(tokens[j]);
            }

            map.put(set , small);
        }

        String s = sc.nextLine();

        String[] tok = s.split(" ");

        for(int i = 0 ; i < tok.length ; ++i)
        {
            String item = tok[i];

            for(var set : map.keySet())
            {
                if(set.contains(item))
                {
                    if(map.get(set) != item)
                    {
                        tok[i] = map.get(set);
                    }
                }
            }
        }

        StringBuilder ans = new StringBuilder();

        for(String i : tok)
        {
            ans.append(i).append(" ");
        }

        System.out.println(ans);
    }
}
