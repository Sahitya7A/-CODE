import java.util.*;
import java.math.BigInteger;
class  ExtraLongFact
{
	 static void extraLongFactorials(int n) {
        
        BigInteger factorial = new BigInteger("1");
        
        for(int i = 2; i <= n; i++)
        {
            BigInteger multiplier = new BigInteger(String.valueOf(i));
            factorial = factorial.multiply(multiplier);
        }
        
        System.out.println(factorial);

    }

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
		extraLongFactorials(n);
	}
}
