package com.sortalgo;

public class MySortedImpl {
	
	private static int binarySearch(int[] array, int low, int high, int key) {
	if(low>high) {
		return -1;
	}
	int mid = (low + high)/2;
		if(key == array[mid]) {
		return mid;
	}
	else if(key < array[mid]) {
		return binarySearch(array, low, mid-1, key);
	}else {
		return binarySearch(array, mid+1, high, key);
	}
		
	
	}
	
    public static void main(String[] args)
    {
        int[] A = { 2, 3, 4, 5, 6, 7, 8, 9, 10 };
   int key = 4;
 
        int low = 0;
        int high = A.length - 1;

        int index = binarySearch(A, low, high, key);
 
        if (index != -1) {
            System.out.println("Element found at index " + index);
        } else {
            System.out.println("Element not found in the array");
    }
    }


}
