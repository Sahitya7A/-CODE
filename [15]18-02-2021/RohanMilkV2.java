/*
Rohan is a  milk vendor.
He has only two aluminimum tins of capacity m and n litres..
Using these 2 aluminimum tins only, he can measure
He has to supply exactly P litres of milk to Sohan.

To measure the milk, following conditions should be followed
	- Fill one of the tins completely with milk.
	- Empty the other tin.
	- Pour milk from one tin into another tin till it fills completely,
	 or the first tin itself is empty.

Such that, at the end one or both tins contains P litres of the milk.

Please help Rohan, to check whether P litres of milk can be measured
using the two tins or not.

Input Format:
-------------
3 space separated integers, m, n and P.

Output Format:
--------------
Print a boolean value.


Sample Input-1:
---------------
3 5 4

Sample Output-1:
----------------
true


Sample Input-2:
---------------
2 4 5

Sample Output-2:
----------------
false


3L 5L
-----
0  5  - fill 5l
3  2  - fill 3l from 5l
0  2  - throw away 3l content
2  0  - fill 3l from 5l
2  5  - fill 5l
3  4  - fill 3l from 5l
*/
import java.util.*;
class RohanMilkV2
{
    public static m,n,p;
    public static boolean checkMeasure()
    {

        return false;
    }
    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
        m=sc.nextInt();
        n=sc.nextInt();
        p=sc.nextInt();
        System.out.println(checkMeasure());
        sc.close();
    }
}
