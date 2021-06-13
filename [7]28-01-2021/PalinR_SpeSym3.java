/*
Write a Java program to check if a sentence is a palindrome or not

If Palindrome print true else print false

We know a string is Palindrome if it is the same reading from both sides.
Now you have to check if a string is palindrome or not

Note - Assume the input line  here is not case sensitive
ignore the special symbols,spaces and compare only the characters and print true or false


input =a man a plan a canal panama
output = 1

in the above  example first character is 'a' last character is 'a'
second character is 'm' last second character is 'm' and comparing so on all characters should be equal


input =do nine men interpret nine men i nod
output = true

input =Red rum, sir, is murder
output = true 

input = Was it a cat I saw?
output = true

input =Eva,   can I s e e b^% e e s i n a ca;;;ve?
output = true 

input =No lemon, no melon
output = true 
*/
import java.util.*;
class PalinR_SpeSym3
{//Eva,   can I s e e b^% e e s i n a ca;;;ve?
    public static boolean isPalinR(String s)
    {
        String[] ss=s.split("[,./<>?;:'~!@#$%^&* ]");
        StringBuilder sb =new StringBuilder();
        for(String i : ss)
        {
            sb.append(i);
        }
        sb=new StringBuilder(String.valueOf(sb).toLowerCase());
        //System.out.println(sb);
        if(String.valueOf(sb).equals(String.valueOf(sb.reverse())))
        {
            return true;
        }
        return false;
    }
    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println(isPalinR(s));
        sc.close();
    }
}