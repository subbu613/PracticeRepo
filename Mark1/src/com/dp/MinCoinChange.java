package com.dp;

public class MinCoinChange {

	 private static int count=0;

	//static int space=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] coins = { 1, 2, 5 };
		int change = 12;

		int minCoins = minCoins(change, coins);
		System.out.println("minCoins by Brutefoce Recursion is "+minCoins);
		
		
		//Recursive with Cache
		int[] cache=new int[change+1];
		for (int i = 1; i < cache.length; i++) {
			cache[i]=-1;
		}
		minCoins=minCoinsCacheRecursive(change, coins, cache);
		System.out.println("minCoins by Cache Recursion is "+minCoins);
		
		
		minCoins= bottomUpCoinChange( change,coins);
		System.out.println("minCoins by Cache Recursion is "+minCoins);
		
	}

	private static int minCoins(int change, int[] coins) {

		if (change < 0)
			return 0;

		return minCoinsBruteforceRecursive(change, coins,0);

	}

	private static int minCoinsBruteforceRecursive(int change, int[] coins,int space) {
		// TODO Auto-generated method stub

		if (change <= 0)
			return 0;
		int min = Integer.MAX_VALUE;
		for (int coin : coins) {
			printspace(space);
			System.out.println("change - coin "+(change - coin)+" change "+change+" coin "+coin);
			if (change - coin >= 0) {
				int currMin = 1+minCoinsBruteforceRecursive(change - coin, coins,space+3);
				min = currMin < min ? currMin : min ;
			}

		}
		//System.out.println("returning "+min);
		return min;
	}
	
	private static int minCoinsCacheRecursive(int change,int[] coins,int[] cache)
	{
		System.out.println("count "+(++count) +"       change is "+change);
		if(change<=0)
		{
			return 0;
		}
		if(cache[change]!=-1)
			return cache[change];
		System.out.println(" after cache count "+(count));
		int min=Integer.MAX_VALUE;
		
		for (int i = 0; i < coins.length; i++) {
			
			if(change-coins[i]>=0)
			{
				int currMax=1+minCoinsCacheRecursive(change-coins[i], coins, cache);
				min= min<currMax ? min:currMax;
			}
		}
		
		
		return cache[change]=min;
	}

	public static int bottomUpCoinChange(int change,int [] coins)
	{
		int [] cache=new int[change+1];
		
		
		
		for (int i = 1; i <= change; i++) {
			int min =Integer.MAX_VALUE;
			
			for (int coin:coins) {
				if(i-coin>=0) {
				int currMin=1+cache[i-coin];
				min=min<currMin ? min:currMin;
				}
				
			}
			cache[i]=min;
		}
		return cache[change];
		
	}
	
	
	
	

	private static void printspace(int space) {
		// TODO Auto-generated method stub
		for (int i = 0; i <space; i++) {
			System.out.print("*");
		}
		space=space+2;
	}
	
	
	
	

}
