/*
Program-1
Ramu is given two words(a,b) of same size 

he has to select an index and  break the word at the same index 
for both the words 

breaking a into two words : a1 and a2 where a = a1 + a2 , 
and breaking b into two words: b1 and b2 where b = b1 + b2 . 

Check if a1 + b2 or b1 + a2 forms a palindrome.

When you break a word s into s1 and s2 , either s1 or s2 is
 allowed to be empty. 

For example, if s ="abc" , then "" + "abc" , "a" + "bc" , "ab" + "c" , 
and "abc" + "" are valid breaks.

Return true if it is possible to form a palindrome word,
 otherwise return false .

Notice that x + y denotes the concatenation of words x and y .


Input: a = "x", b = "y"
Output: true

Explaination: If either a or b are palindromes the answer is true since you can break in the following way:

a = "", a = "x"
b = "", b = "y"
Then, a + b = "" + "y" = "y", which is a palindrome.



Input: a = "abdef", b = "fecab"
Output: true



Input: a = "ulacfd", b = "jizalu"
Output: true
Explaination: break them at index 3:


a1 = "ula", a2 = "cfd"
b1 = "jiz", b2 = "alu"
Then, a1 + b2 = "ula" + "alu" = "ulaalu", which is a palindrome.


case = 1
input = xbdef
xecab
output = false

case = 2
input = hello
tlleo
output = false

case = 3
input = abcdefghijkl
fedcbalkjihg
output = false

case = 4
input = abcdefghijkl
fghijeeedcba
output = true
*/
import java.util.*;
class Ramu1
{
    public static boolean checkIf(StringBuilder a,StringBuilder b)
    {
        //if a1="" then a1+b2=b where b1=""
        //then b1+a2=a
        if(isPalin(b) || isPalin(a))
        {return true;}
        for(int i=0;i<a.length();i++)
        {
            if(isPalin(new StringBuilder(a.substring(0,i)+b.substring(i,a.length()))) || 
            isPalin(new StringBuilder(b.substring(0,i)+a.substring(i,a.length()))))
            {return true;}
        }
        return false;
    }
    public static boolean isPalin(StringBuilder a)
    {
        if(String.valueOf(a).equals(String.valueOf(a.reverse()))){return true;}
        return false;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String a=sc.next();
        String b=sc.next();
        System.out.println(checkIf(new StringBuilder(a),new StringBuilder(b)));
        sc.close();
    }
}