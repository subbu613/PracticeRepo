package com.dp;

import java.util.HashMap;
import java.util.Map;

public class TargetSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arr= {1,1,1,1,1};
		int sum=3;

		int noOfWays=targetSumBruteForce(arr,sum,0,0);
		System.out.println(" noOfWays "+noOfWays);
		
		Map<Integer,Map<Integer,Integer>> cache=new HashMap<>();
		
		 noOfWays=targetSumTopDownRecursiveCache(arr,sum,0,0,cache);
		System.out.println(" noOfWays "+noOfWays);
	}

	private static int targetSumBruteForce(int[] arr, int sum,int target,int index) {
		// TODO Auto-generated method stub
		
		
		if(target==sum && index==arr.length)
			return 1;
		if( index==arr.length)
			return 0;
		
		int substracting=targetSumBruteForce(arr,sum,target-arr[index],index+1);
		int adding=targetSumBruteForce(arr,sum,target+arr[index],index+1);
		
		return substracting +adding;
	}

	
	public static int targetSumTopDownRecursiveCache(int[] arr,int sum,int target,int index,Map<Integer,Map<Integer,Integer>> cache)
	{
		if(index==arr.length)
			return target==sum ? 1:0;
		
		if(cache.get(target)!=null)
		{
			return cache.get(target).get(sum);
		}
		else
			cache.put(target,new HashMap<Integer, Integer>());
		
		int result=targetSumBruteForce(arr,sum,target-arr[index],index+1) + targetSumBruteForce(arr,sum,target+arr[index],index+1);
		
		cache.get(target).put(sum, result);

		return result;
	}
	
	
	public static int bottomUp(int[] arr,int sum)
	{
		
		return 0;
	}
}
