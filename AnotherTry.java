package com.sortalgo;

public class AnotherTry {

	public static void main(String[] args) {
		AnotherTry ob = new AnotherTry(); 
		int array[] = {54, 26, 93, 17, 77, 31, 44, 20, 55}; 
		int n = array.length,k = 4; 
		System.out.println("K'th smallest element is "+ 
				ob.findKthElement(array, 0, n-1, k)); 

	}

	private int findKthElement(int[] array, int low, int high, int k) {
		if (k > 0 && k <= high - low + 1) 
		{ 
			int index = divideArray(array, low, high); 

			if (index-low == k-1) 
				return array[index]; 

			if (index-low > k-1) 
				return findKthElement(array, low, index-1, k); 

			return findKthElement(array, index+1, high, k-index+low-1); 
		} 	
		return -1;
	}

//	private int randomPartition(int[] array, int low, int high) {
//		int pivot =0;
//		swap(array, low+pivot , high); 
//		return  divideArray(array, low, high);
//	}

	private int divideArray(int[] array, int low, int high) {
		{ 
			int x = array[high], i = low; 
			for (int j = low; j <= high - 1; j++) 
			{ 
				if (array[j] <= x) 
				{ 
					swap(array, i, j); 
					i++; 
				} 
			} 
			swap(array, i, high); 
			return i; 
		} 
	}

	private void swap(int[] array, int i, int j) {
		int temp = array[i]; 
		array[i] = array[j]; 
		array[j] = temp; 
		
	}

	

}
