package _800;//Created On -- > 14/09/23,Thursday

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class BeautifulYear {
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
        int year = read.nextInt();

       // will brute force the solution we will keep on adding 1 to the year until all the digits become unique and we will
        // check this by using a hashset

        var set = new HashSet<Integer>();
        int n = year , temp = 0;

        while(true)
        {
            n = n + 1;
            temp = n ;

            while(n > 0)
            {
                int digit = n % 10;
                if(set.contains(digit))break;
                else
                {
                    set.add(digit);
                    n = n/10;
                }
            }

            if(set.size() == 4)break;
            set.clear();
            n = temp;
        }

        System.out.println(temp);
    }
}
