You are given a string allowed consisting of distinct characters and an array of strings words.

A string is consistent if all characters in the string appear in the string allowed.

Return the number of consistent strings in the array words.

If it not appears then print 0

Example 1:

Input: allowed = "ab", words = ["ad","bd","aaab","baa","badab"]
Output: 2
Explanation: Strings "aaab" and "baa" are consistent since they only contain characters 'a' and 'b'.

Example 2:

Input: allowed = "abc", words = ["a","b","c","ab","ac","bc","abc"]
Output: 7
Explanation: All strings are consistent.

The first line of input contains the array of words followed by "allowed" word  

/*
 case = 1
input =cc acd b ba bac bad ac d
cad
output = 4

case = 2
input =ad bd aaab baa badab
ab
output = 2

case = 3
input =a b c ab ac bc abc 
abc
output = 7

case = 4
input =abcd bcd abc bde
abzx
output = 0
*/


import java.util.*;
class WordAllowS3
{
    public static List<Character> c=new ArrayList<>();
    public static int howManyAllowed(String[] word)
    {
        int count=0,in_count=0;
        for(int i=0;i<word.length;i++)
        {
            in_count=0;
            for(int j=0;j<word[i].length();j++)
            {
                if(c.contains(word[i].charAt(j))){in_count++;}
            }
            if(in_count==word[i].length()){count++;}
        }
        return count;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String[] words=sc.nextLine().split(" ");
        String allowed=sc.next();
        for(char i:allowed.toCharArray()){c.add(i);}
        System.out.println(howManyAllowed(words));
        sc.close();
    }
}