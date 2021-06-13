import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

class predicate1 {
   public static void main(String args[]){

	  // Creating predicate
	  Predicate<Integer> lesserthan = i -> (i < 20); 

	  // Calling Predicate method
	  System.out.println(lesserthan.test(10)); 

      List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		
      // Predicate<Integer> predicate = n -> true
      // n is passed as parameter to test method of Predicate interface
      // test method will always return true no matter what value n has.
		
      System.out.println("Print all numbers:");
		
      //pass n as parameter
      eval(list, n -> true);
		
      // Predicate<Integer> predicate1 = n -> n%2 == 0
      // test method will return true if n%2 is zero
		
      System.out.println("Print even numbers:");
      eval(list, n -> n % 2 == 0 );
		
      // Predicate<Integer> predicate2 = n -> n > 3
      // test method will return true if n is greater than 3.
		
      System.out.println("Print numbers greater than 3:");
      eval(list, n -> n > 3 );
   }
	
   public static void eval(List<Integer> list, Predicate<Integer> predicate) {
      for(Integer n: list) {		
         if(predicate.test(n)) {
            System.out.println(n + " ");
         }
      }
   }
}