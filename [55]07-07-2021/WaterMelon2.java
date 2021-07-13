/*
There is a large table, and a shooter kept N watermelons on it.
Each watermelon is kept one after the other in the given X-axis positions.
The length of the watermelons may vary.

The shooter has a raffle gun, and it can blast any number of watermelons
into pieces with single shot in a straight line. After each gun shot,
you can remove the blasted watermelons

You will be given the positions of the watermelons on the large table melons[].
where melon[i] = [Xi, Xj], indicates the melon kept in the table between Xi and Xj
and watermelon length is Xj-Xi, and Xi<Xj.

Your task is to find the minimum number of gun shots,
required to blast all the watermelons into pieces.


Shooter stands opposite X axis lane and shoot the melons parallel to Y axis

Input Format:
-------------
Line-1: An integer N, number of watermelons.
Next N lines: Two space separated integers, Xi and Xj.

Output Format:
--------------
Print an integer result, number of gunshots required.

Sample Input-1:
---------------
5
5 8
4 10
6 11
10 14
11 16
Sample Output-1:
----------------
2

Sample Input-2:
---------------
5
1 3
5 7
8 10
6 9
11 13

Sample Output-2:
----------------
4

 
case =3
input =9
10 16
2 8
1 6
7 12
13 17
18 23
5 9
19 25
24 28
output =5
 
case =4
input =8
1 2
3 4
5 6
7 8
9 10
11 12
13 14
13 16
output =7
 
case =5
input =15
1 3
5 7
8 10
6 9
11 13
12 15
14 18
16 20
14 16
17 20
19 23
21 25
22 26
24 28
27 30
output =8
*/
import java.util.*;
class WaterMelon2
{
    public static Map<Integer,Integer> hm = new HashMap<Integer,Integer>();
    public static List<Integer> start=new LinkedList<Integer>();
    public static List<Integer> end=new LinkedList<Integer>();
    public static List<Integer> COUNT=new ArrayList<Integer>();
    public static int O=0,start_size=start.size();;
    /*
    This hashmap contains no of overlapping watermelon's at one point
    between min and max - inclusive
    */
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int s,e;
        int min=Integer.MAX_VALUE,max=Integer.MIN_VALUE;
        /*
        min contains the minimum value from start array i.e the start point of the number line
        max contains the maximum value from end array i.e the end point of number line
        here watermelon's lies within min and max values
        */
        for(int i=0;i<n;i++)
        {
            s=sc.nextInt();
            e=sc.nextInt();
            start.add(s);
            end.add(e);
            if(s<min){min=s;}
            if(e>max){max=e;}
        }
        System.out.println(printMinCost(min,max));
        sc.close();
    }
    public static int printMinCost(int min,int max)
    {
        int k=0;

        while(k!=start.size())
        {
            for(int i=start.get(k);i<=end.get(k);i++)
            {
                if(i>=min || i<=max)
                {
                    if(! hm.containsKey(i))
                    {
                        hm.put(i,1);
                    }
                    else
                    {
                        hm.put(i,hm.get(i)+1);
                    }
                }
            }
            k++;
        }
/*        k=0;
        while(k<=start_size)
        {
            k+=
        }*/findMap();
        //System.out.println(O);
        return O;
    }
    public static void findMap()
    {int q=0;
        while(q<=start_size){
        int mmax=Collections.max(hm.values());
        for(Map.Entry<Integer,Integer>  e : hm.entrySet())
        {
            if(e.getValue()==mmax)
            {
                O++;
                int startvalue=e.getKey();
                int index=0;
                int count=mmax;
                while(count>0 && index<start.size())
                {
                    if(start.get(index)<=startvalue && startvalue<=end.get(index))
                    {
                        count--;
                        decrementMap(start.get(index),end.get(index));
                        q++;
                        start.remove(index);
                        end.remove(index);
                    }
                    index++;
                }

            }

        }
        //System.out.println(q);
        }

        //return mmax;
    }
    public static void decrementMap(int i,int j)
    {
        while(i<=j)
        {
            hm.put(i,hm.get(i)-1);
            i++;
        }
       // System.out.println(hm);
    }
}
