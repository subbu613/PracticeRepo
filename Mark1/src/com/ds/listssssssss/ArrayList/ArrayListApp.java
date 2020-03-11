package com.ds.listssssssss.ArrayList;

public class ArrayListApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayListImpl arrayList = new ArrayListImpl();

		arrayList.add(1);
		arrayList.add(2);
		arrayList.add(3);
		arrayList.add(4);

		System.out.println("array elements are ");
		arrayList.printArr();

		arrayList.deleteAtIndex(1);

		System.out.println("array elements after deleteing index 1  are ");
		arrayList.printArr();

		arrayList.insertAtIndex(1, 99);

		System.out.println("array elements after inseting 99 at index 1  are ");
		arrayList.printArr();
	}

}
