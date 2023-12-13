package _800;

import java.util.Scanner;

public class BeautifulMatrix {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int[][] matrix = new int[5][5];
        int x = 0 , y = 0 , count = 0 ;

        for(int i = 0 ; i < 5 ; i ++)
        {
            for(int j = 0 ; j < 5 ; j ++)
            {
                matrix[i][j] = sc.nextInt();
                if(matrix[i][j] == 1)
                {
                    x = i ;
                    y = j ;
                }
            }
        }

        count = Math.abs(x-2) + Math.abs(y-2);

        System.out.println(count);
    }
}
