/*
Given two strings, one is a subsequence if all of the elements of the first string occur in the same order within the second string. 

They do not have to be contiguous of the second string, but order must be maintained. For example, given the string "i like cheese". the words 
"i" and "cheese" are one possible subsequence of that string. 


In this challenge, you will be given two strings s and t where t is a subsequence of s, report the words of s, missing in t(case sensitive), in the order they are missing the earlier

example, if s = i like cheese and t = like, then like is the longest subsequence and [i,cheese] is the list of missing 
words in order. 


Function Description 
Complete the function missingWords in the editor below. It must return an array of strings containing any words in s that are missing  from t  in the order they occur

missingWords has the following parameters 
s- a sentence of space separated words
t- a senetence of space seprarated words 


Constraints 
Strings s and t consist of English alphabteic letters (i.e., a-z and A-Z) and spaces only. 
1 <= [t] <= [s] <= 10^6
1 <= length of any word in s or t <=15
It is guranteed that string t is a subsequence of string s.


Input
I am using HackerRank to improve programming 
am HackerRank to improve 
Output 
I
using 
programming

Explanation -
1.I
2. using
3. programming 
We add these words in order to the array ["I","using","programming"] , then return this array as our answer. 



back end test cases

case = 1
input =I am using HackerRank to improve programming 
am HackerRank to improve 
output =
I
using 
programming


case = 2
input =I love programming
programming
output =
I
love



case = 3
input =keshav memorial institute of technology
keshav of 
output = 
memorial
institute 
technology


case = 4
input =hello world 
hello
output =
world

*/

import java.util.*;
class Program1 
{

public static String[] missingWords(String s, String t) {

	String[] parts = s.split(" ");
	String[] otherparts = t.split(" ");

	List<String> missing = new ArrayList<>();
	for (int i = 0, j = 0; i < parts.length; i++)
	{
		if (j < otherparts.length && parts[i].equals(otherparts[j]))
		{
		  j++;
		}
		else
		{
		  missing.add(parts[i]);
		}
	}
	String[] arr = missing.toArray(new String[0]);
	return arr;
}


 public static void main(String [] args) 
	    {
	 Scanner sc=new Scanner(System.in);

		  String t = sc.nextLine();
		  String s = sc.nextLine();
		  String[] str = missingWords(t,s);
		  for(int i=0;i<str.length;i++)
			  System.out.println(str[i]);
		  
	    }
	
}
