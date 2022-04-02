package com.sortalgo;

public class MaximumSumSubarray {

	public static void main(String[] args) {

        int [] a = {-5,6,-7,1,4,-8,16}; 
        System.out.println("Maximum contiguous sum is " + maxSubArraySum(a)); 		

	}

	private static int maxSubArraySum(int[] array) {
		int resultSum=Integer.MIN_VALUE;
		int intermediateSum=0;
		
		for(int i=0; i<array.length; i++) {
			
			
			
			intermediateSum = intermediateSum + array[i];
			
			if(array[i]>intermediateSum) {
				intermediateSum = array[i];
			}
			if(intermediateSum>resultSum) {
				resultSum=intermediateSum;
			}
			
		}
		
		return resultSum;
	}

}
