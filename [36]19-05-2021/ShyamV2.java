/*
Shyam is given a group of N batteries with some voltages[], 
the voltage can be '+ve' or '-ve',
Shyam needs to setup a particular voltage V.

His task is to check if the sum of voltages of contiguous subset of batteries is equal to the required voltage V 
and the batteries in the subset should be maximum in count. 

If such subset is found print the count of batteries in it.
Otherwise, print 0.

Input Format:
-------------
Line-1 : Two integers N and V, number of batteries and required voltage.
Line-2 : N space separated integers, voltages of N batteries.

Output Format:
--------------
Print an integer, maximum count of batteries in a contiguous subset 
whose voltages sum is equal to V.


Sample Input-1:
---------------
5 3
2 -2 7 -4 3

Sample Output-1:
----------------
4

Explanation:
--------------
The sum of contiguous subset of batteries with volates: [2, -2, 7, -4] is equals 3.
and it is the maximum.

Sample Input-2:
---------------
4 2
-5 -3 5 3

Sample Output-2:
----------------
2

Explanation: 
------------
The sum of contiguous subset of batteries with volates: [-3, 5] is equals 2.
and it is the maximum.


case =1
input =5 3
2 -2 7 -4 3
output =4

case =2
input =4 2
-5 -3 5 3
output =2

case =3
input =10 17
-3 4 8 9 -4 -6 6 3 -2 -10
output =8

case =4
input =20 -12
-7 -7 -1 1 -1 9 1 -3 -9 -7 -2 -5 -1 -1 -6 2 -7 -3 -10 -1
output =9

*/
import java.util.*;
class ShyamV2
{
    public static ArrayList<Integer> a;
    public static int maxCount(int v)
    {
        int count=0;
        for(int i=0;i<a.size();i++)
        {
            for(int j=a.size();j>0;j--)
            {
                if(i<j)
                {
                    if(findSum(a.subList(i,j))==v){return (j-i);}
                }
            }
        }
        return count;
    }
    public static int findSum(List<Integer> a)
    {
        int sum=0;
        for(Integer i : a){sum+=i;}
        return sum;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int v=sc.nextInt();
        a=new ArrayList<Integer>();
        for(int i =0;i<n;i++)
        {a.add(sc.nextInt());}
        System.out.println(maxCount(v));
        sc.close();
    }
}