/*
Program-1

Tanu and Manu are playing a Rangoli Game with "#", as part of the game
Tanu has to read a group of words and double every consonant and
place an "#" in between them .

Sample Test Case-1
input = this is fun
output = t#th#his#s is#s f#fun#n

Explanation
t is consonant then double the consonant and place "#" in between,
So it becomes "t#t" and do this for full string

Sample Test Case-2
input =hello
output = h#hel#ll#lo

Explanation
h is consonant then double the consonant and place "#" in between,
so it become "h#h" and e is vowel so no change for it and  same for the remaining characters


back end test cases
case = 1
input =hello
output = h#hel#ll#lo

case = 2
input =this is fun
output = t#th#his#s is#s f#fun#n

case = 3
input =hEllO foR aLL
output = h#hEl#ll#lO f#foR#R aL#LL#L

case = 4
input =b
output = b#b

case = 5
input =ABCDefghI klmnOpqr STUvwxyz
output = AB#BC#CD#Def#fg#gh#hI k#kl#lm#mn#nOp#pq#qr#r S#ST#TUv#vw#wx#xy#yz#z

case = 6
input =I am doing a Good Boy.
output = I am#m d#doin#ng#g a G#Good#d B#Boy#y.#.
*/

import java.util.*;
class TanuManu1
{
    public static void PrintNS(String s)
    {
        List<StringBuilder> a=new ArrayList<>();
        String[] a1=s.split(" ");
        StringBuilder sb=new StringBuilder();
        for(String k :a1)
        {
            sb=new StringBuilder();
            for(int i=0;i<k.length();i++)
            {
                char t=k.charAt(i);
                if(isConsonant(t))
                {
                    sb.append(t+"#"+t);
                }
                else
                {
                    sb.append(t);
                }
            }
            a.add(sb);
        }
        for(StringBuilder i :a)
        {
            System.out.print(i+" ");
        }
    }
    public static boolean isConsonant(char t)
    {
        if(t=='a' || t=='A' || t=='e' || t=='E' || t=='i' || t=='I' || t=='o' || t=='O' || t=='u' || t=='U')
        {
            return false;
        }
        return true;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s=sc.nextLine();
        PrintNS(s);
    }
}
/*
//2
import java.util.*; 

class Test
{ 
public static void changeString(String str) 
{ 
	StringBuilder  sb = new StringBuilder(); 
	
	for(int i = 0; i < str.length(); i++) 
	{ 
		switch(str.charAt(i))
		{
			case 'a' :
            case 'e' :
			case 'i' :
			case 'o' :
			case 'u' :
			case 'A':
			case 'E':
			case 'I':
			case 'O':
			case 'U':
			case ' ':
                  			sb.append(str.charAt(i)); break;
			default:
			               sb.append(""+str.charAt(i) + '#' + str.charAt(i)); 
		}
	}
System.out.print(sb);
}

public static void main(String[] args) 
{ 
Scanner sc = new Scanner(System.in);
String str = sc.nextLine();
changeString(str);
}
}
*/