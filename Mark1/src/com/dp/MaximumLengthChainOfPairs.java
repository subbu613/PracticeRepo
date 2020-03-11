package com.dp;

public class MaximumLengthChainOfPairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [][] arr= {{5,24},{39,60},{15,28},{27,40},{50,90}};
		
		int maxLenght=bottomUPDP(arr);
		System.out.println("maxLength "+maxLenght);
		
		
		
		
	}

	private static int bottomUPDP(int[][] arr) {
		// TODO Auto-generated method stub
		if(arr==null || arr.length==0 )
			return 0;
		
		int totalMax=0;
		int cache[]=new int[arr.length];
		cache[arr.length-1]=1;
		for (int i = arr.length-1; i >=0; i--) {
			int currentMax=0;
			for (int j = i+1; j < cache.length; j++) {
				
				if(arr[i][1] < arr[j][0])
				{
					currentMax= currentMax > cache[j] ? currentMax : cache[j];
					
				}
				cache[i]=currentMax+1;
			}
			totalMax = totalMax > cache[i] ? totalMax : cache[i];
			
		}
		
		printArray(cache);
		
		return totalMax;
	}

	private static void printArray(int[] cache) {
		// TODO Auto-generated method stub
		for (int i = 0; i < cache.length; i++) {
			System.out.print(cache[i]+" ");
		}
		System.out.println();
	}

}
