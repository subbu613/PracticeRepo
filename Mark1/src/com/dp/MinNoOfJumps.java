package com.dp;

public class MinNoOfJumps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 2, 3, 1, 1, 4 };

		int[] arr2 = { 1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9 };
		int[] arr3 = { 2, 8, 3, 6, 9, 3, 0, 0, 1, 3 };

		int[] arr4 = { 1, 3, 6, 3, 2, 3, 6, 8, 9, 5 }; // answer is 4 jumps

		int noOfJumps = 0;
		noOfJumps = noOfJumps(arr, 0, arr[0]);
		System.out.println("arr min No Of Jumps should be 2 but " + noOfJumps);
		System.out.println(
				"****************************===============================*******************************************");
		noOfJumps = noOfJumps(arr2, 0, arr2[0]);
		System.out.println("arr2 min No Of Jumps  " + noOfJumps);

		System.out.println(
				"****************************===============================*******************************************");
		noOfJumps = noOfJumps(arr3, 0, arr3[0]);
		System.out.println("arr3 min No Of Jumps should be 2 but " + noOfJumps);
		System.out.println(
				"****************************===============================*******************************************");
		noOfJumps = noOfJumps(arr4, 0, arr4[0]);
		System.out.println("arr4 min No Of Jumps should be 4 but " + noOfJumps);

		System.out.println("************************* Bottom UP Solution *******************************************");
		System.out.println("************************* Bottom UP Solution *******************************************");
		System.out.println("************************* Bottom UP Solution *******************************************");
		System.out.println("************************* Bottom UP Solution *******************************************");
		System.out.println("************************* Bottom UP Solution *******************************************");

		noOfJumps = noOfJumpsBottomUp(arr);
		System.out.println("arr min No Of Jumps should be 2 but " + noOfJumps);
		System.out.println(
				"****************************===============================*******************************************");
		noOfJumps = noOfJumpsBottomUp(arr2);
		System.out.println("arr2 min No Of Jumps  " + noOfJumps);

		System.out.println(
				"****************************===============================*******************************************");
		noOfJumps = noOfJumpsBottomUp(arr3);
		System.out.println("arr3 min No Of Jumps should be 2 but " + noOfJumps);
		System.out.println(
				"****************************===============================*******************************************");
		noOfJumps = noOfJumpsBottomUp(arr4);
		System.out.println("arr4 min No Of Jumps should be 4 but " + noOfJumps);

	}

	private static int noOfJumps(int[] arr, int i, int jumps) {
		if (i >= arr.length - 1)
			return 0;

		/*
		 * if(i== arr.length-1) return 0;
		 */
		int min = Integer.MAX_VALUE;

		for (int j = 1; j <= jumps; j++) {
			if (i + j < arr.length) {
				int currentMin = noOfJumps(arr, i + j, arr[i + j]);
				currentMin = currentMin == Integer.MAX_VALUE ? currentMin : currentMin + 1;

				System.out.println("i " + i + " currentMin " + currentMin + " min " + min);
				min = currentMin < min ? currentMin : min;
			}

		}

		return min;
	}

	private static int noOfJumpsBottomUp(int[] arr) {
		int cache[] = new int[arr.length];
		for (int i = 0; i < cache.length - 1; i++) {
			cache[i] = Integer.MAX_VALUE;
		}
		for (int i = arr.length - 2; i >= 0; i--) {
			int min = Integer.MAX_VALUE;
			int jumps = arr[i];
			for (int j = i + 1; j <= i + jumps && j < arr.length; j++) {
				int currentMin = cache[j];
				if (currentMin != Integer.MAX_VALUE) {
					currentMin = currentMin + 1;
				}
				min = min < currentMin ? min : currentMin;
			}
			cache[i] = min;

		}

		for (int i = 0; i < cache.length; i++) {
			System.out.println(cache[i]);

		}
		return cache[0];
	}

}
