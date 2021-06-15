/*
Program - 2
Ramu is given an array of numbers now he has to check for a super square matrix in the given array.

A super square matrix is a matrix such that every row sum, every column sum, and both
diagonal sums are all equal. 

The integers in the magic square do not have to be distinct. 
Every 1 x 1 grid is trivially a super square matrix 

Given an m x n integer grid , return the size (i.e., the side length k ) of the largest super square matrix that can be found
within this grid.



Example 1:

Input = 
4 5
7 1 4 5 6
2 5 1 6 4
1 5 4 3 2
1 2 7 3 4
Output: 3

Explanation: 

From the above array we have the following super square matrix of size 3 
5 1 6 
5 4 3
2 7 3 



The largest super square matrix has a size of 3.
Every row sum, column sum, and diagonal sum of this magic square is equal to 12.
- Row sums: 5+1+6 = 5+4+3 = 2+7+3 = 12
- Column sums: 5+5+2 = 1+4+7 = 6+3+3 = 12
- Diagonal sums: 5+4+3 = 6+4+2 = 12

case = 1
input = 4 4
2 2 2 2
1 1 1 1
2 2 2 2
1 1 1 1
output = 1

case = 2
input = 5 4
1 2 3 4
2 1 3 4
4 4 4 4
4 4 4 4
4 4 4 4
output = 3


case = 3
input = 5 5
1 2 3 4 5
8 0 0 0 0
2 0 5 1 6
2 0 5 4 3
2 0 2 7 3 
output = 3

case = 4
input =
3 3
1 2 4
8 5 5
8 5 5
output = 2

*/
import java.util.*;
class RamSuperM2
{
    public static Set<Integer> hs = new HashSet<>();
    public static int calSuperM(int[][] a,int r,int c)
    {
        int k=r,rm=0;
        for(int i=k;i>1;i--)
        {
            int cm=0;
            while(cm+i-1 <= r)
            {
               // System.out.println("k="+i+" rm="+rm);
                if(isSuper(a,rm,cm,i))
                {
                    return i;
                }
                cm++;
            }
            rm++;
        }
        return 1;
        /*
        for k value we can get matrix other than starting form 1st column
        rm - same row different possible matrices
        at the same time cm increments from 0 for every rm value
        */
    }
    public static boolean isSuper(int[][] a,int rm,int cm,int k)
    {
        try{
        int odiag=0;
        int rdiag=0;
        for(int i=rm,u=cm,x=0;i<(rm+k) && u<(cm+k) && x<k;i++,u++,x++)
        {
            int row_sum=0;
            int col_sum=0;
            for(int j=cm,v=rm,y=0;j<(cm+k) && v<(rm+k) && y<k;j++,v++,y++)
            {
                row_sum+=a[i][j];
                col_sum+=a[v][u];
                if(x==y)//First diagonal
                {odiag+=a[i][j];}
                if(x+y==(k-1))//second diagonal
                {rdiag+=a[i][j];}
            }
            hs.add(row_sum);
            hs.add(col_sum);
        }
        hs.add(odiag);
        hs.add(rdiag);
        if(hs.size()==1)
        {
            return true;
        }}catch(Exception e){
            //System.out.println("PROBLEM");
        }
        hs.clear();
        return false;
        /*
        i and j values to calculate the sum of all rows
        u and v values to calculate the sum of all columns
        ( u and v are reversed to get the columns as a[v][u])
        x and y values to calculate the sum of both the diagonals
        first diagonal - row and column index same
        second diagonal - sum of row index and column index is equal to (size of matrix - 1)
        Adding all sums to Set if all sum's are equal the set size will be 1 else > 1
        */
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int r=sc.nextInt();
        int c=sc.nextInt();
        int[][] matrix = new int[r][c];
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                matrix[i][j]=sc.nextInt();
            }
        }
        System.out.println(calSuperM(matrix,r,c));
        sc.close();
    }
}