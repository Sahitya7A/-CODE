/*Given two arrays of any length n find the missing elements from both the arrays

read the sizes of both the arrays from the user 

read in the following order

first read the size of first array 'n1'
read elements into first array

next read the size of second array 'n2'
read elements into second array 

now print the missing elements in both the arrays

Note :- if their are no missing elements print -1

sample input:
5
1 1 2 3 4
4
1 2 3 4
output:
-1

sample input:
5
1 2 3 4 4
5
1 2 3 5 5
output:
5
4

*/
import java.util.*;
class Test
{
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        Set<Integer> al1=new LinkedHashSet<>();
        Set<Integer> al2=new LinkedHashSet<>();
        Set<Integer> al3=new LinkedHashSet<>();
        for(int i=0;i<n1;i++)
        {
            al1.add(sc.nextInt());
        }
        int n2=sc.nextInt();
        for(int i=0;i<n2;i++)
        {
            al2.add(sc.nextInt());
        }
        al3.addAll(al1);
		System.out.println("al3 " + al3);
        al1.removeAll(al2);
		System.out.println("al1 " + al1);
        al2.removeAll(al3);
		System.out.println("al2 " + al2);

		System.out.println(al3);

        if(al1.size()==0 && al2.size()==0)
        {
            System.out.println(-1);
            System.exit(0);
        }
        if(al2.size()==0)
            System.out.println(-1);
        else
            for(int i:al2)
                System.out.println(i);
        if(al1.size()==0)
            System.out.println(-1);
        else
            for(int i:al1)
                System.out.println(i);
    }
}

/*
Test Cases:

case = 1
input =
5
1 1 1 1 1 
5
2 2 2 2 2
output =
2
1
case = 2
input =
5
1 1 1 2 3 
4
1 1 1 1 
output =
-1
2
3
case = 3
input =
5
1 2 3 4 5
5
6 7 8 9 10
output =
6
7
8
9
10
1
2
3
4
5
case = 4
input =
5
1 1 2 3 4
4
1 2 3 4
output =
-1
case = 5
input =
5
1 2 3 4 4
5
1 2 3 5 5
output =
5
4
*/