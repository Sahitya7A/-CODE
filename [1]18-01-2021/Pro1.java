import java.util.*;
class Pro1
{
    public static int Find_sum(String s)
    {
        StringBuilder sb = new StringBuilder();
        int sum=0;
        for(int i=0;i<s.length();i++)
        {
            if(Character.isDigit(s.charAt(i)))
            {
                sb.append(s.charAt(i));
            }
            else
            {
                if(sb.length()!=0)
                {
                    sum+=Integer.parseInt(sb.toString());
                    sb=new StringBuilder();
                }
            }
        }sum+=Integer.parseInt(sb.toString());
        return sum;
    };
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String str=sc.next();
        System.out.println(Find_sum(str));
    };
};
