package Practice.Round_4_Div_2;

//File Created by -- > anuragbhatt
//Created On -- > 29/02/24,Thursday

import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

import static java.lang.System.out;


public class RegistrationSystem {


    public static void main(String[] args) throws IOException {

        var sc = new Scanner(System.in);

        int n = sc.nextInt();
        var map = new HashMap<String , Integer>();

        while(n-- > 0)
        {
            String input = sc.next();

            if(map.containsKey(input))
            {
                int val = map.get(input);
                val++;
                map.put(input , val);

                input += val;

                map.put(input , 0);

                out.println(input);
            }
            else
            {
                map.put(input , 0);
                out.println("OK");
            }
        }
    }
}
