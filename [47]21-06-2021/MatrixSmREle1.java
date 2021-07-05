/*
Program - 1

Given a matrix , return the smallest common element in all rows.

If there is no common element, return -1.

input =4
5
1 2 3 4 5
2 4 5 8 10
3 5 7 9 11
1 3 5 7 9
output =
5
*/
import java.util.*;
class MatrixSmREle1
{
    public static int commonEle()
    {
        Map<Integer,Integer> hm = new HashMap<Integer,Integer>();
        Scanner sc = new Scanner(System.in);
        int r=sc.nextInt();
        int c=sc.nextInt();
        int t;
        for(int i=0;i<c;i++)
        {
            t=sc.nextInt();
            hm.put(t,1);
            /*
            Need to check if all rows has a smallest common element
            if element is not in first row and present in other = no use[-1]
            thus put all first row elements in map and value as 1
            */
        }
        for(int i=0;i<r-1;i++)
        {
            for(int j=0;j<c;j++)
            {
                t=sc.nextInt();
                if(hm.containsKey(t))
                {
                    hm.put(t,hm.get(t)+1);
                }
                /*
                if the value in other rows is also present in 1st 
                row then increment by 1
                */
            }
        }
        for(Map.Entry<Integer,Integer> e : hm.entrySet())
        {
            if(e.getValue()==r){return e.getKey();}
            /*
            As map will be in sorted way so first element will be the
            minimum. 
            Check if the key's value is equal to the row size i.e if
            the element is present in all rows then return else repeat for
            */
        }
        /*
        There is no such element as common minimum element return -1
        */
        return -1;
    }
    public static void main(String[] args)
    {
        System.out.println(commonEle());
    }
}