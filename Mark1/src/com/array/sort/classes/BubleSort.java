package com.array.sort.classes;

import java.util.Date;

public class BubleSort<K> extends AbstractSort<K> {

	public BubleSort(K[] arr)
	{
		super(arr);
	}
	@Override
	public K[] sort(K[] arr) {
		long start=new Date().getTime();
		System.out.println("start time "+start);
		int count=0;
		System.out.println("******&&&&&&&&&&&&&&&&&&&&&&&&&&& Doing Bubble Sort &&&&&&&&&&&&&&&&&&&&&&&&&&&&&***********");
		printArray();
		System.out.println("**********************************************");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(" i is "+i);
			for (int j = 0; j < arr.length-i-1; j++) {
				count++;
				if(compare(j,j+1))
					swap(j,j+1);
				System.out.println("         j is "+j);
				printArray();
			}
			System.out.println("**********************************************");
		}
		long end=new Date().getTime();
		System.out.println("end time "+end);
		System.out.println("total time "+(end-start));
		System.out.println("Count is "+count);
		System.out.println("******End of Bubble Sort***********");
		printArray();
		System.out.println("**********************************************");
		return null;
	}
	
	

}
