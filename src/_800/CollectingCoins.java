package _800;

import java.util.Scanner;

public class CollectingCoins {

    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for(int i = 0 ; i < T ; i ++)
        {
            long a = sc.nextLong();
            long b = sc.nextLong();
            long c = sc.nextLong();
            long d = sc.nextLong();

            if((a + b + c + d)% 3 == 0 )System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
