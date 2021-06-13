/*
Write a program to print the following pattern for any given odd integer 

if n is a even integer print -1

input = 3
output =
101
000
101

input = 5
output =
11011
11011
00000
11011
11011

input = 7
output =
1110111
1110111
1110111
0000000
1110111
1110111
1110111
*/
import java.util.*;
class Pattern1
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int s=(int) n/2;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(j==s || i==s)
                {
                    System.out.print("0");
                    continue;
                }
                System.out.print("1");
            }
            System.out.println();
        }
    }
}//75/100