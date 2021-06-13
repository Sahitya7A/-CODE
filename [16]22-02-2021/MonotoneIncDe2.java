/*
 * 
 * 
write a java program to return true if  the given array is monotone increasing array or monotone decreasing array.

An array is monotone increasing array if for all i<=j ,a[i]<=a[j]
An array is monotone decreasing array if for all i<=j ,a[i]>=a[j]

return true if and only if the given array A is monotonic.

Sample Input:
1 2 2 3

Sample Output:
true

Sample Input:
1 3 2

Sample Output:
false

 * 
 */
import java.util.*;
class MonotoneIncDe2
{
    public static boolean ISm(String[] s)
    {
        int I=0,D=0,inc=1;
            for(int i=0;i<s.length-1;i++)
            {
                if(Integer.parseInt(s[i])<=Integer.parseInt(s[i+1])){I++;}
                else{inc=2;}
                if(Integer.parseInt(s[i])>=Integer.parseInt(s[i+1])){D++;}
                else{inc=2;}
            }
            if(I==s.length-1 || D==s.length-1){return true;}
            return false;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String[] si=s.split(" ");
        System.out.println(ISm(si));
        sc.close();
    }
}