package com.sortalgo;

public class WithoutKadaneAlgo {

	public static void main(String[] args) {
		int[] array = {-2, -3, 4, -1, -2, 1, 5,-3};
		int max=0;

		for(int i=0; i<array.length-1; i++) {
			int currentsum=0;
			for(int j=i; j<array.length-1; j++) {
				currentsum = currentsum+ array[j];
			}
			if(currentsum >max) {
				max= currentsum;
			}
		}
		
		System.out.println(max);
	}

}
