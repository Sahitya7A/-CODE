/*
There is a flatland filled with some blocks(of same size) in a grid structure.
The grid is represented as matrix, blocks[][], filled with 0's and 1's.
Where, 0-indicates empty place, 1-indiacted as block. 

You will be given the grid blocks[][],
Your task is to find the number of rectangular regions can be formed.

The rectangular region is formed in such a way that:
	- The region corners are filled with unique blocks.
	- and the region should be a rectangle.

Input Format:
-------------
Line-1: Two space separated integers R and C, size of the flatland.
Next R lines: C space separeted integers, 0's and 1's only.

Output Format:
--------------
Print an integers, number of rectangular regions.

Sample Input-1:
------------
4 4
1 0 1 0
0 1 0 1
0 0 1 0
1 1 0 1

Sample Output-1:
--------------
 1
 
Explanation: 
-------------
There is only one rectangle, with vertices grid[1][2], grid[1][4], grid[3][2], grid[3][4].
 

Sample Input-2:
---------------
4 4
1 1 1 0
1 1 0 1
1 0 1 1
0 1 1 1

Sample Output:
---------------
6

Explanation: 
------------
There are two 2x2 rectangles, two 2x4 and  two 3x3 rectangles.
 

Sample Input-3:
---------------
1 3
1 1 1

Sample Output-3:
-----------------
-1

Explanation: 
-------------
Rectangles must have four distinct corners.
 
 
 ==========TestCases=============
case =1
input =3 4
1 0 1 0
1 1 1 1
0 1 1 1
output =4

case =2
input =4 6
1 0 1 1 1 1
1 0 1 1 0 1
0 1 0 1 1 1
1 1 1 1 0 1
output =25

case =3
input =5 5
1 1 1 1 1
1 1 1 1 1
1 1 1 1 1
1 1 1 1 1
1 1 1 1 1
output =100

case =4
input =5 6
1 1 0 1 0 1
1 1 0 1 1 0
1 1 0 1 1 1
1 0 1 0 0 0
0 1 1 1 1 0
output =22

case =5
input =3 3
1 0 0 
0 1 0
0 0 1
output =0

case =6
input =3 2
1 1
0 1
1 1
output =1

case =7
input =4 4
1 0 0 1
0 1 1 0
0 1 1 0
1 0 0 1
output =2

case =8
input =7 9
1 1 1 0 1 1 0 1 1
1 1 0 1 1 0 1 0 1
1 0 1 1 0 1 0 1 0
0 1 1 1 1 0 1 0 1
1 0 1 1 1 1 0 1 1
1 1 0 1 1 0 1 0 1
1 1 1 0 1 1 0 1 1
output =165

case =9
input =6 7
1 1 1 0 1 1 0
1 1 0 1 1 0 1
1 0 1 1 0 1 0
0 1 1 1 1 0 1
1 0 1 1 1 1 0
1 1 0 1 1 0 1
output =58

case =10
input =5 6
1 1 1 1 0 0
1 1 1 0 0 1
1 1 0 0 1 1
1 0 0 1 1 1
0 0 1 1 1 1
output =18


 */
import java.util.*;

class RectangualRegions {
    public int countRectangualRegions(int[][] grid) {
        int m = grid.length, n = grid[0].length;
        int[][] dp = new int[n][n];
        int res = 0;
        for(int i = 0;i < m;i++) {
            for(int j = 0;j < n;j++) {
                if(grid[i][j] != 1) continue;
                for(int k = j+1;k < n;k++) {
                    if(grid[i][k] == 1) {
                        res += dp[j][k];
                        dp[j][k]++;
                    }
                }
            }
        }
        return res;
    }
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt();
		int n=sc.nextInt();
		int grid[][]=new int[m][n];
		for(int i=0;i<m;i++)
			for(int j=0;j<n;j++)
				grid[i][j]=sc.nextInt();
		System.out.println(new RectangualRegions().countRectangualRegions(grid));
	}
}