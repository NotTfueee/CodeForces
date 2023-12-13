package _800;

import java.util.Scanner;

public class WayTooLongWords {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for(int i = 0 ; i < T ; i ++)
        {
            String s = sc.next();
            System.out.println(word(s));
        }

        sc.close();
    }

    public static String word(String s)
    {
        if(s.length() > 10)
        {
            s = s.charAt(0)+""+(s.length()-2)+s.charAt(s.length()-1);
        }
        return s;
    }
}
