
import java.util.*;

public class SearchString {

    
    static int[] matchingStrings(String[] strings, String[] queries) {
        int count=0;
        int[] res=new int[queries.length];
           for(int i=0;i<queries.length;i++){
             
                String q=queries[i];
               for(int j=0;j<strings.length;j++){
                
                 if(q.equals(strings[j]))
                        ++count;
               }
               res[i]=count;
              
               count=0;
          }
          return res;

    }

    

    public static void main(String[] args)  {
       Scanner scanner = new Scanner(System.in);

        int stringsCount = scanner.nextInt();
        String[] strings = new String[stringsCount];
        for (int i = 0; i < stringsCount; i++) {
            String stringsItem = scanner.next();
            strings[i] = stringsItem;
        }

        int queriesCount = scanner.nextInt();
        String[] queries = new String[queriesCount];
        for (int i = 0; i < queriesCount; i++) {
            String queriesItem = scanner.next();
            queries[i] = queriesItem;
        }

        int[] res = matchingStrings(strings, queries);
        for (int i = 0; i < res.length; i++) {
            System.out.println(String.valueOf(res[i]));

            
        }

        
    }
}


