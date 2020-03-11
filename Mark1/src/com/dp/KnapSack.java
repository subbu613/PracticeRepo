package com.dp;

import java.util.HashMap;
import java.util.Map;

public class KnapSack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Map<Integer,Integer> m=new HashMap<>();
m.get(10);
		// int [][] items = {{2,6},{2,10},{3,12}};
		Item[] items = { new Item(2, 6), new Item(2, 10), new Item(3, 12) };
		int sum = 5;

		int maxValue = knapSackBruitForceRecursiveCache(items, sum);
System.out.println("maxValue for weight sum "+sum+"  is "+maxValue);

int maxValueBottomUp = knapSackBottomUp(items, sum);
System.out.println("maxValue for weight sum "+sum+"  is "+maxValueBottomUp);


int maxValueBottomUpReverseForLoops = reverseForLoopsBottomUpSolution(sum,items);
System.out.println("maxValue for weight sum maxValueBottomUpReverseForLoops "+sum+"  is "+maxValueBottomUpReverseForLoops);
	}

	private static int knapSackBruitForceRecursiveCache(Item[] items, int sum) {
		// TODO Auto-generated method stub
		Map<Integer, Map<Integer, Integer>> cache = new HashMap<Integer, Map<Integer, Integer>>();
		return knapSackBruitForceRecursiveCache(items, sum, 0, cache);
	}

	private static int knapSackBruitForceRecursiveCache(Item[] items, int sum, int i, Map<Integer, Map<Integer, Integer>> cache) {

		if (i == items.length || sum <= 0)
			return 0;

		if (cache != null && cache.get(i) == null)
			cache.put(i, new HashMap<>());
		
			Integer cached= cache.get(i).get(sum);
				if(cached!=null)
				{
					return cached;
				}
		int toReturned = 0;

		if (sum - items[i].weight < 0) {
			toReturned = knapSackBruitForceRecursiveCache(items, sum, i + 1, cache);
		} else {
			toReturned = Math.max(knapSackBruitForceRecursiveCache(items, sum, i + 1, cache),
					knapSackBruitForceRecursiveCache(items, sum - items[i].weight,i + 1, cache) + items[i].value);

		}
		Map<Integer,Integer> map=new HashMap<>();
		map.put(sum, toReturned);
		cache.put(i, map);
		return toReturned;
	}
	
	
	private static int knapSackBottomUp(Item[] items, int sum) {
		//Map<Integer, Map<Integer, Integer>> cache = new HashMap<Integer, Map<Integer, Integer>>();
		int[][] cache=new int[items.length+1][sum+1];
		
		for(int i = 0; i < items.length; i++)
		{
			for (int j = 1; j <= sum; j++) {
				if(j-items[i].weight<0)
				{
					cache[i+1][j]=cache[i+1-1][j];
				}else
				{
					System.out.println("i is "+i +"j is "+j);
				cache[i+1][j]=Math.max(cache[i+1-1][j], cache[i+1-1][j-items[i].weight]+items[i].value);
				
				}
				
			}
		}
		
		return cache[items.length][sum];
		
	}
	
	public static int reverseForLoopsBottomUpSolution(int w, Item[] items) {

		if (w <= 0)
			return 0;

		int[][] cache = new int[items.length+1][w + 1];

		for (int i = 1; i <= w; i++) {
			for (int j = 0; j < items.length; j++) {
				if (i - items[j].weight < 0) {
					cache[j+1][i] = cache[j+1-1][i];
				} else {
					System.out.println("i is "+i +"j is "+j);
					cache[j+1][i] = Math.max(cache[j+1-1][i], items[j].value + cache[j+1-1][i - items[j].weight]);
				}
			}

		}
		
		return cache[items.length][w];

	}
	

}

class Item {
	public Item(int w, int v) {
		this.weight = w;
		this.value = v;

	}

	int weight;
	int value;
}
