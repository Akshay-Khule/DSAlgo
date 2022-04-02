package com.sortalgo;

import java.util.Arrays;

public class Sort012 {
	
	public static void sortMe(int array[], int end){
		int low=0;
		int mid=0;
		int high=1;
		
		while(mid <= end) {
			if(array[mid] < high) {
				swap(array, low, mid);
                ++low;
                ++mid;
				
			}else if (array[mid] > high) {
				swap(array, mid, end);
				--end;
			}else {
				++mid;
			}
		}
	}

	private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
		
		
	}

	public static void main(String[] args) {
		 //TODO Auto-generated method stub
		
		int array[] = {2, 1, 1 , 0, 1, 2, 1, 2, 0, 0, 0, 1};
		int len = array.length-1;
		sortMe(array,len);
		System.out.println(Arrays.toString(array));	
	}

}
