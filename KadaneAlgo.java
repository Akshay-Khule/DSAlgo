package com.sortalgo;

public class KadaneAlgo {

	public static void main(String[] args) {
		int[] array = {-2, -3, 4, -1, -2, 1, 5,-3};
		int maxSum =0;
		int currentSum=0;		
		for(int i=0; i<array.length; i++) {
			
			currentSum = currentSum + array[i];
			
			if(currentSum > maxSum) {
				maxSum= currentSum;
			}
			
			if(currentSum<0) {
				currentSum =0;
			}
			
		}
		System.out.println(maxSum);
	}

}
