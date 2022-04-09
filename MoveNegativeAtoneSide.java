package com.ds.algo.akshay;

public class MoveNegativeAtoneSide {

	public static void main(String[] args) {
	int[] array = {-4, 1, -3, -7, 8, 5, -9, 3, -8};
	
	MoveNegative(array, array.length);
	printArray(array);

	}

	private static void printArray(int[] array) {
		for(int i=0; i<=array.length-1; i++) {
			System.out.println(array[i]);
		}
		
	}

	
	private static void MoveNegative(int[] array, int n) {
		
		int j=0;
		int temp;
		for(int i=0; i<=n-1; i++) {
			if(array[i]<0) {
				temp = array[j];
				array[j]=array[i];
				array[i]=temp;
				j++;
			}
		}
		
	}



}
