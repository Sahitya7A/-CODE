/*
Program - 1
Ramu is given a string s, Now he has to remove duplicate letters 
so that every letter appears once and only once.

He must make sure that the result produces should occur in the order given in string 

Example 1:

Input = bcabc
Output = bca

case = 1
input = ddccbbaa
output = dcba

case = 2
input = ddabbaac
output = dabc

case = 3
input = aaaabbbbccc
output = abc

case = 4
input = aaaccccbbbbdddaaaa
output = acbd

case = 5
input = abbccaaazzzeeekkkk
output = abczek
*/
import java.util.*;
class Ramu1
{
    public static StringBuilder noDup(String[] s)
    {
        LinkedHashSet<String> a=new LinkedHashSet<>();
        StringBuilder sb = new StringBuilder();
        for(String i : s){a.add(i);}
        for(String i : a){sb.append(i);}
        //System.out.println(a);
        return sb;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String[] s=sc.next().split("");
        System.out.println(noDup(s));
        sc.close();
    }
}