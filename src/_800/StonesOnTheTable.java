package _800;

import java.util.Scanner;

public class StonesOnTheTable {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        sc.nextLine();
        String s= sc.nextLine();
        int count = 0;
        for(int i = 1 ; i < s.length() ; i++)
        {
            if(s.charAt(i) == s.charAt(i-1))count++;
        }

        System.out.println(count);
    }
}
