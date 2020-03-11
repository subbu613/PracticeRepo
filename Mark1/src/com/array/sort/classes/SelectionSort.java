package com.array.sort.classes;

import java.util.Date;

public class SelectionSort<K> extends AbstractSort<K> {

	
	public SelectionSort(K[] arr) {
		// TODO Auto-generated constructor stub
		super(arr);
	}

	




	@Override
	public K[] sort(K[] arr) {
		long start=new Date().getTime();
		System.out.println("start time "+start);
		int count=0;
		// TODO Auto-generated method stub
		System.out.println("******&&&&&&&&&&&&&&&&&&&&&&&&&&& Doing Selection Sort &&&&&&&&&&&&&&&&&&&&&&&&&&&***********");
		printArray();
		System.out.println("**********************************************");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(" i is "+i);
			int idx=i;
			for (int j = i+1; j < arr.length; j++) {
				count++;
				if(compare(idx, j))
					idx=j;
				System.out.println("         j is "+j+" idx is "+idx);
			}
			System.out.println(" swaping i "+i+" with idx "+idx );
			
			swap(idx, i);
			printArray();
		}
		long end=new Date().getTime();
		System.out.println("end time "+end);
		System.out.println("total time "+(end-start));
		System.out.println("Count is "+count);
		System.out.println("**********************************************");
		printArray();
		System.out.println("***************************************** End of Selection Sort *****************************************");
		return null;
	}

}
