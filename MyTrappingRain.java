package com.ds.algo.akshay;

public class MyTrappingRain {
	 
	public static void main(String[] args) {
		int array[] = new int[] {5,3,4,6,3,6}; 
		  System.out.println("Maximum water " + findWater(array.length, array)); 

	}
	private static int findWater(int length, int[] array) {
		int n = length;
		int result=0;
		
		int maxright[] = new int[n];
		int maxleft[] = new int[n];
		

		
		maxleft[0]=array[0];
		for(int i=1; i<n; i++) {
			maxleft[i]=Math.max(maxleft[i-1], array[i]);
		}
		
		maxright[n-1] = array[n-1];
		for(int i=n-2; i>=0; i--) {
			maxright[i]=Math.max(maxright[n-1], array[i]);
		}		
		
		for(int i=1; i<n-1; i++) {
			 result= result+Math.min(maxleft[i], maxright[i]) - array[i];
		}
		return result;
	}

}
