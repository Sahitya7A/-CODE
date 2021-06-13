/*
Given an array of integers, find the most occurring element of the array and 
return any one of its indexes randomly with equal probability.

if no duplicate elements found print -1.
Examples:


input =15
-1 4 9 7 7 2 7 3 0 9 6 5 7 8 9
output =
3 4 6 12

  
Element with maximum frequency present at index 6
Element with maximum frequency present at Index 3
Element with maximum frequency present at index 4
Element with maximum frequency present at index 12

All outputs above have equal probability.print index increasing order.

For all boundary conditions print -1 
*/
import java.util.*;
class MostOccAEle1
{
    public static ArrayList<Integer> a;
    public static void printMostOElement()
    {
        ArrayList<Integer> sa=new ArrayList<>();
        for(int i=0;i<a.size();i++)
        {
            sa.add(Collections.frequency(a,a.get(i)));
        }
        int max=Collections.max(sa);
        if(max>1){
            a.clear();
            while(sa.contains(max)){
                a.add(sa.indexOf(max));
                sa.set(sa.indexOf(max),0);
            }
        for(Integer i:a){System.out.print(i+" ");}
    }
    else
        {System.out.println("-1");}
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        a = new ArrayList<>(n);
        for(int i=0;i<n;i++){a.add(sc.nextInt());}
        printMostOElement();
        sc.close();
    }
}