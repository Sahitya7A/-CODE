/*
 Given a group of word/words and number of rows 'n'.
 write it as shown in the test cases


Sample Test Case - 1
input = THURSDAY
2
output = TUSAHRDY


Explanation: Write the word in 2 rows

T   U   S   A
  H    R   D   Y


the word formed is TUSAHRDY

Sample Test Case - 2
input = system
3
output = seytms

Explanation: write the given word in 3 rows
s         e
  y    t    m
     s

the word is seytms


Sample Test Case-3
input =this is good
2
ti sgohsi od

t   i         s    g   o
  h   s    i         o   d

Explanation:
ti sgohsi od (We have one space in row-1 and another space in row-2)
*/
import java.util.*;
class GroupRow1
{
    public static void PrintNS(String s,int k)
    {
        int n=0;
        StringBuilder sb[]=new StringBuilder[k];
        for(int i=0;i<k;i++){sb[i]=new StringBuilder("");}
        for(int i=0;i<s.length();i++)
        {
            if(n==(k-1)){n=0;}
            else{n++;}
            if(s.charAt(i)==' '){sb[n].append("+");}
            else
            {
                sb[n].append(String.valueOf(s.charAt(i)));
            }
        }
        for(int i=0;i<sb.length;i++)
            {
                for(int j=0;j<sb[i].length();j++)
                {
                    if(sb[i].charAt(j).equals(" ")){System.out.print("+");}
                    else{System.out.print(sb[i].charAt(j));}
                }
                System.out.println();
    }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s=sc.nextLine();
        int k=sc.nextInt();
        PrintNS(s,k);
        sc.close();
    }
}
