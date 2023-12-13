package _800;

import java.util.Scanner;

public class PetyaAndStrings {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine().toLowerCase();
        String b = sc.nextLine().toLowerCase();

        boolean small = false , equal = false , big = false;
        for(int i = 0 ; i < a.length() ; i++)
        {
            char one = a.charAt(i);
            char two = b.charAt(i);

            if((one - two) == 0 )equal = true;
            else if((one - two ) < 0)
            {
                equal = false;
                small = true;
                break;
            }
            else
            {
                equal = false;
                small = false;
                big = true;
                break;
            }
        }

        if(small)System.out.println("-1");
        else if(equal)System.out.println("0");
        else System.out.println("1");
    }
}
