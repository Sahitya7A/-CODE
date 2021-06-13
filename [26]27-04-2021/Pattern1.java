
Write a program to generate the following pattern for any given value 'n'


input = 25
output =
* * * * * * * * * * * * * * * * * * * * * * * * *
* A B C D E F G H I J K L M N O P Q R S T U V W *
* X Y Z A B C D E F G H I J K L M N O P Q R S T *
* U V W X Y Z A B C D E F G H I J K L M N O P Q *
* R S T U V W X Y Z A B C D E F G H I J K L M N *
* O P Q R S T U V W X Y Z A B C D E F G H I J K *
* L M N O P Q R S T U V W X Y Z A B C D E F G H *
* I J K L M N O P Q R S T U V W X Y Z A B C D E *
* F G H I J K L M N O P Q R S T U V W X Y Z A B *
* C D E F G H I J K L M N O P Q R S T U V W X Y *
* Z A B C D E F G H I J K L M N O P Q R S T U V *
* W X Y Z A B C D E F G H I J K L M N O P Q R S *
* T U V W X Y Z A B C D E F G H I J K L M N O P *
* Q R S T U V W X Y Z A B C D E F G H I J K L M *
* N O P Q R S T U V W X Y Z A B C D E F G H I J *
* K L M N O P Q R S T U V W X Y Z A B C D E F G *
* H I J K L M N O P Q R S T U V W X Y Z A B C D *
* E F G H I J K L M N O P Q R S T U V W X Y Z A *
* B C D E F G H I J K L M N O P Q R S T U V W X *
* Y Z A B C D E F G H I J K L M N O P Q R S T U *
* V W X Y Z A B C D E F G H I J K L M N O P Q R *
* S T U V W X Y Z A B C D E F G H I J K L M N O *
* P Q R S T U V W X Y Z A B C D E F G H I J K L *
* M N O P Q R S T U V W X Y Z A B C D E F G H I *
* * * * * * * * * * * * * * * * * * * * * * * * *


input = 30 
output = 
* * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
* A B C D E F G H I J K L M N O P Q R S T U V W X Y Z A B *
* C D E F G H I J K L M N O P Q R S T U V W X Y Z A B C D *
* E F G H I J K L M N O P Q R S T U V W X Y Z A B C D E F *
* G H I J K L M N O P Q R S T U V W X Y Z A B C D E F G H *
* I J K L M N O P Q R S T U V W X Y Z A B C D E F G H I J *
* K L M N O P Q R S T U V W X Y Z A B C D E F G H I J K L *
* M N O P Q R S T U V W X Y Z A B C D E F G H I J K L M N *
* O P Q R S T U V W X Y Z A B C D E F G H I J K L M N O P *
* Q R S T U V W X Y Z A B C D E F G H I J K L M N O P Q R *
* S T U V W X Y Z A B C D E F G H I J K L M N O P Q R S T *
* U V W X Y Z A B C D E F G H I J K L M N O P Q R S T U V *
* W X Y Z A B C D E F G H I J K L M N O P Q R S T U V W X *
* Y Z A B C D E F G H I J K L M N O P Q R S T U V W X Y Z *
* A B C D E F G H I J K L M N O P Q R S T U V W X Y Z A B *
* C D E F G H I J K L M N O P Q R S T U V W X Y Z A B C D *
* E F G H I J K L M N O P Q R S T U V W X Y Z A B C D E F *
* G H I J K L M N O P Q R S T U V W X Y Z A B C D E F G H *
* I J K L M N O P Q R S T U V W X Y Z A B C D E F G H I J *
* K L M N O P Q R S T U V W X Y Z A B C D E F G H I J K L *
* M N O P Q R S T U V W X Y Z A B C D E F G H I J K L M N *
* O P Q R S T U V W X Y Z A B C D E F G H I J K L M N O P *
* Q R S T U V W X Y Z A B C D E F G H I J K L M N O P Q R *
* S T U V W X Y Z A B C D E F G H I J K L M N O P Q R S T *
* U V W X Y Z A B C D E F G H I J K L M N O P Q R S T U V *
* W X Y Z A B C D E F G H I J K L M N O P Q R S T U V W X *
* Y Z A B C D E F G H I J K L M N O P Q R S T U V W X Y Z *
* A B C D E F G H I J K L M N O P Q R S T U V W X Y Z A B *
* C D E F G H I J K L M N O P Q R S T U V W X Y Z A B C D *
* * * * * * * * * * * * * * * * * * * * * * * * * * * * * *


case = 1
input = 1
output = *

case = 2
input = 2
output =
* *
* *

case = 3
input = 3
output =
* * *
* A *
* * *
*/
import java.util.*;
class Pattern1
{
    public static void printPattern(int n)
    {
        char c='A';
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i==0 || j==0 || i==(n-1) || j==(n-1)){System.out.print("*"+" ");continue;}
                if(c>'Z'){c='A';}
                System.out.print((c++)+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        printPattern(n);
        sc.close();
    }
}