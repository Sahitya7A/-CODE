/*
Ramu is a given a group of numbers and a number('k) where he was asked to construct the array ans of size n-k+1 
where ans[i] is the number of distinct numbers in the subarray nums[i:i+k-1] = [nums[i], nums[i+1], ..., nums[i+k-1]] .

Return the array ans .

The first line of input consists of the group size followed by group numbers followed by a number 'k' 

Example 1:

input = 7
1 2 3 2 2 1 3
3
output = 3 2 2 2 3


Explanation: The number of distinct elements in each subarray goes as follows:
- nums[0:2] = [1,2,3] so ans[0] = 3
- nums[1:3] = [2,3,2] so ans[1] = 2
- nums[2:4] = [3,2,2] so ans[2] = 2
- nums[3:5] = [2,2,1] so ans[3] = 2
- nums[4:6] = [2,1,3] so ans[4] = 3



Example 2:

input = 7
1 1 1 1 2 3 4  
4
output = 1 2 3 4

Explanation: The number of distinct elements in each subarray goes as follows:
- nums[0:3] = [1,1,1,1] so ans[0] = 1
- nums[1:4] = [1,1,1,2] so ans[1] = 2
- nums[2:5] = [1,1,2,3] so ans[2] = 3
- nums[3:6] = [1,2,3,4] so ans[3] = 4
*/
import java.util.*;
class RamuKDup1
{
    public static ArrayList<Integer> a;
    public static void printArr(int k)
    {
        Set<Integer> ss=new HashSet<Integer>();
        for(int i=0;i<=a.size()-k;i++)
        {
            ss=new HashSet<>(a.subList(i,i+k));
            System.out.print(ss.size()+" ");
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        a=new ArrayList<Integer>();
        for(int i=0;i<n;i++)
        {a.add(sc.nextInt());}
        int k=sc.nextInt();
        printArr(k);
        sc.close();
    }
}