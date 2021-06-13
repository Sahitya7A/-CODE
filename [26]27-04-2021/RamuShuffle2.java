
Ramu is fond of playing with strings. He is given a string and some numbers 'n' ( 0<= n <strlength())

The string s will be shuffled such that the character at the ith position moves to indices[i] in the shuffled string.

Return the shuffled string.

 

Example 1:

Input: s = "codeleet", indices = [4,5,6,7,0,2,1,3]
Output: "leetcode"
Explanation: As shown, "codeleet" becomes "leetcode" after shuffling.

Example 2:

Input: s = "abc", indices = [0,1,2]
Output: "abc"
Explanation: After shuffling, each character remains in its position.

Example 3:

Input: s = "aiohn", indices = [3,1,4,2,0]
Output: "nihao"

case = 1
input = abcd
0 1 2 3
output = abcd

case = 2
input = abcdefghijklmnopqrstuvwxyz
25 24 23 22 21 20 19 18 17 16 15 14 13 12 11 10 9 8 7 6 5 4 3 2 1 0
output = zyxwvutsrqponmlkjihgfedcba


case = 3
input = aaiougrt
4 0 2 6 7 3 1 5
output = arigatou

case = 4
input = art
1 0 2
output = rat

import java.util.*;
class RamuShuffle2
{
    public static List<Integer> a=new ArrayList<>();
    public static void ShuffledString(String s)
    {
        if(Collections.max(a)>(s.length()-1)){System.out.println("-1");System.exit(0);}
        StringBuilder sb =new StringBuilder(s);
        for(int i=0;i<a.size();i++)
        {
            //System.out.println(a.get(i));
            /*codeleet", indices = [4,5,6,7,0,2,1,3]*/
            sb.setCharAt(a.get(i),s.charAt(i));
        }
        System.out.println(sb);
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s=sc.next();
        sc.nextLine();
        String[] ss=sc.nextLine().split(" ");
        //int a[]=new int[ss.length];
        for(int i=0;i<ss.length;i++)
        {a.add(Integer.parseInt(ss[i]));}
        ShuffledString(s);
        sc.close();
    }
}