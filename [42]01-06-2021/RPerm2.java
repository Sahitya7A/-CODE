
/*
Ramu is given few characters 
Now his maths teacher taught the permutations and asked to print all possible permutations in alphabetical order 



input =
abc
output =
abc
acb
bac
bca
cab
cba

*/
import java.util.*;
class RPerm2
{
    public static HashMap<String,Integer> hs =new HashMap<String,Integer>();
    public static void printPerm(StringBuilder s)
    {
        StringBuilder sb =new StringBuilder(s);
        for(int i=0;i<s.length();i++)
        {
            sb=new StringBuilder(s);
            doFix(sb,i);
        }
        //System.out.println(hs);
        List<String> ss =new ArrayList<String>(new ArrayList<String>(hs.keySet()));
        Collections.sort(ss);
        //System.out.println(hs.keySet());
        for(String i : ss)
        {
            System.out.println(i);
        }
    }
    public static void doFix(StringBuilder s,int k)
    {
        char s1=s.charAt(0);
        char s2=s.charAt(k);
        //System.out.println(s1+" "+s2);
        s.replace(0,0+1,""+s2);
        s.replace(k,k+1,""+s1);
        //System.out.println(s);
        hs.put(String.valueOf(s),1);
        for(int i=0;i<s.length();i++)
        {
            for(int j=0;j<s.length();j++)
            {
                if(i!=k && j!=k && i!=j)
                {
                    //System.out.println("inside");
                    s1=s.charAt(i);
                    s2=s.charAt(j);
                    s.replace(i,i+1,""+s2);
                    s.replace(j,j+1,""+s1);
                    //System.out.println(s1+" "+s2);
                    if(!hs.containsKey(String.valueOf(s)))
                    {
                        hs.put(String.valueOf(s),1);
                    }
                    //System.out.println(s);
                }
            }
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        printPerm(new StringBuilder(s));
        sc.close();
    }
}//75/100