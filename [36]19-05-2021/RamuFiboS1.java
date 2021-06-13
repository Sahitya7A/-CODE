/*
Ramu is working on Strings consist of digits only. 
He wants to findout, whether the given string can form Fibonacci sequence or not.

A String can form a Fibonacci Sequence, if it contains at least three numbers,
and numbers are in the following order:
first, second, third  = first + second, fourth = third + second, .. so on.

Return true, if the given string can form fibonacci sequence,
otherwise, return false.

Note: Numbers in the fibonacci sequence contains no leading 0's.
for example, 2, 03,5 or 2,3,05 or 02,3,5 are not valid.


Sample Input-1:
---------------
23581321

Sample Output-1:
----------------
true

Explanation: 
------------
Fibonacci Sequence is : 2, 3, 5, 8, 13, 21
2, 3, 2+3=5, 3+5=8, 5+8=13, 8+13=21.

Sample Input-2:
---------------
199100199

Sample Output-2:
----------------
true

Explanation: 
------------
Fibonacci Sequence is : 1 99 100 199
1, 99, 1+99=100, 99+100=199.


case =1
input =101102203305508813
output =true

case =2
input =1011022033055
output =false

case =3
input =123456789
output =false

case =4
input =11111122233355588
output =true


*/
import java.util.*;
class RamuFiboS1
{
    public static boolean fiboSeq(String s)
    {
        for(int i=0;i<s.length();i++)
        {
            System.out.println(s.charAt(i));
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(fiboSeq(s));
        sc.close();
    }
}