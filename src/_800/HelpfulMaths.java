package _800;

import java.util.Scanner;

public class HelpfulMaths {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        int one = 0 , two = 0 , three = 0 ;

        for(int i = 0 ; i < s.length(); i ++)
        {
            char item = s.charAt(i);

            if(item == '1')one++;
            else if(item == '2')two++;
            else if(item == '3')three++;
        }

        String ans = "";
        while(one-- > 0)
        {
            ans += "1"+"+";
        }
        while(two-- > 0 )
        {
            ans += "2"+"+";
        }
        while(three-- > 0)
        {
            ans += "3"+"+";
        }

        System.out.println(ans.substring(0, ans.length()-1));
    }
}
