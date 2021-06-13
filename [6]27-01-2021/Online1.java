import java.util.*;
class Online1
{
    public static int calPrice(String st,int[] cost)
    {
        Map<Character,Integer> h=new HashMap<>();
        Character a[]=new Character[st.length()];
        for(int i=0;i<st.length();i++){a[i]=st.charAt(i);}
        //=s1.split("");
        Set<Character> s=new HashSet<Character>(Arrays.asList(a));
        System.out.println(s);
        int sum=0;
        for(Character i : s)
        {
            h.put(i,Collections.frequency(Arrays.asList(a),i));
        }
        //System.out.println((int)'A');
        //System.out.println((char)(65+3));
        //for()
        for(Map.Entry<Character,Integer> i : h.entrySet())
        {
            int f2=cost[((int)i.getKey())-65];
            if(i.getValue()<=2)
            {
                sum+=(i.getValue()*f2);
                System.out.println(sum);
                //System.out.println(cost[(int)(i.getKey())-65]-1);
            }
            else
            {
                int temp=i.getValue();
                while(temp>=3)
                {
                    temp-=3;

                    sum+=(2*f2);
                }
                sum+=(temp*f2);
            }
        }
            return sum;
    };
    public static int Discount()
    {
return 0;
    }
    public static int noDiscount()
    {
return 0;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s=sc.nextLine();
        //String s1=sc.nextLine();
        int s2[]=new int[26];
        for(int i=0;i<26;i++){s2[i]=sc.nextInt();}
        System.out.println(calPrice(s,s2));
        sc.close();
    };
};
