/*
 Given an array of strings, group anagrams together.

Example:

input = eat tea tan ate nat bat
output =
ate eat tea
nat tan
bat

*/
import java.util.*;
class GroupAnagram3
{
    public static void printG(String[] s)
    {
        Arrays.sort(s);
        for(String i:s){
i=String(Arrays.sort(i.toCharArray()));
System.out.println(i);}
    }
    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
        String s=sc.nextLine();
        String[] si=s.split(" ");
        printG(si);
        sc.close();
    }
}