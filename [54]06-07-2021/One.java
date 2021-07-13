/*
Hemanth is working with numbers,
He is given a list of N numbers.

He need to choose a pair(P,Q) of numbers and them to binary numbers.
And count the number of bits to be converted in P to make P = Q.

Your task is to find the total sum of count of bits to be converted in
all the pairs of the list of numbers.

Input Format:
-------------
Line-1: An integer, N number of values.
Line-2: N space separated integers, positive numbers.

Output Format:
--------------
Print an integer value.


Sample Input-1:
---------------
3
2 13 5

Sample Output-1:
----------------
8

Explanation:
------------
Given list of numbers: [2, 13, 5]
Binary numbers are as follows: 0010, 1101, 0101

The Total sum is:   countOfConversion(2, 13) +
                    countOfConversion(13, 5) +
                    countOfConversion(5, 2) = 4 + 1 + 3 = 8.


Sample Input-2:
---------------
4
6 14 17 11

Sample Output-2:
----------------
18

Explanation:
------------
Given list of numbers: [6, 14, 17, 11]
Binary numbers are as follows: 00110, 01110, 10001, 01011

The Total sum is:   countOfConversion(6, 14) +
                    countOfConversion(6, 17) +
                    countOfConversion(6, 11) +
                    countOfConversion(14, 17) +
                    countOfConversion(14, 11) +
                    countOfConversion(17, 11) = 1 + 4 + 3 + 5 + 2 + 3 = 18
                    */
import java.util.*;
class One
{
    public static List<StringBuilder> sbl=new ArrayList<StringBuilder>();
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println(printC(a));
        sc.close();
    };
    public static int printC(int[] a)
    {
        int count=0;
        calculateBitS(a);
        for(int i=0;i<a.length;i++)
        {
            for(int j=i+1;j<a.length;j++)
            {
                count+=compare(i,j);
                //System.out.println(count);
            }
        }
        return count;
    }
    public static void calculateBitS(int[] a)
    {
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<a.length;i++)
        {
            int n=a[i];
            while(n>0)
            {
                sb.append(""+n%2);
                n=n/2;
            }
            sbl.add(sb);
            //System.out.println(sbl);
            sb=new StringBuilder();
        }
        int n_max=0;
        for(StringBuilder sbk : sbl)
        {
            if(sbk.length()>n_max){n_max=sbk.length();}
        }
        //System.out.println(n_max);
        for(StringBuilder sbk : sbl)
        {
            //System.out.println(n_max-sbk.length());
            if(sbk.length()<n_max)
            {
                /*for(int i=0;i<n_max-sbk.length();i++)
                {
                    sbk.append("-");
                }*/
                int k=n_max-sbk.length();
                while(k>0)
                {
                    sbk.append("0");
                    k--;
                }
            }
            sbk.reverse();
        }
        //System.out.println(sbl);
    }
    public static int compare(int i,int j)
    {
        StringBuilder sb1=sbl.get(i);
        StringBuilder sb2=sbl.get(j);
        int c=0;
        for(int k=0;k<sb1.length();k++)
        {
            if(sb1.charAt(k)!=sb2.charAt(k)){c++;}
        }
        return c;
    }
};
