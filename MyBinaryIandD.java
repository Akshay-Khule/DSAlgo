package com.sortalgo;

public class MyBinaryIandD {

	public static void main(String[] args) {
	
		int[] array = {6, 9,15, 25, 35, 50, 41, 29, 23, 8};

		int n = array.length;
		System.out.println(findMax(array, 0, n-1));
		
	}

	private static int findMax(int[] array, int start, int end) {
		
		int mid = (start+end)/2;

		if(array[mid]>array[mid+1]&&array[mid]>array[mid-1]) {
			return array[mid];
		}else if (array[mid]<array[mid-1] && array[mid]>array[mid+1]){
			return findMax(array, start, mid-1);
		}else {
			return findMax(array, mid+1, end);
		}

		
	}

}
