/*
Given a pattern and a string str, find if str follows the same pattern.

Here follow means a full match, such that there is a bijection between a letter in pattern and a non-empty word in str.

if str follows the same pattern print true else false

input =dog cat cat dog
abba
output = true

input =dog cat cat fish
abba
output = false

input =dog cat cat dog
aaaa
output = false

input =dog dog dog dog
abba
output = false

Notes
You may assume pattern contains only lowercase letters, and str contains lowercase letters that may be separated by a single space.
*/

import java.util.*;
class PatternString1
{
    public static boolean isTrue(String[] s1,String[] s2)
    {
        int count=0;
        Map<String,String> hm =new HashMap<>();
        for(int i=0;i<s1.length;i++)
        {
            if(!hm.containsKey(s1[i]))
            {//key is not present
                if(!hm.containsValue(s2[i]))
                {//value is not present
                    hm.put(s1[i],s2[i]);
                }
                else
                {//key is not present but value is present
                    return false;
                }
            }
            else
            {
                if(s2[i].equals(hm.get(s1[i])))
                {
                   // key and value present and have a match
                }
                else
                {//no match
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s1=sc.nextLine();
        String s2=sc.next();
        System.out.println(isTrue(s1.split(" "),s2.split("")));
        sc.close();
    }
}
