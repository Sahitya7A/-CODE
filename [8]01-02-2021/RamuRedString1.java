/*
Program1

Ramu  has given a string which will only contain lower case alphabets(a-z). 
He wants to reduce the string by doing a series of operations. 
In each operation he selects a pair of adjacent lowercase letters that are same, and he will remove them. 
For example, the word "ccd" would be "d" in one operation.
Ramu work is to delete as many characters as possible using the method and print final string. 
If the final string is empty then print  "-1"


Sample Test Case-1
input = addcbccttt
output = acbt

Explanation
ramu performs the following sequence of operations to get the final string.
addcbccttt -->  acbccttt --> acbttt --> acbt

input = aa
output = -1

input = dood

Explanation
following operations to get the final string
dood → dd → -1
*/


import java.util.*;
class RamuRedString1
{
    public static String reducedString(String s)
    {
        int i=0;
        StringBuilder sb =new StringBuilder(s);
        while(sb.length()!=0)
        {
            if((i+1) >(sb.length()-1)){break;}//if we are at last index then accessing index+1 will be a error
            if(sb.charAt(i)==sb.charAt(i+1))
            {
                sb.delete(i,i+2);
                i=0;//after deletion bringing head to 0th index
            }
            else{i+=1;}//if no match-move index+1
        }
        if(sb.length()==0){return "-1";}
        return String.valueOf(sb);
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s=sc.next();
        System.out.println(reducedString(s));
        sc.close();
    }
}