package _800;

import java.util.Scanner;

public class bit_plus_plus {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        int count = 0 ;

        for(int i = 0 ; i < T ; i ++)
        {
            String s = sc.next();
            if(s.equals("++X") || s.equals("X++"))count++;
            else count--;
        }

        System.out.println(count);
    }
}
