/*
Program1

write a program to read a string in HH:MM:SS:AM/PM format 
and produce the input string in 24 Hour Format 

Input- the string is in 12- hour AM/PM format
Output - the input string should be in 24-hour format

Assume all HH,MM,SS are in the valid range only 

Note: Midnight is 12:00:00AM on a 12-hour clock,  and 00:00:00 on a 24-hour clock. 
Noon is 12:00:00PM on a 12-hour clock,  and 12:00:00 on a 24-hour clock. 
     
Assume all input times are valid
    
input = 06:10:20PM
output = 18:10:20

input = 01:45:50PM
output = 13:45:50

input = 10:05:30AM
output = 10:05:30

input = 12:30:45AM
output = 00:30:45

input = 02:13:19AM
output = 02:13:19
*/
import java.util.*;
class N-Hour1
{
//    input = 12:30:45AM
//output = 00:30:45
public static String Pro_Ho(String s)
{
    StringBuilder sb = new StringBuilder(s);
    
    //System.out.println(sb);
    StringBuilder sb1 = new StringBuilder(sb.subSequence(sb.length()-2,sb.length()));
    if(sb.substring(sb.length()-2,sb.length()).equals("AM"))
    {
        if(sb.substring(0,2).equals("12"))
        {
            sb.replace(0,2,"00");
        }
    }
    else//PM
    {
        if(sb.charAt(0)=='0')
        {
           int re=Integer.parseInt(""+sb.charAt(1));
           re+=12;
           sb.replace(0,2,""+re);
        }
    }
    sb.delete(sb.length()-2,sb.length());
    return String.valueOf(sb);
    //return "l";
}
    public static void main(String[] ags)
    {
        Scanner sc = new Scanner(System.in);
        String s=sc.next();
        System.out.println(Pro_Ho(s));
        sc.close();
    }
}