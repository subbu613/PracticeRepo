package com.dp;

public class LongestCommonString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = "abcdxyz";

		//divideAndConcure(s1);

		String a = "xyzcabcde";
		String b = "abxycdxycabcdee";
		
		/*a="xyzaz";
		b="xayazz";*/
		
		
		
		//System.out.println("Longest Common SubString Length is " + longestCommonSubStringBruteForce(a, b));
		
		
		System.out.println("Longest Common SubString Length is " + longestCommonSubStringDP(a, b));
		
		//System.out.println("Longest Common SubString Length is " + longestCommonSubStringRecrsionBruteForceSolution(a, b));
		
		//System.out.println("Longest Common SubString Length is " + longestCommonSubStringRecrsion(a, b));

	}

	private static void divideAndConcure(String s1) {

		if (s1.length() <= 0 && s1.length() >= s1.length())
			return;

		char[] arr = s1.toCharArray();

		for (int i = 0; i < arr.length; i++) {
			// System.out.println("i is "+i);
			// String s=s1.substring(i,s1.length()-1);
			String s = s1.substring(0, i);
			printSpaces(i);
			System.out.println(s);

			divideAndConcure(s);
		}

	}

	public static void printSpaces(int i) {
		for (int j = 0; j < i; j++) {
			System.out.print("*");
		}

	}

	public static int longestCommonSubStringRecrsion(String a, String b) {
		int [][] cache = new int[a.length()][b.length()];
		
		for(int k =0; k < a.length();k++)
			for(int l =0;l < b.length();l++)
				cache[k][l] = -1;
		
		return longestCommonSubStringRecrsion(a.toCharArray(), b.toCharArray(), 0, 0,cache,0 );

	}

	public static int longestCommonSubStringRecrsion(char[] a, char[] b, int i, int j, int[][] cache, int maxx) {
		// int maxx=0;
		
		/*a="xyzaz";
		b="xayazz";
		
		*
		String a = "xyzcabcde";
		String b = "abxycdxycabcdee";*/
		
		if (i < a.length && j < b.length) {
						
			if (a[i] == b[j]) {
				if (cache[i][j] == -1) {
					System.out.println("from equals condition i " + i + " j " + j + " maxx " + maxx);
					maxx = longestCommonSubStringRecrsion(a, b, i + 1, j + 1, cache, maxx + 1);
					System.out.println("from equals condition Maxx " + maxx);
				}else {
						System.out.println("i " + i + " j " + j + " " + cache[i][j]);
						return cache[i][j] + maxx;
					}
			}

				if(cache[i][j] != -1)
				{
					System.out.println("i is "+i+" j is "+j+" max is "+maxx+" cache is "+cache[i][j]);
					return maxx > cache[i][j] ? maxx: cache[i][j];
				}
			maxx = Math.max(maxx, Math.max(longestCommonSubStringRecrsion(a, b, i, j + 1, cache, 0),
					longestCommonSubStringRecrsion(a, b, i + 1, j, cache, 0)));
			cache[i][j] = maxx;
			} 
		

		System.out.println("i " + i + " j " + j);
		System.out.println(maxx);
		return maxx;
	}

	public static int longestCommonSubStringBruteForce(String a, String b) {
		int max = Integer.MIN_VALUE;
		if (a != null && a.length() > 0 && b != null && b.length() > 0) {
			char aArr[] = a.toCharArray();
			char bArr[] = b.toCharArray();

			for (int i = 0; i < aArr.length; i++) {

				for (int j = i; j < aArr.length; j++) {
					System.out.println("i " + i + " j " + j);
					printLetters(aArr, i, j);
					int current = compareWithAnotherString(aArr, i, j, bArr);
					System.out.println(" flag is " + current);
					max = max > current ? max : current;

				}
			}
		}

		return max;
	}

	private static int compareWithAnotherString(char[] aArr, int i, int j, char[] bArr) {
		// TODO Auto-generated method stub
		boolean flag = false;

		// int k=i;
		for (int no = 0; no < bArr.length; no++) {
			int b = no;
			flag = true;
			for (int a = i; a <= j && b < bArr.length; a++, b++) {
				if (aArr[a] != bArr[b]) {
					flag = false;
					break;
				}
			}
			if (flag) {
				return j - i + 1;
			}
		}
		return 0;
	}

	private static void printLetters(char[] aArr, int i, int j) {
		// TODO Auto-generated method stub
		for (int k = i; k <= j; k++) {
			System.out.print(aArr[k]);
		}
		System.out.println();

	}
	
	
	public static int longestCommonSubStringRecrsionBruteForceSolution(String a, String b) {
		int [][] cache = new int[a.length()][b.length()];
		
		for(int k =0; k < a.length();k++)
			for(int l =0;l < b.length();l++)
				cache[k][l] = -1;
		
		return longestCommonSubStringRecrsion(a.toCharArray(), b.toCharArray(), 0, 0,cache,0 );

	}
	public static int longestCommonSubStringRecrsionBruteForceSolution(char[] a, char[] b, int i, int j, int[][] cache, int maxx) {
		// int maxx=0;
		
		/*a="xyzaz";
		b="xayazz";
		
		*
		String a = "xyzcabcde";
		String b = "abxycdxycabcdee";*/
		
		if (i < a.length && j < b.length) {
						
			if (a[i] == b[j]) {
					System.out.println("from equals condition i " + i + " j " + j + " maxx " + maxx);
					maxx = longestCommonSubStringRecrsion(a, b, i + 1, j + 1, cache, maxx + 1);
					System.out.println("from equals condition Maxx " + maxx);
			}

			maxx = Math.max(maxx, Math.max(longestCommonSubStringRecrsion(a, b, i, j + 1, cache, 0),
					longestCommonSubStringRecrsion(a, b, i + 1, j, cache, 0)));
			} 
		

		System.out.println("i " + i + " j " + j);
		System.out.println(maxx);
		return maxx;
	}
	
	public static int longestCommonSubStringDP(String a, String b)
	{
		int cache[][] = new int[a.length()+1][b.length()+1];
		System.out.println(cache.length+" "+cache[0].length);
	//	int max = Integer.MIN_VALUE;
		if (a != null && a.length() > 0 && b != null && b.length() > 0) {
			char aArr[] = a.toCharArray();
			char bArr[] = b.toCharArray();

			for (int i =0; i < aArr.length; i++) {

				for (int j = 0; j < bArr.length; j++) {
					int max = Integer.MIN_VALUE;
					if(aArr[i]==bArr[j])
					{
						max = cache[i][j]+1;
					}
					cache[i+1][j+1]	= Math.max(max,Math.max(cache[i][j+1], cache[i+1][j]));
					
				}
			}
		}
		
		printCache(cache);
		return cache[a.length()][b.length()];
	}

	private static void printCache(int[][] cache) {
		// TODO Auto-generated method stub
		
		for (int i = 0; i < cache.length; i++) {
			for (int j = 0; j < cache[i].length; j++) {
				System.out.print(cache[i][j]+" ");
				
			}
			System.out.println();
		}
		
	}
}
