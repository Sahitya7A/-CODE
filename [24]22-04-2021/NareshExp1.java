




import java.util.*;
class NareshExp1
{
public static void printWordList(String[] s)
{
	List<ArrayDeque<String>> l =new ArrayList<>();
ArrayDeque<String> a=new ArrayDeque<>();
StringBuilder sb=new StringBuilder();
boolean flag=false;
int count=0;
	for(int i=0;i<s.length;i++)
{
if(s[i].equals("[")){
count++;
flag=true;
}
else if(s[i].equals("]")){flag=false;
if(a.isEmpty()){count--;}else{
sb.append(count);
a.remove(",");
l.add(a);
a=new ArrayDeque<>();}
}
else if(flag && s[i-1].equals(","))
{
a.add(s[i]);
System.out.println();
}
else{sb.append(s[i]);}
//System.out.println(i);
}
System.out.println(l);
System.out.println(sb);	
}
public static void main(String[] args)
{	Scanner sc =new Scanner(System.in);
	String[] s =sc.next().split("");
	printWordList(s);
	sc.close();		} }
/*
[b]c[e,g]k     [bcek, bcgk]


[a,b][c,d]       [ac, ad, bc, bd]


[xyz]a[b,c]  [xyzab, xyzac]

*/