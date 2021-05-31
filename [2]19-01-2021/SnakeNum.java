/*
Program-3
ramu is given a task to print the numbers n in vertical fashion in a snake model

input = 5
output =
1
2 9
3 8 10
4 7 11 14
5 6 12 13 15

input = 4
output =
1
2 7
3 6 8
4 5 9 10

back end test cases
case = 1
input = 1
output = 1

case = 2
input = 2
output = 
1
2 3

case = 3
input = 6
output =
1
2 11
3 10 12
4 9 13 18
5 8 14 17 19
6 7 15 16 20 21

case = 4
input = 9
output = 
1
2 17
3 16 18
4 15 19 30
5 14 20 29 31
6 13 21 28 32 39
7 12 22 27 33 38 40
8 11 23 26 34 37 41 44
9 10 24 25 35 36 42 43 45


case = 5
input = 12
output = 
1
2 23
3 22 24
4 21 25 42
5 20 26 41 43
6 19 27 40 44 57
7 18 28 39 45 56 58
8 17 29 38 46 55 59 68
9 16 30 37 47 54 60 67 69
10 15 31 36 48 53 61 66 70 75
11 14 32 35 49 52 62 65 71 74 76
12 13 33 34 50 51 63 64 72 73 77 78
*/
import java.util.*;
class SnakeNum
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int temp=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<=i;j++)
            {
                int a=0;
                for(int k=0;k<j;k++)
                {a+=(n-k);}
                if(j%2==0){
                    temp=a+i-j+1;
                    System.out.print(temp+" ");
                }
                else{
                    temp=a+n-i;
                    System.out.print(temp+" ");}
            }
            System.out.println();
        }
    }
}
/*
//2
import java.util.*;
class Test
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
for(int i=0;i<n;i++)
{
	for(int j=0;j<=i;j++)
	{
	if (j%2 == 0) 
		System.out.print(1+j*n-(j-1)*j/2+i-j+" ");
	else
		System.out.print(1+j*n-(j - 1)*j/2+n-1-i+ " ");
	}
System.out.println();
}
}
}
*/