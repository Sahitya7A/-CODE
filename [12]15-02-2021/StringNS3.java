/*

Given a number in string format, print the nth smallest number if exists 
else print -1 


input = 47912478
3
output = 4

in the above test case we have 4 as the third smallest number.

input = 1111
2
output = -1

in the above test case we dont have any second smallest number so output is -1


input = 100
1
output = 0

in the above test case we have 0 as the first smallest number so the output is 0 



*/import java.util.*;
class StringNS3
{
    public static void printKSmall(int[] a,int k)
    {
        Set<Integer> s=new HashSet<>();
        for(int i=0;i<a.length;i++)
        {
            s.add(a[i]);
        }
        List<Integer> sl=new ArrayList<>(s);
        Collections.sort(sl);
        int val;
        //System.out.println(sl);
        try
        {
            val=sl.get(k-1);
            System.out.println(val);
        }
        catch(Exception e){System.out.println("-1");}
    }
    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
        String s =sc.next();
        int[] a=new int[s.length()];
        int k=sc.nextInt();
        int ind=0;
        for(String i:s.split(""))
        {a[ind]=Integer.parseInt(i);ind++;}
        printKSmall(a,k);
        sc.close();
    }
}