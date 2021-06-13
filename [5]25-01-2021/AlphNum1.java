/*write a program to read a postive input 'n' from the user and print the following pattern
Assume the input 'n' will always be a postive integer
input = 5
output =
A*1
B*C*3*2
D*E*F*6*5*4
G*H*I*J*10*9*8*7
K*L*M*N*O*15*14*13*12*11

Note - If in the above pattern if the alphabet exceed 'Z' then start print again from 'A'
*/
import java.util.*;
class AlphNum1
{
    public static void PrintPat(int n)
    {//printing = Alphabets + Numbers
    //print[/] = all witth (*)+ last [/]
        char star='A';
        int stari=0;
        for(int i=0;i<n;i++)
        {//printing alphabets counting them
            for(int j=i+1;j<(i+1)*2;j++)
            {
                if(star=='Z'){
                    System.out.print(star+"*");
                    stari++;
                    star='A';
                    continue;
                }
                System.out.print(star+"*");
                star++;
                stari++;
            }
            //passing alphabet count to method-number printing
            printNum(stari,i+1);
            System.out.println();
        }
    }
    public static void printNum(int y,int k)
    {
        for(int i=0;i<k-1;i++)
        {
            System.out.print(y+"*");
            y--;
        }
        System.out.print(y);
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        PrintPat(n);
        sc.close();
    }
}
