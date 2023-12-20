package Contests.Dec19_2023;
//File Created by -- > anuragbhatt
//Created On -- > 19/12/23,Tuesday

import java.util.*;

public class q4 {
    static class Pair {
        int first;
        int second;

        Pair(int first, int second) {
            this.first = first;
            this.second = second;
        }
    }

    public static void maxSumNoMatch(int n, List<Pair> arr1, List<Pair> arr2, List<Pair> arr3) {
        arr1.sort((a, b) -> Integer.compare(b.first, a.first));
        arr2.sort((a, b) -> Integer.compare(b.first, a.first));
        arr3.sort((a, b) -> Integer.compare(b.first, a.first));

        int result = 0;
        for (int x = 0; x < 3; x++) {
            for (int y = 0; y < 3; y++) {
                for (int z = 0; z < 3; z++) {
                    if (arr1.get(x).second != arr2.get(y).second &&
                            arr1.get(x).second != arr3.get(z).second &&
                            arr2.get(y).second != arr3.get(z).second) {

                        result = Math.max(result, arr1.get(x).first + arr2.get(y).first + arr3.get(z).first);

                    }
                }
            }
        }

        System.out.println(result);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tCases = scanner.nextInt();
        for (int i = 0; i < tCases; i++) {
            int size = scanner.nextInt();
            List<Pair> array1 = new ArrayList<>();
            List<Pair> array2 = new ArrayList<>();
            List<Pair> array3 = new ArrayList<>();

            for (int j = 0; j < size; j++) {
                int val = scanner.nextInt();
                array1.add(new Pair(val, j + 1));
            }
            for (int j = 0; j < size; j++) {
                int val = scanner.nextInt();
                array2.add(new Pair(val, j + 1));
            }
            for (int j = 0; j < size; j++) {
                int val = scanner.nextInt();
                array3.add(new Pair(val, j + 1));
            }

            maxSumNoMatch(size, array1, array2, array3);
        }
    }
}

