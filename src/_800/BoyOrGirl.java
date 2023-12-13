package _800;

import java.util.HashSet;
import java.util.Scanner;

public class BoyOrGirl {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        var set = new HashSet<Character>();

        for(int i = 0 ; i < s.length(); i ++)
        {
            char item = s.charAt(i);
            set.add(item);
        }

        if(set.size()%2 != 0)System.out.println("IGNORE HIM!");
        else System.out.println("CHAT WITH HER!");
    }
}
