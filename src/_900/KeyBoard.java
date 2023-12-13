package _900;
//File Created by -- > anuragbhatt
//Created On -- > 08/11/23,Wednesday

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class KeyBoard {
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

    public static class Pair
    {
        int i ;
        int j ;

        Pair( int i , int j)
        {
            this.i = i ;
            this.j = j ;
        }
    }

    public static void main(String[] args) {
        FastReader sc = new FastReader();

        String shift = sc.next() , typed = sc.nextLine();

        var map = new HashMap<Character , Pair>();

        char[][] keyboard = {
                            {'q','w','e','r','t','y','u','i','o','p'} ,
                            {'a','s','d','f','g','h','j','k','l',';'} ,
                            {'z','x','c','v','b','n','m',',','.','/'}};

        for(int i = 0 ; i < keyboard.length ; ++i)
        {
            for (int j = 0; j < keyboard[i].length; ++j)
            {
                map.put(keyboard[i][j] , new Pair(i , j));
            }
        }

        String ans = "";
        if(shift.equals("R"))
        {
            for(int i = 0; i < typed.length() ; ++i)
            {
                char item = typed.charAt(i);
                Pair obj = map.get(item);

                if(obj.j != 0)
                {
                    ans += keyboard[obj.i][obj.j-1];
                }
                else ans += item;
            }
        }
        else
        {
            for(int i = 0 ; i < typed.length() ; ++i)
            {
                char item = typed.charAt(i);
                Pair obj = map.get(item);

                if(obj.j != 9)
                {
                    ans += keyboard[obj.i][obj.j+1];
                }
                else ans += item;
            }
        }


        System.out.println(ans);
    }
}
