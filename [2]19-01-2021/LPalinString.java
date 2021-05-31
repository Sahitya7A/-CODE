/*
Given a string s, return the longest substring in S,
which is a palindrome

for example:
input =abbbabbcbbacdb
output =abbcbba

input =thedivideriswide
output = edivide

case =1
input =malayalam
output =malayalam

case =2
input =forgeeksskeegfor
output =geeksskeeg

case =3
input =abbbabbcbbacdb
output =abbcbba

case =4
input =thedivideriswide
output =edivide

case = 5
input =lirilmalayalam
output =malayalam
*/

import java.util.*;
class LPalinString
{
    public static StringBuilder LPalin(String str)
    {
        StringBuilder sb = new StringBuilder(str);
        StringBuilder sb1 = new StringBuilder();
        List<StringBuilder> a=new ArrayList<>();
        sb1=new StringBuilder(sb.subSequence(0,str.length()));
        int max=0;
        if(String.valueOf(sb1).equals(String.valueOf(sb1.reverse())))
        {
            max=sb1.length();
            a.add(sb1);
        }
        for(int i=str.length();i>=0;i--)
        {
            for(int j=1;j<str.length()-1;j++)
            {
                if(i>j)
                {
                  sb1=new StringBuilder(sb.subSequence(j,i));
                  if(String.valueOf(sb1).equals(String.valueOf(sb1.reverse())) && sb1.length()>max)
                  {
                      a.add(sb1);
                      max=sb1.length();
                  }
                }
            }
        }
        //System.out.println(a);
        int index=0;
        max=0;
        for(StringBuilder i : a)
        {
            if(i.length()>max){max=i.length();index=a.indexOf(i);}
        }

        return a.get(index);
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s=sc.next();
        System.out.println(LPalin(s));
    }
}
/*
//second
import java.util.*;

class LPS {
    public String longestPalindrome(String s) {
		if (s == null || s.length() < 1) return "";
		int start = 0, end = 0;
		for (int i = 0; i < s.length(); i++) {
			int len1 = expandAroundCenter(s, i, i);
			int len2 = expandAroundCenter(s, i, i + 1);
			int len = Math.max(len1, len2);
			if (len > end - start) {
				start = i - (len - 1) / 2;
				end = i + len / 2;
			}
		}
		return s.substring(start, end + 1);
	}

	private int expandAroundCenter(String s, int left, int right) {
		int L = left, R = right;
		while (L >= 0 && R < s.length() && s.charAt(L) == s.charAt(R)) {
			L--;
			R++;
		}
		return R - L - 1;
	}

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		System.out.println(new LPS().longestPalindrome(s));
	}
}
*/