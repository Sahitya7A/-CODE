import java.util.*;
class Vertical2
{
    public static void PRINT(String s)
    {
        String ar[]=s.split(" ");
        int max=ar[0].length();
        for(int i=1;i<ar.length;i++)
        {
            if(ar[i].length()>max){max=ar[i].length();}
        }
    /*    input = HOW ARE YOU
        TO BE OR NOT TO BE
output =                "HAY"
"TBONTB"                      "ORO"
"OEROOE"
"   T"                         "WEU"
    output = */
    StringBuilder sb =new StringBuilder();
    List<StringBuilder> sbb=new ArrayList<>();
    for(int j=0;j<max;j++)
    {
        sb=new StringBuilder();
        for(int i=0;i<ar.length;i++)
        {
            if(j<ar[i].length())//there is letter
            {
                sb.append(ar[i].charAt(j));
            }
            else
            {
                sb.append(" ");
            }
        }
            //removeing extra spaces at end
            while(sb.charAt(sb.length()-1)==' ')
            {
                sb.deleteCharAt(sb.length()-1);
            }
            //System.out.println(sb);

       System.out.println(sb);
    }

    //        System.out.println(Collections.max(Arrays.asList(ar)));
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s=sc.nextLine();
        PRINT(s);
        sc.close();
    }
}
/*
write a program to read a line of words and return all the words vertically in the
same order in which they appear  in line

Words are returned as a list of strings, complete with spaces when is necessary.
(Trailing spaces are not allowed).

Each word would be put on only one column and that in one column there will be only
one word.

Print the string in Double Quotes like "HAY", "ORO"
The line contains only upper case English letters.
Assume that there is only one space between 2 words.


 Sample Test Case-1

input = HOW ARE YOU
output =
"HAY"
"ORO"
"WEU"

 Explanation: Each word is printed vertically.
HAY
ORO
WEU


 Sample Test Case-2
input  =TO BE OR NOT TO BE
output =
"TBONTB"
"OEROOE"
"   T"

 Explanation
If the above words are written vertially we have the following words
"TBONTB"
"OEROOE"
"   T"


Sample Test Case-3
input =HELLO TO YOU
output =
"HTY"
"EOO"
"L U"
"L"
"O"

Sample Test Case-4
input =ABC DEFG HIK
output =
"ADH"
"BEI"
"CFK"
" G"

Sample Test Case-5
input = TOM LIKE CODER
output =
"TLC"
"OIO"
"MKD"
" EE"
"  R"

 */
*/
