package com.array.sort.classes;

import java.util.Date;

public class InsersionSort<K>  extends AbstractSort<K>  {

	
	public InsersionSort(K[] ar) {
		super(ar);
		// TODO Auto-generated constructor stub
	}

	@Override
	public K[] sort(K[] arr) {

		long start=new Date().getTime();
		System.out.println("start time "+start);
		int count=0;
		// TODO Auto-generated method stub
		System.out.println("******&&&&&&&&&&&&&&&&&&&&&&&&&&& Doing Insersion Sort &&&&&&&&&&&&&&&&&&&&&&&&&&&***********");
		printArray();
		System.out.println("**********************************************");
		for (int i = 1; i < arr.length; i++) {
			System.out.println(" i is "+i);
			
			for (int j = i; j >0; j--) {
				count++;
				if(compare(j-1, j))
					swap(j, j-1);
				else
					break;
				
			}
			
			printArray();
		}
		long end=new Date().getTime();
		System.out.println("end time "+end);
		System.out.println("total time "+(end-start));
		System.out.println("Count is "+count);
		System.out.println("**********************************************");
		printArray();
		System.out.println("***************************************** End of Insersion Sort *****************************************");
		return null;
	
	}

}
