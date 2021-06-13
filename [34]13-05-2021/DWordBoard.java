/*
Given a 2D board and a word, find if the word exists in the grid.

The word can be constructed from letters of sequentially adjacent cell, 
where "adjacent" cells are those horizontally or vertically neighboring. 
The same letter cell may not be used more than once.

The first line of input consists of the size of the 2D board followed by 
Upper Case Alphabets 
followed by word. 

Example:

input =3
4
A B C E
S F C S
A D E E
ABCCED
output =true

Given word = "ABCCED", return true.

input =3
4
A B C E
S F C S
A D E E
ABCB
output =false
Given word = "ABCB", return false.

case = 1
input =3
4
A B C E
S F C S
A D E E
ABCCED
output =true

case = 2
input =3
4
A B C E
S F C S
A D E E
ABCB
output =false

case = 3
input =2
2
A B
C D
ABCD
output =true

case = 4
input =3 
3
A B C
D E F
G H I
ABCE
output =false
*/
import java.util.*;
public class DWordBoard
{
    public static ArrayList<String> as;
    public static boolean wordExists(String s)
    {
        boolean flag=false;
        for(String i : s.split(""))
        {
            if(as.contains(i))
            {
                flag=true;
                as.set(as.indexOf(i),"-");
            }
            else{flag=false;break;}
        }
        return flag;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int r=sc.nextInt();
        int c=sc.nextInt();
        String[][] a = new String[r][c];
        as=new ArrayList<String>();
        String s;
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                s=sc.next();
                if(i==j){continue;}
                as.add(s);
            }
        }
        s=sc.next();
        System.out.println(wordExists(s));
    }
}