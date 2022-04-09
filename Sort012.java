package com.ds.algo.akshay;

public class Sort012 {

	public static void main(String[] args) {
		int array[]= {0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1};
		int n = array.length;
		sort012(array, 0, n-1, 0 );
		 printArray(array, n);
	}

	private static void printArray(int[] array, int n) {
        int i;
        for (i = 0; i < n; i++)
            System.out.print(array[i] + " ");
        System.out.println("");
		
	}

	private static void sort012(int[] array, int low, int high, int mid) {
	
		while (mid <= high) {

			if(array[mid]==0) {
				int temp = array[low];
				array[low] = array[mid];
				array[mid]= temp;
				low++;
				mid++;
			}
			else if(array[mid]==1) {
				mid++;
			}
			else if(array[mid]==2) {
				int temp = array[mid];
				array[mid]= array[high];
				array[high]=temp;
				high--;
			}
		}

		
	}

}
