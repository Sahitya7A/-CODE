/*

Ramu is given group of numbers, Now he has to check if there exists (a,b,c) which follows the below


Rule 1 -->  0 < a, a + 1 < b, b + 1 < c < n - 1
Rule 2 --> The sum of subarrays (0, a - 1), (a + 1, b - 1), (b + 1, c - 1) and (c + 1, n - 1) is equal.

A subarray (l, r) represents a slice of the original array starting from the element indexed l to the element indexed r.

if it follows the above two rules print true else print false 

a>0
b>a+1
c>b+1
c<n-1
Example 1:

input = 1 2 1 2 1 2 1
output = true

Explanation: a = 1, b = 3, c = 5. 

sum(0, a - 1) = sum(0, 0) = 1
sum(a + 1, b - 1) = sum(2, 2) = 1
sum(b + 1, c - 1) = sum(4, 4) = 1
sum(c + 1, n - 1) = sum(6, 6) = 1


Example 2:

input = 1 2 1 2 1 2 1 2
output = false

case = 1
input = 6
1 2 1 2 1 1
output = false

case = 2
input = 10
1 2 3 2 3 2 1 2 3 1
output = false


case = 3
input = 7
11 12 11 12 11 12 11
output = true

case = 4
input = 8
11 12 11 12 11 12 11 8
output = false
*/
import java.util.*;
class RamuGroup2
{
    public static ArrayList<Integer> a;
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        a=new ArrayList<Integer>();
        for(String i: sc.nextLine().split(" ")){a.add(Integer.parseInt(i));}
        System.out.println(a);
    }
}