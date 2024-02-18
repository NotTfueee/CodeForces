package Contests.Feb_6_2024_Div_3;

import java.util.*;

public class q4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T ;
        T = scanner.nextInt();
        while (T-- > 0) {
            int n, q, l, r;
            n = scanner.nextInt();
            int[] a = new int[n];
            int[] dif = new int[n];
            dif[n - 1] = n;
            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
            }
            for (int i = n - 2; i >= 0; --i) {
                dif[i] = i + 1;
                if (a[i] == a[i + 1]) {
                    dif[i] = dif[i + 1];
                }
            }
            q = scanner.nextInt();
            while (q-- > 0) {
                l = scanner.nextInt();
                r = scanner.nextInt();
                if (dif[l - 1] > r - 1) {
                    System.out.println("-1 -1");
                } else {
                    System.out.println(l + " " + (dif[l - 1] + 1));
                }
            }
        }
        scanner.close();
    }
}