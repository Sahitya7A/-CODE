import java.util.*;
//vocabulary
class AnanthAcr
{
    public static void CompleteTask(String[] vocabulary,String[] words)
    {
        List<Boolean> tf =new ArrayList<>();
        for(String W : words)
        {
            boolean b=match(W,vocabulary);
            tf.add(b);
           System.out.println(b);
        }
        for(Boolean i : tf){System.out.print(i+" ");}
    };
    public static boolean match(String W,String[] vocabulary)
    {
        String w_acr=find_Acr(W);
        char first=W.charAt(0);
        char last=W.charAt(W.length()-1);
        List<String> sb =new ArrayList<>();
        for(String V : vocabulary)
        {
            //if first and last letters are equal
            if((""+V.charAt(0)).equals(""+first) && (""+V.charAt(V.length()-1)).equals(""+last))
            {
                sb.add(V);
            }
        }
        if(sb.size()==0)
        {
            return true;//no matching vocabulary words
        }
        boolean[] flag=new boolean[sb.size()];//acr matched words with vocabulary - true
        int k=0;
        boolean bf=false;//if acr and originals of both match
        for(String i : sb)
        {
            //to check if word and vocabulary has same acronym
            if(find_Acr(i).equals(w_acr))
            {
                //to check if their original words also match
                if(W.equals(i))
                {
                    flag[k]=true;
                    k++;
                    //bf=true;
                    //break;
                }
                else//their originals didn't match
                {
                    flag[k]=false;
                    k++;
                }
            }
            else//their acronym only didn't match
            {
                flag[k]=true;
            }
        }
        int count=0;
        if(bf){return true;}
        else
        {
            for(int z=0;z<flag.length;z++){if(flag[z]){count++;}}
            if(count==flag.length){return true;}
        }
        return false;
    }
    public static String find_Acr(String a)
    {
        StringBuilder sb =new StringBuilder();
        if(a.length()<=2)
        {
            return a;
        }
        sb.append(""+a.charAt(0)+(a.length()-2)+a.charAt(a.length()-1));
        return sb.toString();
    }
    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
        String vocab[]=sc.nextLine().split(" ");
        String word[]=sc.nextLine().split(" ");
        CompleteTask(vocab,word);
        sc.close();
    };
};
/*
Ananth interested in creating the acronyms for any word.
The definition of acronym is another word with a concatenation of its first letter,
 the number of letters between the first and last letter, and its last letter.

 If a word has only two characters, then it is an acronym of itself.

 Examples:
	- Acronym of 'dog' is 'd1g'.
	- Acronym of 'another' is 'a5r'.
	- Acronym of 'ab' is 'ab'.

You are given a list of vocabulary, and another list of words.
Your task is to check is word with the vocabulary and
return "true" if atleast one of the following rules satisfied:
	1. acronym of the word should not match with any of the acronyms of vocabulary
	2. if acronym of the word matches with any of the acronyms of vocabulary
	'the word' and matching words in vocabulary should be same.
Otherwise, return 'false'.

Input Format:
-------------
Line-1: Space separated strings, vocabulary[]
Line-2: Space separated strings, words[]

Output Format:
--------------
Print N boolean values, where N = words.length.


Sample Input-1:
---------------
cool bell cool coir move more mike
cool char move

Sample Output-1:
----------------
true false false
*/
