/* write a java program to read a set of strings and remove all the duplicate elements 
   using collections without using a set.
Note: assume there are 6 strings 
   
sample input:
apple
bat
cat
apple
dog
bat
sample output:
cat 
dog
*/
import java.util.*;
import java.util.Map.Entry;
class Set1
{
  public static void main(String [] args)
  {
    System.out.println("Enter 6 strings");
    Scanner sc = new Scanner(System.in);
    LinkedHashMap<String,Integer> hm = new LinkedHashMap<String,Integer>();
    String[] s = new String[6];

    for(int i=0;i<6;i++)
      s[i]=sc.next();

    for(String x: s) {
      if(hm.containsKey(x)){
        int count=hm.get(x);
        count++;
        hm.put(x,count);
      }
      else{
        hm.put(x,1);
      }
    }

    Set<Map.Entry<String,Integer>> me = hm.entrySet();
    Iterator<Entry<String,Integer>> mi = me.iterator();
    while(mi.hasNext())
    {
      Entry<String,Integer> e = mi.next();
      if(e.getValue()==1)
        System.out.println(e.getKey());
    }
  }
}

