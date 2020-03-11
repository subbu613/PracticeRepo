package com.dp;

public class RodCuttingProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] length = {1,2,3,4,5,6,7,8};
		int [] price = {1,5,8,9,10,17,17,20};
		
		
		
		//for 8 max is 22 2+6
		int value=8;
		int maxPrice=maxPrice(length,price,value);
		
		System.out.println("maxprice "+maxPrice);
		
		System.out.println("*************************** with new price list *******************************************88");
		//for 8 max is 24 2+6 with bellow price array
		int [] price1 = {3,5,8,9,10,17,17,20};
				 maxPrice=maxPrice(length,price1,value);
				
				System.out.println("maxprice "+maxPrice);
		
		
		
	}

	private static int maxPrice(int[] length, int[] price, int value) {
		// TODO Auto-generated method stub
		//int max=Integer.MIN_VALUE;
		int cache[][] =new int[value+1][length.length+1];
		for (int i = 1; i <=value; i++) {
			
			for (int j = 0; j < length.length; j++) {
				if(i - length[j] < 0)
				{
					cache[i][j+1]=cache[i][j];
					
				}
				else
				{
					cache[i][j+1]=Math.max(cache[i][j],Math.max(price[j], price[j]+cache[i-length[j]][j+1]));
				}
			}
		}
		
		// printing the cache
		for (int i = 0; i < cache.length; i++) {
			for (int j = 0; j < cache.length; j++) {
				System.out.print(cache[i][j]+" ");
			}
			System.out.println();
		}
		return cache[value][length.length];
		

	}

}
