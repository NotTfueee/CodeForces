package _800;
//File Created by -- > anuragbhatt
//Created On -- > 04/12/23,Monday

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.StringTokenizer;

public class RemovePrefix {
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
        int t= sc.nextInt();

        while(t -- > 0)
        {
            int n = sc.nextInt();

            var map = new HashMap<Integer , ArrayList<Integer>>();
            int[] arr = new int[n];

            for(int i = 0 ; i < n ; ++i)
            {
                arr[i] = sc.nextInt();
            }

            for(int i = 0 ; i < n ; ++i)
            {
                int item = arr[i];
                if(map.containsKey(item))
                {
                    var idx = map.get(item);
                    idx.add(i);

                    map.put(item , idx);
                }
                else
                {
                    var idx = new ArrayList<Integer>();
                    idx.add(i);
                    map.put(item , idx);
                }
            }
            int max = Integer.MIN_VALUE;

            for(int element : map.keySet())
            {
                if(map.get(element).size() > 1)
                {
                    var list = map.get(element);
                    max = Math.max(max , list.get(list.size() - 2));
                }
            }

            System.out.println(max != Integer.MIN_VALUE ? max + 1 : 0);
        }
    }
}
