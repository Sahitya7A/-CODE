/*
Given a List of words, return the words that can be typed using letters of alphabet on only one row's of American keyboard like given below

   QWERTYUIOP/qwertyuiop
   ASDFGHIJKL/asdfghjkl
   ZXCVBNM/zxcvbnm


    You may use one character in the keyboard more than once.
    You may assume the input string will only contain letters of alphabet(A-Z/a-z).
    Assume the alphabets are case sensitive 
    Print -1 for all Boundary Conditions 

Example:

input =hello Alaska Dad Peace
output = 
Alaska 
Dad


Here the words Alaska and Dad are the characters of second(same) only 


input =asdf qwer zxcv
output =
asdf
qwer
zxcv

input =Dad hAS the Key
output = Dad
hAS

input =to be or not TO be 
output = to
or
TO
*/
import java.util.*;
class AlpWord1
{
    static List<Character> First=new ArrayList<>();
    static List<Character> Second=new ArrayList<>();
    static List<Character> Third=new ArrayList<>();
    public static void printValidS(String[] s1)
    {
        //System.out.println(First+"\n"+Second+"\n"+Third);
        int c=0,Board=0,I=0;
        for(String i : s1)
        {
            c=0;
            for(int j=0;j<i.length();j++)
            {
                if(j==0)
                {
                    Board=checkB(Character.toLowerCase(i.charAt(j)));
                    c++;
                    continue;
                }
                if(Board==1 && First.contains(Character.toLowerCase(i.charAt(j)))){c++;}
                else if(Board==2 && Second.contains(Character.toLowerCase(i.charAt(j)))){c++;}
                else if(Board==3 && Third.contains(Character.toLowerCase(i.charAt(j)))){c++;}
            }
            if(c==i.length()){System.out.println(i);I++;}
        }
        if(I==0){System.out.println("-1");}
    }
    public static int checkB(char t)
    {
        if(First.contains(t)){return 1;}
        else if(Second.contains(t)){return 2;}
        return 3;
    }
    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
        String s=sc.nextLine();
        String s1[]=s.split(" ");
        printValidS(s1);
        sc.close();
    }
    static
    {
        First.add('q');
        First.add('w');
        First.add('e');
        First.add('r');
        First.add('t');
        First.add('y');
        First.add('u');
        First.add('i');
        First.add('o');
        First.add('p');
    }
    static
    {
        Second.add('a');
        Second.add('s');
        Second.add('d');
        Second.add('f');
        Second.add('g');
        Second.add('h');
        Second.add('j');
        Second.add('k');
        Second.add('l');
    }
    static
    {
        Third.add('z');
        Third.add('x');
        Third.add('c');
        Third.add('v');
        Third.add('b');
        Third.add('n');
        Third.add('m');
    }
}