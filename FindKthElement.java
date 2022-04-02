package com.sortalgo;

public class FindKthElement {

		int findKthElement(int array[], int low, int high, int k) 
		{ 
			if (k > 0 && k <= high - low + 1) 
			{ 
				int index = randomPartition(array, low, high); 

				if (index-low == k-1) 
					return array[index]; 

				if (index-low > k-1) 
					return findKthElement(array, low, index-1, k); 

				return findKthElement(array, index+1, high, k-index+low-1); 
			} 

			return Integer.MAX_VALUE; 
		} 

		void swap(int array[], int i, int j) 
		{ 
			int temp = array[i]; 
			array[i] = array[j]; 
			array[j] = temp; 
		} 

		int divideArray(int array[], int low, int high) 
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

		int randomPartition(int arr[], int l, int r) 
		{ 
			int n = r-l+1; 
			int pivot =0;
			swap(arr, l + pivot, r); 
			return divideArray(arr, l, r); 
		} 


		public static void main(String args[]) 
		{ 
			FindKthElement ob = new FindKthElement(); 
			int array[] = {54, 26, 93, 17, 77, 31, 44, 20, 55}; 
			int n = array.length,k = 4; 
			System.out.println("K'th smallest element is "+ 
					ob.findKthElement(array, 0, n-1, k)); 
		}
	}
