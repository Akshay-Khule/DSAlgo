package com.sortalgo;

public class MyKthImplimentation {

	public static void main(String[] args) {

		MyKthImplimentation ob = new MyKthImplimentation(); 
		int array[] = {54, 26, 93, 17, 77, 31, 44, 20, 55}; 
		int n = array.length,k =5; 
		System.out.println("K'th smallest element is "+ 
				ob.findKthElement(array, 0, n-1, k)); 

	}

	private int findKthElement(int[] array, int low, int high, int k) {
		if(k>0 && k<=high-low+1) {

			int index = divideArray(array, low, high);
			if(index-low == k-1) {
				return array[index];
			}
			if(index-low > k-1) {
				return findKthElement(array, low, index-1, k); //we keep low=0 hence I was not getting right answer
			}

			return findKthElement(array,  index+1, high, k-index+low-1);
		}
		return -1;


	}

	private int divideArray(int[] array, int low, int high) {
		int pivot = array[high];
		int i=low;	
		for (int j=low; j<=high-1; j++) {
			if(array[j]<=pivot) {
				swap(array, i, j); 
				i++;
			}
		}
		swap(array, i, high); 
		
		return i;
		
	}

	private void swap(int[] array, int i, int j) {
		int temp = array[i]; 
		array[i] = array[j]; 
		array[j] = temp; 
		
	}

}
