package _800;

import java.util.Scanner;

public class NextRound {

    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();

        int[] arr = new int[n];

        for(int i = 0 ; i < n ; i ++)
        {
            arr[i] = sc.nextInt();
        }

        int k = arr[x-1] , count = 0 ;

        for(int i = 0 ; i < n ;i ++)
        {
            if(arr[i] >= k && arr[i] > 0 )count++;
        }

        System.out.println(count);
    }
}
