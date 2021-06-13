/*

Cardano is a famous mathematician. working on numbers.
Given a number N, which is the product of all the digits of a number.
You need to find such smallest number S.

Your task is to help Mr Cardano to find smallest number S, 
where the product of all the digits of S should be equal to N.
If it is not possible to create S with in range of integer, print 0.


Input Format:
-------------
An integer N

Output Format:
--------------
Print an integer, smallest number S.


Sample Input-1:
---------------
36

Sample Output-1:
----------------
49


Sample Input-2:
---------------
147

Sample Output-2:
----------------
377


Sample Input-3:
---------------
22

Sample Output-3:
----------------
0

case =1
input =36
output =49

case =2
input =22
output =0

case =3
input =147
output =377

case =4
input =4096
output =8888
*/
import java.util.*;
class CardanoNum1
{
    public static int findS(int n)
    {
        Set<Integer> s = new HashSet<>();
        for(char c : String.valueOf(n).toCharArray())
            {s.add(Integer.parseInt(""+c));}
        if(s.size()==1){return 0;}
        int i=n+1;int pro=1;
        while(true)
        {
            for(char c : String.valueOf(i).toCharArray())
            {pro = pro * Integer.parseInt(""+c);}
            if(pro==n)
            {
                break;
            }
            i++;
            pro=1;
        }
        return i;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(findS(n));
        sc.close();
    }
}