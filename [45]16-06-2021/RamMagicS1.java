import java.util.*;
class RamMagicS1
{
    public static int oneSum(int n)
    {
        StringBuilder sb = new StringBuilder("1221121221221121122");
        StringBuilder sb2 = new StringBuilder("12211212212211211221211212211211212212212");
        System.out.println(sb2.substring(0,n));
        sb =  new StringBuilder(sb2.substring(0,n));
        int count=0;
        while(String.valueOf(sb).contains("1"))
        {
            count++;
            System.out.println(count);
            sb.deleteCharAt(sb.indexOf("1"));
System.out.println(sb);
        }
        return count;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(oneSum(n));
        sc.close();
    }
}
/*

Ramu is given a magical string which consits of only (1/2). 

A magical string S consists of only '1' and '2' and obeys the following rules:

The string S is magical because concatenating the number of contiguous occurrences of characters '1' and '2' generates the string S itself.
The first few elements of string S is the following: S = "1221121221221121122......"
                                                                              1 2 11 2 1 22 11
If we group the consecutive '1's and '2's in S, it will be:
1 22 11 2 1 22 1 22 11 2 11 22 ......

and the occurrences of '1's or '2's in each group are:
1 2 2 1 1 2 1 2 2 1 2 2 ......
                        1 1 2 1 1 2 2
You can see that the occurrence sequence above is the S itself.

Ramu is given an integer N as input and he has to return the number of '1's in the first N number in the magical string S.

Example 1:

Input = 6
Output = 3

Explanation: The first 6 elements of magical string S is "12211" and it contains three 1's, so return 3.


/*
A magical string S consists of only '1' and '2' and obeys the following rules:
The string S is magical because concatenating the number of contiguous occurrences of characters '1' and '2' generates the string S itself.
The first few elements of string S is the following: S = "1221121221221121122……"
If we group the consecutive '1's and '2's in S, it will be:
1 22 11 2 1 22 1 22 11 2 11 22 ......
and the occurrences of '1's or '2's in each group are:
1 2 2 1 1 2 1 2 2 1 2 2 ......
You can see that the occurrence sequence above is the S itself.
Given an integer N as input, return the number of '1's in the first N number in the magical string S.
Note: N will not exceed 100,000.
Example 1:
Input: 6
Output: 3
Explanation: The first 6 elements of magical string S is "12211" and it contains three 1's, so return 3.
 */

/**
 * Approach: Mathematics + Two Pointers
 * 1. Create an int array a and initialize the first 3 elements with 1, 2, 2.
 * 2. Create two pointers head and tail. head points to the number which will be used to generate new numbers.
 * tail points to the next empty position to put the new number. Then keep generating new numbers until tail >= n.
 * 3. Need to create the array 1 element more than n to avoid overflow because the last round head might points to a number 2.
 * 4. A trick to flip number back and forth between 1 and 2: num = num ^ 3
 *
 * Reference:
 *  http://www.cnblogs.com/grandyang/p/6286540.html
 */
class Solution {
    public int magicalString(int n) {
        if (n <= 0) {
            return 0;
        }
        if (n <= 3) {
            return 1;
        }

        int[] arr = new int[n + 1];
        arr[0] = 1; arr[1] = 2; arr[2] = 2;
        int head = 2, tail = 3, num = 1, result = 1;

        while (tail < n) {
            for (int i = 0; i < arr[head]; i++) {
                arr[tail] = num;
                if (num == 1 && tail < n) {
                    result++;
                }
                tail++;
            }
            num = num ^ 3;
            head++;
        }

        return result;
    }
}