package Practice.Round_839_Div_3;
//File Created by -- > anuragbhatt
//Created On -- > 29/12/23,Friday

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class DifferentDifferences {
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
            int k = sc.nextInt() , n = sc.nextInt();
            int[] arr = new int[k];

            int diff = 1 , j = 1;
            for(int i = 1 ; i <= k ; ++i)
            {
                System.out.print(j + " ");

                /*
                the left part of the if statement is to count the elements that i will have if i continue to fill the array with the
                current pattern that is 1 2 4 7 11 16 and so on upto n as we can have elements from 1 to n if have filled the current place
                with the element with 7 now i can only fill the next places with elements 8 , 9 , 10 so to count this number of remaining valid
                elements we have used n - (j + diff)
                and the right side of the if statement is to count the number of places that are remaining and are to be filled
                if the count of elements to fill the array with the pattern is greater than or equal to the places to be filled in the
                array then i would continue to do so and if it is not possible to continue with the pattern then simply add one to the current
                element to fill the array
                 */
                if(n - (j + diff) >= ( k - (i + 1)))
                {
                    j = j + diff;
                    diff++;
                }
                else j++;
            }
            System.out.println();
        }
    }
}
