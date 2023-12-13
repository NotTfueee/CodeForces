package _800;

import java.util.Scanner;

public class Watermelon {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(divide(n));
    }

    public static String divide(int n )
    {
        if(n % 2 == 0 && n > 2 ) return "YES";
        else return "NO";


    }
}