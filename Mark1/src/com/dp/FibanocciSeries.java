package com.dp;

public class FibanocciSeries {
static	int count=1;
	public static void main(String[] args) {
		int n=10;
		
		
		int[] cache=new int[n+1];
		for (int i = 1; i < cache.length; i++) {
			cache[i]=-1;
		}
		int nthTerm=fib(n,cache);
		System.out.println("nthTerm in fib is "+nthTerm);
		
		
		
		
		System.out.println("*************************************                    *************************************************************");
	int result=	fib(n);
		System.out.println(n+" th term is "+result);
		
		int [] cache1=new int[n+1];
		for (int i = 1; i < cache1.length; i++) {
			cache1[i]=-1;
		}
		result=fib(cache1,n);
		System.out.println(n+" th term is with cache "+result);
		
		result=fibBottomUpWithCache(n);
		System.out.println(n+" th term is with bottom up cache "+result);
		
		
		result=fibBottomUpFurtherOptimized(n);
		System.out.println(n+" th term is with bottom up further optimized "+result);
	}

	private static int fib(int n, int[] cache) {
System.out.println("n "+n);
		if(n==0)
			return 0;
		else if(n==1)
		return 1;
		
		System.out.println("static count "+count++);
		if(cache[n]==-1)
			cache[n]=fib(n-1, cache)+fib(n-2, cache);
		
		return cache[n];
	}
	
	
	public static int fib(int n)
	{
		if(n==0)
			return n=0;
		else if(n==1)
			return 1;
		else
		{
			return fib(n-1)+fib(n-2);
		}		
	}
	
	
	public static int fib(int[] cache,int n)
	{
		System.out.println(n);
		if(n==0)
			return n=0;
		else if(n==1)
			return 1;
		else if(cache[n]==-1)
		{
			cache[n]=fib(cache,n-1)+fib(cache,n-2);
		}
		
			
		return cache[n];
	}
	
	
	public static int fibBottomUpWithCache(int n)
	{
		int cache[] =new int[n+1];
		
		cache[1]=1;
		
		for (int i = 2; i <=n; i++) {
			cache[i]=cache[i-1]+cache[i-2];
		}
		return cache[n];
	}
	
	
	public static int fibBottomUpFurtherOptimized(int n)
	{
		if(n==0)
			return n=0;
		else if(n==1)
			return 1;
		
		int n1=0,n2=1;
		
		for (int i = 2; i <=n; i++) {
			int sum=n1+n2;
			n1=n2;
			n2=sum;
		}
		return n2;
	}
	

}
