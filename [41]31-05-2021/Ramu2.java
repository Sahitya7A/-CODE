/*
Program-2

Ramu is given a string and asked to find sum of load of all of its substrings.


The load of a string is the difference in frequencies between the most frequent and least frequent characters.
For example, the load of "abaacc" is 3 - 1 = 2 .


Input: s = "aabcb"
Output: 5
Explanation: The substrings with non-zero loads are ["aab","aabc","aabcb","abcb","bcb"], each with load equal to 1.


Example 2:
Input: s = "aabcbaa"
Output: 17


If no load exists print 0

case = 1
input = aabbcddeffgghhiikkll
output = 153

case = 2
input = abcdef
output = 0


case = 3
input = aabbccddeeffgghhii
output = 100

case = 4
input = aab
output = 1
*/
import java.util.*;
class Ramu2
{
    public static int count=0;
    public static int sumLoad(String s)
    {
        for(int i=0;i<s.length();i++)
        {
            //System.out.println("Building map for"+s.substring(i,s.length()));
            buildHashMap(s.substring(i,s.length()));
        }
        return count;
    }
    public static void buildHashMap(String s)
    {
        HashMap<Character,Integer> hm = new HashMap<Character,Integer>();
        for(int i=0;i<s.length();i++)
        {
            if(hm.containsKey(s.charAt(i)))
            {
                hm.put(s.charAt(i),hm.get(s.charAt(i))+1);
            }
            else
            {
                hm.put(s.charAt(i),1);
            }
        }
        //System.out.println("The Map"+hm);
        //System.out.println(Collections.max(hm.values()));
        //find the complete string HashMap and then reduce the string ad finally find load
        //below is load of complete string
        //System.out.println("Complete String :"+s);
        //System.out.println("Max"+Collections.max(hm.values()));
           // System.out.print("Min"+Collections.min(hm.values()));
           // System.out.println("="+count);
        count+=(Collections.max(hm.values())-Collections.min(hm.values()));
        for(int i=s.length()-1;i>=0;i--)
        {
            try
            {
               if(hm.get(s.charAt(i))-1 ==0 )//remove the character which has no occurance else problem arises in min fun
              {
                hm.remove(s.charAt(i));
               }
            else
              {
                hm.put(s.charAt(i),hm.get(s.charAt(i))-1);
               }
          //  System.out.println("Max"+Collections.max(hm.values()));
         //   System.out.print("Min"+Collections.min(hm.values()));
            count+=(Collections.max(hm.values())-Collections.min(hm.values()));
         //   System.out.println("="+count);  
            }
           catch(Exception e){}
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s=sc.next();
        System.out.println(sumLoad(s));
        sc.close();
    }
}