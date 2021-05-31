class Fibonacci {

  public int CalculateFibonacci(int n) {
    int memoize[] = new int[n+1];
    return fib(memoize, n);
  }

  public int fib(int[] memoize, int n) {
	System.out.println(n + " " + memoize[n]);

    if(n < 2)
      return n;

    // if we have already solved this subproblem, simply return the result from the cache
    if(memoize[n] != 0)
      return memoize[n];

    memoize[n] = fib(memoize, n-1) + fib(memoize, n-2);
    return memoize[n];
  }

  public static void main(String[] args) {
    Fibonacci fib = new Fibonacci();
    System.out.println("5th Fibonacci is ---> " + fib.CalculateFibonacci(4));
    System.out.println("6th Fibonacci is ---> " + fib.CalculateFibonacci(5));
  }
}


/*

https://www.educative.io/courses/grokking-dynamic-programming-patterns-for-coding-interviews/m2G1pAq0OO0

*/