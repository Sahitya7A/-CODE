/*
Ramu is given an group of numbers. 
He has to check if the group of numbers can be formed to be Dark or Not 


The group is called Dark if the sum of the odd-index and sum of the even-index 
numbers should be equal. 


To make the group Dark he has to do the following operations 


Now he to choose only one index(0-based) from the group of numbers and remove the number
we have to observe that after removing the number from the group , the index of the numbers changes


For example, if nums = [16,11,27,34,19] 

Choosing to remove index 1 results in nums = [16,27,34,19] .
Choosing to remove index 2 results in nums = [16,11,34,19] .
Choosing to remove index 4 results in nums = [16,11,27,34] .


Ramu has to print the number of indices he could choose so that after removal, numbers are Dark


Example 1:
Input = 4
2 1 6 4
Output = 1

Explanation:
Remove index 0: [1,6,4] -> Even sum: 1 + 4 = 5. Odd sum: 6. Not dark.
Remove index 1: [2,6,4] -> Even sum: 2 + 4 = 6. Odd sum: 6. dark.
Remove index 2: [2,1,4] -> Even sum: 2 + 4 = 6. Odd sum: 1. Not dark.
Remove index 3: [2,1,6] -> Even sum: 2 + 6 = 8. Odd sum: 1. Not dark.

There is 1 index that you can remove to make nums Dar.


Example 2:
Input = 3
1 1 1
Output = 3

Explanation: You can remove any index and the remaining array is dark.


Example 3:
Input = 3
1 2 3
Output = 0
Explanation: You cannot make a dark array after removing any index.



*/
import java.util.*;
class RamuDarkR1
{
    public static ArrayList<Integer> a;
    public static void printNI()
    {
        int count=0;int temp=0;boolean flag=true;
        ArrayList<Integer> as=new ArrayList<>(a);
        for(int i=0;i<a.size();i++)
        {
            temp=a.get(i);
            as.remove(i);
            //System.out.println(as);
            if(isDark(as)){count++;}
            as.add(i,temp);
            //System.out.println(as);
        }
        System.out.println(count);
    }
    public static boolean isDark(ArrayList<Integer> a)
    {
        int o=0,e=0;
        for(int i=0;i<a.size();i++)
        {
            if(i%2==0){e+=a.get(i);}
            else{o+=a.get(i);}
        }
        //System.out.println("odd="+o+" even="+e);
        if(e==o){return true;}
        return false;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        a=new ArrayList<Integer>();
        for(int i=0;i<n;i++)
        {
            a.add(sc.nextInt());
        }
        printNI();
        sc.close();
    }
}