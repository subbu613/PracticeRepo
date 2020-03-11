package com.array.problems;

public class SpiralMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [][] arr= {{1,2,3,4},
					  {12,13,14,5},
				      {11,16,15,6},
				      {10,9,8,7}};
		
		int [][] arr2= {{1,2,3},
					   {12,13,4},
			           {11,16,5},
			           {10,9,8,7}};
		int [][] arr3={{01,02,03,04,05},
			      	   {16,17,18,19,06},
			      	   {15,24,25,20,07},
			           {14,23,22,21,8},
			           {13,12,11,10,9}};

		int [][] arr4={{00,01,02,03,04},
					   {10,11,12,13,14},
					   {20,21,22,23,24},
					   {30,31,32,33,34},
					   {40,41,42,43,44}};
		
		print(arr2);
		
		
		GFG gfg=new GFG();
		//gfg.spiralPrint(5, 5, arr3);
	}

	private static void print(int[][] arr) {
		// TODO Auto-generated method stub
		int length=arr.length;

		int rs=0;
		int re=length-1;
		int cs=0;
		int ce=length-1;


		while(rs<=re && cs<=ce)
		{
			for (int i=cs;i<=ce;i++)
			{
				System.out.print(arr[rs][i]+" ");
			}
			rs++;
			for (int i=rs;i<=re;i++)
			{
				System.out.print(arr[i][ce]+" ");
			}
			ce--;
			for (int i=ce;i>=cs;i--)
			{
				System.out.print(arr[re][i]+" ");
			}
			re--;
			for (int i=re;i>=rs;i--)
			{
				System.out.print(arr[i][cs]+" ");
			}
			cs++;

		}


		
		/*for (int i=0,j=0,start=0,end=length-1; start<=end ;i++,j++,start++,end--)
		{
			System.out.println("Start of round i "+i+" j is "+j+" start "+start+" end is "+end);
			while(j<=end)
			{
				System.out.println("while 1 before increment i is "+i+" j is "+j);
				System.out.println(arr[i][j++]);
				System.out.println("while 1 after increment i is "+i+" j is "+j);
			}
			i++;
			while(i<=end)
			{
				System.out.println("while 2 before increment i is "+i+" j is "+j);

				System.out.println(arr[i++][j]);
				System.out.println("while 2 after increment i is "+i+" j is "+j);
			}
			j++;
			while(j>=start)
			{
				System.out.println("while 3 before increment i is "+i+" j is "+j);
				System.out.println(arr[i][j--]);
				System.out.println("while 3 after increment i is "+i+" j is "+j);
			}
			i--;
			while(i>=start)
			{
				System.out.println("while 4 before increment i is "+i+" j is "+j);
				System.out.println(arr[i--][j]);
				System.out.println("while 4 after increment i is "+i+" j is "+j);
			}
			j--;
			System.out.println("end of round i "+i+" j is "+j+" start "+start+" end is "+end);

		}*/
		
	}

	
}



class GFG  
{ 
    // Function print matrix in spiral form 
    static void spiralPrint(int m, int n, int a[][]) 
    { 
        int i, k = 0, l = 0; 
        /*  k - starting row index 
        m - ending row index 
        l - starting column index 
        n - ending column index 
        i - iterator 
        */
           
        while (k < m && l < n) 
        { 
            // Print the first row from the remaining rows 
            for (i = l; i < n; ++i) 
            { 
                System.out.print(a[k][i]+" "); 
            } 
            k++; 
   
            // Print the last column from the remaining columns  
            for (i = k; i < m; ++i) 
            { 
                System.out.print(a[i][n-1]+" "); 
            } 
            n--; 
   
            // Print the last row from the remaining rows */ 
            if ( k < m) 
            { 
                for (i = n-1; i >= l; --i) 
                { 
                    System.out.print(a[m-1][i]+" "); 
                } 
                m--; 
            } 
   
            // Print the first column from the remaining columns */ 
            if (l < n) 
            { 
                for (i = m-1; i >= k; --i) 
                { 
                    System.out.print(a[i][l]+" "); 
                } 
                l++;     
            }         
        } 
    } 
    
}