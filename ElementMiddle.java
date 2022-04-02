package com.sortalgo;

public class ElementMiddle {

	public static void main(String[] args) {

		int array[] = {6, 2, 5, 4, 7, 9, 11, 8, 10};
		int len = array.length;
		int k =findElement(array, len);
		System.out.println("small"+ k);
	}

	private static int findElement(int[] array, int n) {
		

//		 int arrayLeft[]=new int[n];
//		 arrayLeft[0]=Integer.MIN_VALUE; 
//		 
//		 for(int i=1; i<n; i++) {
//			 arrayLeft[i]=Math.max(arrayLeft[i-1], array[i-1]);
//			 System.out.println(arrayLeft[i]);
//		 }
		 
		
		 int arrayRight[]=new int[n];
		 arrayRight[0]=Integer.MAX_VALUE; 
		return n;
		
		
	}

}
