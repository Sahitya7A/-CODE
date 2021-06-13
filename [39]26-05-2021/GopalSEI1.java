/*
Gopal is given the size of the group and 
he has also given some intresting facts about the group.

He has to change the group according to the given facts. 

In each fact[i] he will be given the [Si,Ei,I]

where Si is the Starting Index
Ei is the Ending Index
I in the Increment value 

Intially the group of the given size has all 0's 

you have to return the group after all facts are applied 

The first line of input contains the group size followed by k facts . 




Input = 5
3
1 3 2
2 4 3
0 2 -2
output = 
-2 0 3 5 3


Explanation :- 
Intially the group will be like following 
After applying each fact the group changes like below 
0 0 0 0 0 
0 2 2 2 0
0 2 5 5 3
-2 0 3 5 3



case = 1
input = 
10
4
1 3 4
8 9 11
1 9 -3
0 5 20
output = 20 21 21 21 17 17 -3 -3 8 8

case = 2
input = 1
1
0 1 10
output = 10

case = 3
input = 20
5
1 3 9
8 19 25
0 19 100
2 4 90
2 8 50
output = 100 109 249 249 240 150 150 150 175 125 125 125 125 125 125 125 125 125 125 125


case = 4
input = 25
10
1 9 2
2 2 4
1 3 8
0 4 -9
2 8 -7
1 8 10
2 9 -20
3 4 -5
2 9 100
8 9 1
output = -9 11 88 79 71 85 85 85 86 83 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0
*/
import java.util.*;
class GopalSEI1
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] a = new int[n];
        Arrays.fill(a,0);
        int m=sc.nextInt();
        int i=0;
        while(i!=m)
        {
            int s=sc.nextInt();
            int e=sc.nextInt();
            int t=sc.nextInt();
            for(int k=s;k<e+1;k++)
            {
                if(k<n){
                a[k]+=t;}
            }
            i++;
        }
        for(int k=0;k<n;k++){System.out.print(a[k]+" ");}
        sc.close();
    }
}
