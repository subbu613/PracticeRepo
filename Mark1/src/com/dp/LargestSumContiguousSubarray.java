package com.dp;

public class LargestSumContiguousSubarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { -2, -3, 4 , -1, -2, 1, 5, -3 };
		
		bottomUp(arr);
		
		int[]  arr2 = { -2, -3, 4 , -1, -2, 1, - 5, -3 };
		 
		 bottomUp(arr2);
	}

	private static void bottomUp(int[] arr) {
		// TODO Auto-generated method stub
		int start=0;
		int end=0;
		int windowMax=arr[0];
		int totalMax=arr[0];
		int totalStart=0;
		int totalEnd=0;
		for (int i = 1; i < arr.length; i++) {
			System.out.println("i "+i+" start "+ start+ " end "+end+" windowMax  "+windowMax+" totalMax "+totalMax);
			int sum=windowMax+arr[i];
			if(sum < arr[i])
			{
				
				start = i;
				end = i;
				windowMax=arr[i];
				if(totalMax < arr[i])
				{
					totalMax=arr[i];
					totalStart=start;
					totalEnd=end;
				}
			}
			else
			{
				end=i;
				if(totalMax < sum)
				{
					
					totalMax=sum;
					totalStart=start;
					totalEnd=end;
				}
				windowMax = sum;
			}
			
			
		}
		System.out.println("start "+ start+ " end "+end+" totalMax "+totalMax+" totalstart "+ totalStart+ " totalEnd "+totalEnd);
		
	}

}
