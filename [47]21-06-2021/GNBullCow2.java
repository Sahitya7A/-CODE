/*
Program - 2

You are playing the following Bulls and Cows game with your friend: 

You write down a number and ask your friend to guess what the number is. 

Each time your friend makes a guess, you provide a hint that indicates 
how many digits in said guess match your secret number exactly in both digit and position (called "bulls") and 
how many digits match the secret number but locate in the wrong position (called "cows"). 

Your friend will use successive guesses and hints to eventually derive the secret number.

Write a function to return a hint according to the secret number and friend's guess, use B to indicate the bulls and C to indicate the cows. 

Please note that both secret number and friend's guess may contain duplicate digits.

Example 1:

input =
1807
7810
output =1B3C


secret = 1807, guess = 7810
Explanation: 1 bull and 3 cows. The bull is 8, the cows are 0, 1 and 7.
Output: "1B3C"


Example 2:
input =
1123
0111
output =1B1C


Input: secret = "1123", guess = "0111"


Explanation: The 1st 1 in friend's guess is a bull, the 2nd or 3rd 1 is a cow.
Note: You may assume that the secret number and your friend's guess only 
contain digits, and their lengths are always equal.
*/
import java.util.*;
class GNBullCow2
{
    public static void printHint(StringBuilder c,StringBuilder g)
    {
        int B=0,C=0;
        for(int i=0;i<c.length();i++)
        {
            if((c.charAt(i)+"").equals(g.charAt(i)+""))
            {
                B++;
                c.deleteCharAt(i);
                g.deleteCharAt(i);
                //System.out.println("B="+B);
                //System.out.println("c="+c+" g="+g);
            }
        }
        for(int i=0;i<c.length();i++)
            {
                if(String.valueOf(g).contains(""+c.charAt(i)))
                {
                    C++;
                    g.setCharAt(g.indexOf(""+c.charAt(i)),'-');
                    c.setCharAt(i,'-');
                    //System.out.println("C="+C);
                    //System.out.println("c="+c+" g="+g);
                }
            }
        System.out.println(B+"B"+C+"C");
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String c=sc.next();
        String g=sc.next();
        //System.out.println("c="+c+" g="+g);
        printHint(new StringBuilder(c),new StringBuilder(g));
        sc.close();
    }
}