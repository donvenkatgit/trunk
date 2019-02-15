package algorithm;

/*
Determine the number you are computing the factorial for. A factorial is denoted by a positive integer and an exclamation point. ...
Write out the sequence of numbers to be multiplied. ...
Multiply the numbers together.

 */
public class Factorial {
	public static void main(String[] args) {
		Factorial factorial = new Factorial();
		System.out.println(factorial.getRecursiveFactorial(6));
		System.out.println(factorial.getIterativeFactorial(6));
	}
	
	public int getRecursiveFactorial(int n) {
		if (n < 0) return -1;
		else if (n < 2) return 1;
		else return (n * getRecursiveFactorial(n-1));	
		
		// 6*5*4*3*2 = 720
	}
	
	public int getIterativeFactorial(int n) {
		if (n < 0) return -1;
		int fact = 1;
		for (int i = 1; i <= n; i++)
			fact *= i;
		return fact;
	}
}