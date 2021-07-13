/*
Missing Words. 

Given two strings, one is a subsequence if all of the elements of the first string 
occur in the same order within the second string. They do not have to be contiguous in the 
second string, but order must be maintained. For example, given the string 
"i like cheese", the words "I" and "cheese" are one possible susequence of 
that string. 


In this challenge, you will be given two strings, s and t, where t is a subsequence of s, report the words of s,
missing in t(case sensitive), in the order ther are missing. 

Revisiting the earlier example, 
if s= I like cheese and t=like,
then like is the longest subsequence, and [I,cheese] is the list of missing words in order. 


input = I like cheese
like
output = I cheese


input = I am using HackerRank to improve programming
am HackerRank to improve
output = I using programming
*/
import java.util.*;
class Missing2
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        LinkedList<String> S=new LinkedList<>();
        for(String i : sc.nextLine().split(" "))
        {
            S.add(i);
        }
        for(String i : sc.nextLine().split(" "))
        {
            if(S.contains(i))
            {
                S.remove(i);
            }
        }
        for(String i:S)
        {
            System.out.print(i+" ");
        }
        
    }
}