import java.util.*;
class StringShift1
{
    
public static int sum(List<Integer> l) {
    int sum= 0;
    for (int i: l) {
        sum += i;
    }
    return sum;
}
    public static void printShiftedS(String s,List<Integer> a)
    {
        StringBuilder sb=new StringBuilder();
int n=s.length();
int count=0;
for(char i : s.toCharArray())
{
count=sum(a.subList(s.length()-n,s.length()));
n--;
int at=(int)i;
at+=count;
if(at>122){

do{
at=97+(at-122)-1;
sb.append(String.valueOf((char)at));
}while(at<=122);
}



else{sb.append(String.valueOf((char)at));}
}
System.out.println(sb);
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s=sc.next();
        
        
        //System.out.println(printShiftedS(s,a));
List<Integer> sa=new ArrayList<Integer>();
for(int i=0;i<s.length();i++)
        {sa.add(sc.nextInt());}

//System.out.println((int)'a');
//System.out.println((int)'z');
//System.out.println((int)'Z');
System.out.println(      (char)97);

System.out.println(sa.subList(2,3));
System.out.println(sum(sa.subList(1,3)));

printShiftedS(s,sa);


 sc.close();
    }
}