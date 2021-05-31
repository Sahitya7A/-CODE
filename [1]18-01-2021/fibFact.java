

class Fibonacci {

	public static int fib(int n) {
		System.out.println(n);
		return n < 2 ? n : fib(n - 1) + fib(n - 2);
	}

	public static void main(String[] args) {
		System.out.println("result " + fib(4));
	}
}
