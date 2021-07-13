/*
Arun is given an group of numbers which are in sorted order. 

Along with the group he is also given three numbers a,b,c 

He has to apply the the Standard Quadratic Function 
f(x)=ax^2 + bx + c to each number  in group , and return the new group in sorted order

The first line of input consists of group size followed by array elements followed by a,b,c values



Input = 4
-4 -2 2 4
1 3 5
Output = 3 9 15 33


Input = 4
-4 -2 2 4
-1 3 5
Output = -23 -5 1 7

*/
import java.util.*;
class Arun1
{
    public static List<Integer> a = new ArrayList<Integer>();
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            a.add(sc.nextInt());
        }
        int x=sc.nextInt(),y=sc.nextInt(),z=sc.nextInt();
        //System.out.println(a);
        calQF(x,y,z);
    }
    public static void calQF(int x,int y,int z)
    {
        for(int i=0;i<a.size();i++)
        {
            int temp=a.get(i);
            a.set(i,(int)(x*Math.pow(temp,2))+(y*temp)+z);
            //System.out.println((int)(x*Math.pow(temp,2))+(y*temp)+z);
        }
        Collections.sort(a);
        for(Integer i : a)
        {
            System.out.print(i+" ");
        }
    }
}