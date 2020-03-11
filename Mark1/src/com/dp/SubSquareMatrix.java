package com.dp;

public class SubSquareMatrix {

	public static void main(String[] args) {
		   boolean arr[][] = {
				   				{false,true,false,true},
				   				{false,true,true,true},
				   				{true ,true,true,true},
				   				{true ,true,true,true},
				   			 };
		   boolean arr2[][] = {
	   				{false,true,false},
	   				{false,true,true},
	   				{true ,true,true},
	   				{true ,true,true},
	   			 };
		   
		    printMatrix(arr);
		    
		    int [][] cache=new int[arr.length][arr[0].length];
		    System.out.println("Printing all the possible sub square matrixe's ");
		    int max=0;
		    for (int k = 0; k < arr.length; k++) {
				for (int k2 = 0; k2 < arr[0].length; k2++) {
					System.out.println("hi");
					int n=findAllSubSquareMatrixes(arr,k,k2);
				    
				    
				    if(n>0)
					{
						printMatrix(arr, k, k2,n);
					}
				    System.out.println("======================================================================================================================================");
				   int maxSubSquareMatrix=subSquareMatrixBruteForce(arr2, k, k2, 0,cache) ;
				max=   max>maxSubSquareMatrix ? max:maxSubSquareMatrix;
				}
			}
		    
		    System.out.println("max length of the sub square matrix is "+max);
		    
		    System.out.println("============================================== Bottom up approach is ========================================== ");  
		  max=  bottomUp(arr);
		System.out.println("max length of the square matrix is "+max);  
	}

	private static int findAllSubSquareMatrixes(boolean[][] arr, int i, int j) {
		// TODO Auto-generated method stub
		if(i==arr.length || j==arr[0].length)
		{
			return 0;
		}
		
		int n=Math.min(Math.min(findAllSubSquareMatrixes(arr, i+1, j), findAllSubSquareMatrixes(arr, i, j+1)),findAllSubSquareMatrixes(arr, i+1, j+1));
		
		System.out.println("i "+i+" j "+j+" n "+(n+1));
		return n+1;
	}

	private static int subSquareMatrixBruteForce(boolean[][] arr,int i,int j,int n,int[][] cache) {
		for (int k = 0; k < n; k++) {
			System.out.print("*");
		}
		System.out.println("in method i "+i+" j "+j);
		if(i==arr.length || j==arr[0].length)
		{
			System.out.println("returning");
			return 0;
		}
		if(!arr[i][j])
			return 0;
		if(cache[i][j]>0)
			return cache[i][j];
		else
		{
		return cache[i][j]= 1 + Math.min(
				Math.min(
				subSquareMatrixBruteForce(arr, i+1, j,n+20,cache),
		//System.out.println("end of first part");
		subSquareMatrixBruteForce(arr, i, j+1,n+20,cache)
		//System.out.println("end of second part");
		),//min of i+1,j and i,j+1
		subSquareMatrixBruteForce(arr, i+1, j+1,n+20,cache)
		//System.out.println("end of third part");
				);// min of (i+1,j and i,j+1) and i+1,j+1
		}
		
	}
	
	private static int bottomUp(boolean[][] arr) {
		
		int[][] cache=new int[arr.length][arr[0].length];
		int max=0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				if(i==0 || j==0)
					cache[i][j]=arr[i][j] ? 1 : 0;
				else if(arr[i][j])
				{
						cache[i][j]=1+Math.min(Math.min(cache[i-1][j], cache[i][j-1]), cache[i-1][j-1]);
						max= max > cache[i][j] ? max : cache[i][j];
				}
				
			}
		}
		return max;
	}

	private static void printMatrix(boolean[][] arr) {
System.out.println("Matrix is ");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				System.out.print("i "+i+" j "+j+" "+arr[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("******************************************************************************************");
	}
	
	private static void printMatrix(boolean[][] arr,int i1 ,int j1, int n) {
		System.out.println("Matrix is n "+n+" i "+i1+" j "+j1);
		int i=i1;
				for (; i<arr.length && i <= i1+n; i++) {
					int j=j1;
					for ( ;  j<arr[i].length && j <= j1+n ; j++) {
						System.out.print("i "+i+" j "+j+" "+arr[i][j]+" ");
					}
					System.out.println();
				}
				System.out.println("******************************************************************************************");
			}
	
}
