/*
Program-2

Scott is a sweet lover and eats sweets daily. His father is worried about his health 
and gives a task to Scott. If Scott solves the task then he is allowed to eat the sweets.

His task is as follows

Scott is given a word 'W'. Now he is supposed to see, the word is a Balanced Word or Not .

A word is said to be Balanced word if it contains all characters same number of times. 
He can also make the word Balanced by removing  only one occurence of a character at any index in the word. 

If he is able to do so print "true" else print "false"


Sample Test Case-1

input = xyz
output = true

This is Balanced because (x-1,y-1,z-1)

Sample Test Case-2

input = xyzz
output = true

This is Balanced because (x-1,y-1,z-2)
He can remove one occurence of z, It results in (x-1,y-1,z-1)

Sample Test Case-3

input = xxyyzzzz
output = false

This is not Balanced because (x-2,y-2,z-4)
By removing once occurence of z, It results in (x-2,y-2,z-3)
So this is not Balanced

Sample Test Case-4

input = xzxyzxz
output = true

This is Balanced because (x-3,y-1,z-3)
By removing once occurence of y, It results in (x-3,z-3)
So this is  Balanced


back end test cases
case = 1
input = abcdefghipabcdefghiabcdefghiabcdefghiabcdefghi
output = true

case = 2
input = cdebcdeba
output = true

case = 3
input = abcdefghhgfedecba
output = true

case = 4
input = abcdebcde
output = true

case = 5
input = aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaab
output = true

case = 6
input = aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaabc
output = false


*/
import java.util.*;
class SweetScott2{}
class  Test
{
String isBalanced(String s) 
{

if(s.isEmpty()) 
     return "false";

if(s.length() <= 3) 
      return "true";

int[] chCount = new int[26];

for(int i = 0; i < s.length(); i++)
chCount[s.charAt(i) - 97]++;

Arrays.sort(chCount);

int i;

for(i=0;chCount[i]==0;i++);

int minVal = chCount[i];   
int maxVal = chCount[25];

if(minVal == maxVal || maxVal - minVal == 1 && maxVal > chCount[24] ||  minVal == 1 && chCount[i+1] == maxVal)
	return "true";

return "false";
}
public static void main(String[] args) 
{
Scanner sc = new Scanner(System.in);
String word = sc.next();
System.out.println(new Test().isBalanced(word));
}
}



