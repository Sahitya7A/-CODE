public class Varargs
{
  public static double sum(double... numbers)
  {
    double total = 0.0;

    for(double d : numbers)              
      total += d;                          

    return total;
  } 

  public static void main( String args[] ) 
  {
    double d1 = 10.0;
    double d2 = 20.0;
    double d3 = 30.0;

    System.out.printf("d1 = %.1f\nd2 = %.1f\nd3 = %.1f\n\n", d1, d2, d3);
    System.out.printf("Sum of d1 and d2 is %.1f\n", sum(d1, d2)); 
    System.out.printf( "Sum of d1, d2 and d3 is %.1f\n", sum(d1, d2, d3));
  }
} 
