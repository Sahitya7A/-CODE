import java.util.*;
class AnandXYRef1
{
    public static int countOfReflection(int N)
    {
        int count=0,c,cl;
        StringBuilder sb;
        for(int i=1;i<=N;i++)
        {
            sb=new StringBuilder();
            c=0;
            cl=0;
            int t=i;
            if(t<10)
            {
                if(t==6 || t==9){count++;}
                continue;
            }
            while(t!=0)
            {
                int s=t%10;
                cl++;
                switch(s)
                {
                    case 0:
                        sb.append(0);
                        break;
                    case 1:
                        sb.append(1);
                        break;
                    case 6:
                        sb.append(9);
                        break;
                    case 8:
                        sb.append(8);
                        break;
                    case 9:
                        sb.append(6);
                        break;
                }

                if(s==0 || s==1 || s==6 || s==8 || s==9){c++;}
                t=t/10;
            }
            if(c==cl){count++;}
            if(Integer.valueOf(String.valueOf(sb))==i){System.out.println(sb);}//System.out.println(sb);
        }
        if(N>10){return (count-1);}
        return count;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt();
        System.out.println(countOfReflection(N));//prints count
        sc.close();//closing scanner
    }
}


