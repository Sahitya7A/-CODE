import java.util.*;
class CV2
{
    public static void clearStr(String sa)
    {
        StringBuilder sb =new StringBuilder();
        for(int i=0;i<sa.length();i++)
        {
            if(isVowel(sa.charAt(i)))
            {
                sb.append("V");
            }
            else
            {
                sb.append("C");
            }
        }
        int i=1;
        while(i<sb.length())
        {
            if(sb.charAt(i)==sb.charAt(i-1))
            {
                sb.setCharAt(i-1,'0');
            }
            i++;
        }
        for(int s=0;s<sb.length();s++)
        {
            if(!(sb.charAt(s)=='0')){System.out.print(sb.charAt(s));}
        }
    }
    public static boolean isVowel(char a)
    {
        if(a=='a' || a=='e' || a=='i' || a=='o' || a=='u' ||a=='A' || a=='E' || a=='I' || a=='O' || a=='U')
        {
            return true;
        }
        return false;
    }
    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
        String s=sc.next();
        //System.out.print(clearStr(s));
        clearStr(s);
    }
}
/*
Write a java program to read a word as input and returns another string as output,
such that , a vowel in the input string will be de denoted by upper case letter ‘V’ and a
consonant in the input string will be denoted by upper case letter ‘C’.

Note - The output will contain a word containing alternating sequence of ‘C’ and ‘V’.
It is not permissible to have two or more consecutive V or C in Sequence.
Assume the Input String will contain only lower and upper case alphabets

input = hello
output = CVCV

Explanation - When we convert the above  "hello" we have CVCCV
but for the output It is not permissible to have two or more consecutive V or C in Sequence.
so CVCCV changes to CVCV


Sample Test Cases

input = aeibo
output = VCV

input = Whereabouts
output = CVCVCVC

input = aeiou
output = V

input = BCDEFGIIKL
output = CVCVC

input = aeiOUabCdEfg
output = VCVC
*/
