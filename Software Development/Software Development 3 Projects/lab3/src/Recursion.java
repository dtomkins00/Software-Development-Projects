public class Recursion {

	// The sum method takes the number "n" and returns the sum of all positive numbers up to it.
	public static int sum(int n){
		if (n <= 1) 
			return 1;
		else 
			return n + sum(n-1);
	}

	// This multiply method uses two positive integers "m" and "n" to compute m*n using addition and recursion.
	public static int multiply(int m, int n){
		if (m == 0 || n == 0) {
			return 0;
		}

		else if(n < 0) {
			return - m + multiply(m, n + 1);
		}

		else {
			return m + multiply(m, n - 1);
		}
	}

	// The Fibonacci method uses recursion to find numbers in the sequence using "n" as an argument.
	public static int Fibonacci(int n){
		if(n == 0)
			return 0;

		else if(n == 1)
			return 1;

		else
			return Fibonacci(n - 1) + Fibonacci(n - 2);
	}
}