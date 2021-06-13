/*
There is a road in a hill area, the road is flat in some places and slope 
in some places (only upwards). There are N lamp posts are fixed on one side 
of the road. The lights on the lamp posts are arranged in horizontal line, 
for making this arrangement, the lamp post are made with different heights.

You will be given the heights of the lamp posts from top of the hill to 
the bottom of the hill. And you will be given an height H, your task is to find 
the starting and ending position of the lamp posts with height H. 
If there is no such lamp post with height H, return [-1, -1].

Complete your code with O(log n) runtime complexity.

Input Format:
-------------
Line-1 -> Two space separated integers N and H, number of lamp posts and height H.
Line-2 -> N space separated integers, heights of the lamp posts.

Output Format:
--------------
Print two integers set, starting and ending positions of the lamp posts with height H.


Sample Input-1:
---------------
10 5
2 3 3 5 5 5 8 9 9 9

Sample Output-1:
----------------
[3, 5]


Sample Input-2:
---------------
10 6
2 3 3 5 5 5 8 9 9 9

Sample Output-2:
----------------
[-1, -1]

case =1
input =10 5
2 3 3 5 5 5 8 9 9 9
output =[3, 5]

case =2
input =10 6
2 3 3 5 5 5 8 9 9 9
output =[-1, -1]

case =3
input =
95 11
3 4 4 4 4 4 4 4 5 5 5 5 5 5 5 5 7 7 7 7 7 7 7 9 9 9 9 9 9 9 9 9 10 10 10 10 10 11 12 12 12 12 12 12 12 12 12 12 13 13 13 13 13 13 13 13 13 13 13 13 13 13 13 13 14 14 14 14 14 14 14 14 14 15 15 15 15 15 15 15 15 15 15 15 15 15 15 15 15 15 16 16 16 16 16
output =[37, 37]

case =4
input =
100 16
3 4 4 4 4 4 4 4 5 5 5 5 5 5 5 5 7 7 7 7 7 7 7 9 9 9 9 9 9 9 9 9 10 10 10 10 10 11 12 12 12 12 12 12 12 12 12 12 13 13 13 13 13 13 13 13 13 13 13 13 13 13 13 13 14 14 14 14 14 14 14 14 14 15 15 15 15 15 15 15 15 15 15 15 15 15 15 15 15 15 16 16 16 16 16 16 16 16 16 16
output =[90, 99]
*/
import java.util.*;
class HillyRoad3
{
    public static ArrayList<Integer> a = new ArrayList<>();
    public static void printLampPos(int H)
    {
        int start=-1,etemp=-1;
        if(a.size()>0)
        {
        int stemp=a.get(0);
        start=stemp;
        int count=0,tcount=0;
        for(int i=1;i<a.size();i++)
        {
            if((stemp+1)==a.get(i)){stemp++;etemp=a.get(i);tcount++;}
            //else{start=stemp;stemp=a.get(i);}
        }
        if(a.size()==1){etemp=start;}
        }
        System.out.println("["+start+", "+etemp+"]");
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int H=sc.nextInt();
        int[] lamph= new int[n];
        for(int i=0;i<n;i++)
        {
            lamph[i]=sc.nextInt();
            if(lamph[i]==H){a.add(i);}
        }
        printLampPos(H);
        sc.close();
    }
}