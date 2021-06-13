/*
Given a sqaure matrix of 2-Dimensional array of n rows and n columns. 
Print this matrix in snake fashion starting from column n-1 
as shown in the figure below.


Sample Input:
3
1 2 3 
4 5 6
7 8 9

Sample Output: 
3 2 1 4 5 6 9 8 7

Explanation:

1<-2<-3 
|
4->5->6
      |
7<-8<-9

	1     2    3 
	00  01  02 
	4     5    6
	10  11   12
	7     8    9
	20   21   22



02 01 00  10 11 12 22 21 20*/
import java.util.*;
class SnakeFashion2
{
    public static void printMatrix(int[][] a)
    {
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[i].length;j++)
            {
                System.out.print(a[i][j]+" ");
            }
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[][] a = new int[n][n];
        for(int i=0;i<n;i++)
        {
            if((i+1)%2==0)//2row..
            {
                for(int k=0;k<n;k++)
                {
                    a[i][k]=sc.nextInt();
                }
            }
            else//1row...
            {
                for(int j=n-1;j>=0;j--)
                {
                    a[i][j]=sc.nextInt();
                }
            }
        }
        printMatrix(a);
    }
}