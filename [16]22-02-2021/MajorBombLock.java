/*Major Ajay Krishna and Prasad garu are working on a military operation at Himachal Pradesh. 

They are given an operation to defuse the bomb, and they have time falling short.

Their informer will provide them with a round-shape lock of length ‘L’, where L number of integers on the lock and a clue ‘C’.

To defuse the bomb they have to restore the original state of the lock, by restoring every integer on lock. 

All the integers must be restored in the same way based on the clue.


Its your task to help Major Ajay Krishna, to restore the original code on the lock, to defuse the bomb.

To restore the lock to its original state, you have to follow these instructions:
	- If C > 0, restore every i-th  number with the sum of the next C integers.
	- If C < 0, restore every i-th  number with the sum of the previous C integers.
	- If C == 0, restore every i-th  number with 0.
	
As the lock is in round shape, the next element of lock[n-1] is lock[0], and the previous element of lock[0] is lock[n-1].


Input Format:
-------------
Line-1: Two space separated integers L, C.
Line-2: L space separated integers, integers on the Lock.

Output Format:
--------------
Print the original state of the lock.


Sample Input-1:
---------------
5 2
2 5 9 4 7

Sample Output-1:
----------------
14 13 11 9 7


Sample Input-2:
---------------
5 0
1 5 6 3 2

Sample Output-2:
----------------
0 0 0 0 0

*/
import java.util.*;
class MajorBombLock
{
    static int L,c;
    static List<Integer> L_A=new ArrayList<>();
    static List<Integer> L_AN=new ArrayList<>();
    public static void printLock()
    {
        if(c>0)
        {
            forward();
        }
        else if(c<0)
        {
            backward();
        }
        else
        {
            for(int i=0;i<L;i++){
                System.out.print("0 ");
            }
        }
    }
    public static void forward()
    {
        for(int i=0;i<L;i++)
        {
            if((i+2)<L)
            {
                L_AN.add(L_A.get(i+1)+L_A.get(i+2));
            }
            else if((i+2)==L)
            {
                L_AN.add(L_A.get(i+1)+L_A.get(0));
            }
            else//>L
            {
                L_AN.add(L_A.get(0)+L_A.get(1));
            }
        }for(Integer i: L_AN){
        System.out.print(i+" ");
    }}
    public static void backward()
    {
        for(int i=0;i<L;i++)
        {
            if(i==0)
            {
                L_AN.add(L_A.get(L-1)+L_A.get(L-2));
            }
            else if(i==1)
            {
                L_AN.add(L_A.get(0)+L_A.get(L-1));
            }
            else
            {
                L_AN.add(L_A.get(i-1)+L_A.get(i-2));
            }
        }
        for(Integer i: L_AN){
        System.out.print(i+" ");
    }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        L=sc.nextInt();
        c=sc.nextInt();
        for(int i=0;i<L;i++)
        {
            L_A.add(sc.nextInt());
        }
        //System.out.print(L_A.toString());
        printLock();
        sc.close();
    }
}