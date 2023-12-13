package _1000;
//File Created by -- > anuragbhatt
//Created On -- > 12/12/23,Tuesday

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.StringTokenizer;

public class NotePad {
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
        int t = sc.nextInt();

        while(t-- > 0)
        {
            int n = sc.nextInt();
            String s = sc.next();

            var map = new HashMap<Character , ArrayList<Integer>>();

            for(int i = 0 ; i < n ; ++i)
            {
                char ch = s.charAt(i);

                if(map.containsKey(ch))
                {
                    var idx = map.get(ch);
                    idx.add(i);
                    map.put(ch , idx);
                }
                else
                {
                    var idx = new ArrayList<Integer>();
                    idx.add(i);
                    map.put(ch , idx);
                }
            }


            boolean flag = false;
            for(int i = 0 ; i < n ; ++i)
            {
                char ch = s.charAt(i);
                if(map.get(ch).size() > 1)
                {
                    var idx = map.get(ch);

                    for(int j = 0 ; j < idx.size() ; ++j)
                    {
                        int index = idx.get(j);

                        if(index != i && index < n-1 && i < n-1 && index < i && index + 1 != i && s.charAt(index + 1 ) == s.charAt(i+1))
                        {
                            flag = true;
                            break;
                        }
                    }
                }
            }

            if(flag) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
