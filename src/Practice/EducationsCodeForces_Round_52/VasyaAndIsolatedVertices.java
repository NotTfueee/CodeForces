package Practice.EducationsCodeForces_Round_52;

//File Created by -- > anuragbhatt
//Created On -- > 30/01/24,Tuesday

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class VasyaAndIsolatedVertices {

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

        long n = sc.nextLong() , m = sc.nextLong();

        long min = Math.max(0 , n - 2*m);

        long total = (n*(n-1))/2 - m;

        long sum = 0 , count = 0;

        while(sum < total)
        {
            sum += (--n);
            count ++;
        }
        System.out.println(min + " " + count);
    }
}
