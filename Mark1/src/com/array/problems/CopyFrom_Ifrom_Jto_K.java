package com.array.problems;

public class CopyFrom_Ifrom_Jto_K {

	public static void main(String[] args) {
		int arr[]= {0,1,2,3,4,5,6,7,8,9,10};
		int expectedArr[]= {0,1,2,3,2,3,4,5,6,7,10};
									
		int from=2;
		int to=7;
		int newFrom=4;
		System.out.print("original: ");
		printArray(arr);
		coppy(from,to,newFrom,arr);
		
		System.out.print("output:   ");
		printArray(arr);
		System.out.print("expected: ");
		printArray(expectedArr);
		
		
		
		System.out.println("********************* when to is out of array boundaries ********************************");
		
		
		 from=2;
		 to=11;
		 newFrom=4;
		  int arr2[]= {0,1,2,3,4,5,6,7,8,9,10};
  int expectedArr2[]= {0,1,2,3,2,3,4,5,6,7,8};
		System.out.print("original: ");
		printArray(arr2);
		coppy(from,to,newFrom,arr2);
		
		System.out.print("output:   ");
		printArray(arr2);
		System.out.print("expected: ");
		printArray(expectedArr2);
		
		System.out.println("********************* when newFrom is before from ********************************");
		
		
		 from=4;
		 to=11;
		 newFrom=2;
		  int arr3[]= {0,1,2,3,4,5,6,7,8,9,10};
  int expectedArr3[]= {0,1,4,5,6,7,8,9,10,9,10};
		System.out.print("original: ");
		printArray(arr3);
		coppy(from,to,newFrom,arr2);
		
		System.out.print("output:   ");
		printArray(arr3);
		System.out.print("expected: ");
		printArray(expectedArr3);
		
		
		
		System.out.println("********************* when newFrom is after to ********************************");
		
		
		 from=2;
		 to=6;
		 newFrom=7;
		  int arr4[]= {0,1,2,3,4,5,6,7,8,9,10};
  int expectedArr4[]= {0,1,2,3,4,5,6,2,3,4,5};
		System.out.print("original: ");
		printArray(arr4);
		coppy(from,to,newFrom,arr2);
		
		System.out.print("output:   ");
		printArray(arr4);
		System.out.print("expected: ");
		printArray(expectedArr4);
		
	}
	
	private static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}

	static void coppy(int from,int to,int newFrom, int[] arr) {
		
		if(from>arr.length || to<from)
		{
			System.out.println("newFrom is less than from or to is less than from");
			return;
		}
		int j=to<arr.length ? newFrom+to-from:arr.length-1;
		to=to<arr.length?to:arr.length-1-from;
		for (;j>=newFrom;j--) {
			arr[j]=arr[to--];
		}
		
	};
	
}
