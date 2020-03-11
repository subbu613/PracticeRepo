package com.dynamicprograming;

public class FibanociSeries {
   static int bruteForceCount=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=10;
		fib(n);
		
	}

	private static void fib(int n) {
		// TODO Auto-generated method stub
		//2^n time complexity
		System.out.println("BruteforceSolution returns "+ fibBruteforceRecursion(n)+" and no of calls is "+bruteForceCount);
		
		//n time complexity with cache with recursion
		System.out.println();
		
	}

	private static int fibBruteforceRecursion(int n) {
		System.out.println(n + " ");
		bruteForceCount++;
		if (n == 0)
			return 0;
		if (n == 1)
			return 1;

		return fibBruteforceRecursion(n - 1) + fibBruteforceRecursion(n - 2);
	}

}
