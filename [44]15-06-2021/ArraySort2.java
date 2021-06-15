/*Given a sentence print the words in such a way that all vowels occur to the 
leftside and consonants in the right side in the sorted order

sample input:
a man is happy if he codes everyday
output:
a amn is ahppy if eh eocds aeedrvyy

sample input:
honesty is the best policy
output:
eohnsty is eht ebst ioclpy

Test Cases:

case = 1
input = time is money
output =
eimt is eomny
case = 2
input = i am good boy
output =
i am oodg oby
case = 3
input = kmit is good college
output =
ikmt is oodg eeocgll
case = 4
input = aeiouEU
output =
EUaeiou
case = 5
input = aAaaa bbbBb eeee
output =
Aaaaa Bbbbb eeee
case = 6
input = b123ae4uo
output =
aeoub1234
case = 7
input = rAmU
output =
AUmr
case = 8
input = rAmEso123$#
output =
AEomrs123#$
*/

import java.util.*;
class Test
{
  public static void main(String [] args)
  {
    Scanner sc=new Scanner(System.in);
    String line=sc.nextLine();
    String[] s1=line.split(" ");
    int len=s1.length;

    for(int i=0;i<len;i++){
      processData(s1[i]);
    }     
  }

  public static void processData(String s){
    String vowel="[aeiouAEIOU]";
    String con="[a-zA-Z&&[^aeiouAEIOU]]";
    String num="[0123456789]";
    String sb1="";
    String sb2="";
    String sb3="";
    String sb4="";
    char[] ch=s.toCharArray();

    for(int i=0;i<ch.length;i++){
      if(s.substring(i,i+1).matches(vowel)){
        sb1+=s.substring(i,i+1);
      }
      else if(s.substring(i,i+1).matches(con)){
        sb2+=s.substring(i,i+1);
      }
      else if(s.substring(i,i+1).matches(num)){
        sb3+=s.substring(i,i+1);
      }
      else{
        sb4+=s.substring(i,i+1);
      }
    }

    char[]c1=sb1.toCharArray();
    char[]c2=sb2.toCharArray();
    char[]c3=sb3.toCharArray();
    char[]c4=sb4.toCharArray();
    
    Arrays.sort(c1);
    Arrays.sort(c2);
    Arrays.sort(c3);
    Arrays.sort(c4);

    System.out.print(c1);
    System.out.print(c2);
    System.out.print(c3);
    System.out.print(c4);
    System.out.print(" ");
  }
}