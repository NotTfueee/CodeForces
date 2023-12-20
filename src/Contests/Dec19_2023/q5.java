package Contests.Dec19_2023;
//File Created by -- > anuragbhatt
//Created On -- > 19/12/23,Tuesday

import java.util.*;

public class q5 {
    static class Pair {
        int first;
        int second;

        Pair(int first, int second) {
            this.first = first;
            this.second = second;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int n = scanner.nextInt();
            int[] arrayA = new int[n];
            int[] arrayB = new int[n];

            for (int i = 0; i < n; i++) {
                arrayA[i] = scanner.nextInt();
            }

            for (int i = 0; i < n; i++) {
                arrayB[i] = scanner.nextInt();
            }

            List<Pair> combined = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                combined.add(new Pair(arrayA[i] + arrayB[i], i));
            }

            combined.sort((a, b) -> Integer.compare(b.first, a.first));

            long result = 0;
            long operations = 0;

            for (int i = n - 1; i >= 0; i--) {
                if (operations % 2 == 0) {
                    result += arrayA[combined.get(i).second] - 1;
                } else {
                    result -= arrayB[combined.get(i).second] - 1;
                }
                operations++;
            }

            System.out.println(result);
        }
    }
}
