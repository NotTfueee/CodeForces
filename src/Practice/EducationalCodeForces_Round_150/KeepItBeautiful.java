package Practice.EducationalCodeForces_Round_150;

//File Created by -- > anuragbhatt
//Created On -- > 02/02/24,Friday

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class KeepItBeautiful {

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
            int[] a = new int[n];

            for(int i = 0 ; i < n ; ++i)
            {
                a[i] = sc.nextInt();
            }

            StringBuilder ans = new StringBuilder();
            ans.append(1);

            boolean flag = true , first = true;
            int curr = a[0];

            for(int i = 1 ; i < n ; ++i)
            {
                if(a[i] >= curr && flag)
                {
                    curr = a[i];
                    ans.append(1);
                }
                else if(a[i] <= a[0] && (curr <= a[i] || first))
                {
                    ans.append(1);
                    curr = a[i];
                    first = false;
                    flag = false;
                }
                else ans.append(0);
            }

            System.out.println(ans);

        }
    }
}
