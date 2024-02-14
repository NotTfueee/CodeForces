#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")
package ${PACKAGE_NAME};
#end
#parse("File Header.java")

//File Created by -- > ${USER}
//Created On -- > ${DATE},${DAY_NAME_FULL}

import static java.lang.Math.min;
import static java.lang.Math.max;
import static java.lang.Math.abs;
import static java.lang.System.out;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;


public class ${NAME} {

    public static class FastReader 
    {
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

    public static void main(String[] args) throws IOException 
    {
        var sc = new FastReader();
        int t = sc.nextInt();
    }
}
