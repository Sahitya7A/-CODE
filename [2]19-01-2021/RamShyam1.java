/*
Program1

Ramu and Shyam are playing a game called ReverseGame. 
In this game Shyam wants Ramu to convert the string in the following manner 

Ramu has to only reverse the letters(a-z,A-Z) and other letters remain unchanged


Sample Test Case -1

input = a&b*c$rt
output = t&r*c$ba

Explanation - 

From the above test case we have a,b,c,r,t as the alphabets 
and reversing only this characters without disturbing other characters we will have 
t&r*c$ba as the output

Sample Test Case -2

input = a&b$c#d
output = d&c$b#a

Explanation - 

From the above test case we have a,b,c,d as the alphabets 
and reversing only this characters without disturbing other characters we will have 
d&c$b#a  as the output


back end test cases
case = 1
input = abc+
output = cba+

case = 2
input = a+b*c
output = c+b*a

case = 3
input = a&b%c$s-o&h
output = h&o%s$c-b&a

case = 4
input = *&^%$#@abcd
output = *&^%$#@dcba

case = 5
input = a*b*c*de
output = e*d*c*ba



*/

import java.util.*;
class RamShyam1
{
    public static String ConvertedString(String str)
    {
        StringBuilder con_ori =new StringBuilder();
        StringBuilder sb =new StringBuilder();
        for(int i=0;i<str.length();i++)
        {
            if(Character.isLetter(str.charAt(i)))
            {
                sb.append(String.valueOf(str.charAt(i)));
            }
        }
        sb.reverse();
        int j=0;
        for(int i=0;i<str.length();i++)
        {
            if(Character.isLetter(str.charAt(i)))
            {
                con_ori.append(String.valueOf(sb.charAt(j)));
                j++;
            }
            else{con_ori.append(String.valueOf(str.charAt(i)));}
        }
        return String.valueOf(con_ori);
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s=sc.next();
        System.out.println(ConvertedString(s));
    }
}

/*
//Second Approach
import java.util.*;
public class Test {

 public static String reverseString(String str) {
  char[] arr = str.toCharArray();
  int i=0;
  int j = str.length()-1 ;
	  while(i<j) 
		  {
            if (isAlphabetNumber(arr[i]) && isAlphabetNumber(arr[j])) {
           char tmp = arr[i];
           arr[i] = arr[j];
           arr[j] = tmp;
           i++;
           j--;
   } else if (!isAlphabetNumber(arr[i])) 
    i++;
    else if (!isAlphabetNumber(arr[j])) 
    j--;
   }
  return String.valueOf(arr);
 }

 public static boolean isAlphabetNumber(char ch) {
  if ((ch >= 48 && ch <= 57)  || (ch >= 65 && ch <= 90) || (ch >= 97 && ch <= 122))
	  return true;
  else
   return false;
 }

 public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
    String str = sc.next();
    System.out.println(reverseString(str));
 }
}

*/