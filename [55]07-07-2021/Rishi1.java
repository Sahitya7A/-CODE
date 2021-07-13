/*
Rishi is given a group of numbers(nums) which are >0 He has to print the count of pairs(i,j)
in the group which obeys the below rule
0 <= i < j < nums.length nums[i] + rev(nums[j]) == nums[j] + rev(nums[i])
Let us assume reverse(ele) as the reverse of the number 'ele' . For example, rev(123) = 321 , and rev(120) = 21 .

Example 1:
Input = 4
42 11 1 97
Output = 2
Explanation:
The two pairs are: - (0,3) : 42 + rev(97) = 42 + 79 = 121, 97 + rev(42) = 97 + 24 = 121.
                   - (1,2) : 11 + rev(1) = 11 + 1 = 12, 1 + rev(11) = 1 + 11 = 12.
*/
import java.util.*;
class Rishi1
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] a =new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println(printCount(a));
        sc.close();
        /*

        */
    };
    public static int printCount(int[] a)
    {
        int count=0;
        for(int i=0;i<a.length;i++)
        {
            for(int j=i+1;j<a.length;j++)
            {
                int i_rev=Reverse(a[i]);
                int j_rev=Reverse(a[j]);
                if( (a[i]+j_rev) == (a[j]+i_rev) )
                {
                    count++;
                }
            }
        }
        return count;
    }
    public static int Reverse(int a)
    {
        StringBuilder sb = new StringBuilder(String.valueOf(a));
        while(sb.charAt(sb.length()-1)=='0')
        {
            sb.deleteCharAt(sb.length()-1);
        }
        sb.reverse();
        int i=Integer.parseInt(String.valueOf(sb));
        return i;
    }
};/*
case = 1
input = 5
13 10 35 24 76
output = 4
 
 
case = 2
input = 4
42 11 1 97
output = 2
 
 
case = 3
input = 5
1 9 8 7 3
output = 10
 
case = 4
input = 8
17 87 65 34 23 98 12 98
output = 9*/

 
