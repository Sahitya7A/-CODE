/*
Given three integer arrays arr1, arr2 and arr3 sorted in strictly increasing order, 
return a sorted array of only the integers that appeared in all three arrays in increasing order

For any other Boundary Conditions Print -1 
Assume all the three input array contains positive elements 

The first line of input contains the first array elements followed by second array elements followed by third array elements 

input =
1 2 3 4 5 11 15
1 2 5 7 
1 3 4 5 8 20 45 55
output = 
1 5

Explanation: Only 1 and 5 appeared in the three arrays.


input = 
3 4 4 5 6 7
40 50 60 70 80 90
500 600
output = -1


input = 
1 1 1 2
1 1 
1 2 3 4 5
output = 1


*/
import java.util.*;
class IntArrSInc2
{
    public static ArrayList<Integer> a1=new ArrayList<>();
    public static ArrayList<Integer> a2=new ArrayList<>();
    public static ArrayList<Integer> a3=new ArrayList<>();
    public static Set<Integer> SF=new HashSet<>();
    public static boolean flag=false;
    public static void CommonValue(String[] s1,String[] s2,String[] s3)
    {
        populateList(s1,s2,s3);
        //for(String i:s1){System.out.println(i);}
        //DisplayList();
        int  mx=Math.max(s1.length,s2.length);
        mx=Math.max(mx,s3.length);
        if(s1.length >= s2.length && s1.length >= s3.length)
        {
            printCommonV(s1.length,a1,a2,a3);
        }
        else if(s2.length >= s1.length && s2.length >= s3.length)
        {
            printCommonV(s2.length,a2,a1,a3);
        }
        else
        {
            printCommonV(s3.length,a3,a1,a2);
        }
        for(Integer i : SF){System.out.print(i+" ");}
       // if(flag){System.out.println();}
        if(!flag){System.out.println("-1");}
    }
    public static void printCommonV(int len,ArrayList<Integer> toBeChecked,ArrayList<Integer> With1,ArrayList<Integer> With2)
    {
        for(Integer i : toBeChecked)
        {
            if(With1.contains(i) && With2.contains(i))
            {
                SF.add(i);
                flag=true;
            }
        }
    }
    public static void populateList(String[] s1,String[] s2,String[] s3)
    {
        for(String i:s1){a1.add(Integer.parseInt(i));}
        for(String i:s2){a2.add(Integer.parseInt(i));}
        for(String i:s3){a3.add(Integer.parseInt(i));}
    }
    public static void DisplayList(){System.out.println("a1"+a1+" a2"+a2+" a3"+a3);}
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        String s3=sc.nextLine();
        CommonValue(s1.split(" "),s2.split(" "),s3.split(" "));
        sc.close();
    }
}