import java.util.ArrayList;
import java.util.Collections;

class ALDemo {
   public static void main(String args[]) {
      ArrayList al = new ArrayList();
      System.out.println("Initial size of al: " + al.size());

      al.add("Singapore");
	  al.add("UK");
      al.add("USA");
      al.add("Japan");
      al.add("Argentina");

      al.add(1, "India");
      System.out.println("Size of al after additions: " + al.size());

      System.out.println("Contents of al: " + al);
      al.remove("Japan");
      al.remove(2);
      System.out.println("Size of al after deletions: " + al.size());
      System.out.println("Contents of al: " + al);

	  Collections.sort(al);

      Object[] ob = al.toArray();

      for (Object value : ob) {
        System.out.println("Elements: " + value);
     }
   }
}