package _800;

import java.util.Scanner;

public class Team {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int count = 0 ;
        for(int i = 0 ; i < T ; i ++)
        {
            int p = sc.nextInt();
            int v = sc.nextInt();
            int c = sc.nextInt();

            if(p+v+c >= 2)count++;
        }

        System.out.println(count);
    }
}
