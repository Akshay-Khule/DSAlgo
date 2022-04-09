package com.ds.algo.akshay;

import java.util.Arrays;

public class MergeSortedArray {

	public static void main(String[] args) {

		
		int arr1[] = {1, 3, 5, 7};
		int arr2[] = {0, 2, 6, 8, 9};
				
		int N = 4, M = 5;
		int i=N-1; int j=0;
		
		while(i>=0 &&j<M) {
			if(arr1[i]>arr2[j]) {
				int temp = arr1[i];
				arr1[i]=arr2[j];
				arr2[j]=temp;
				i--;
				j++;
				
			}else {
				i--;
				j++;
			}

		}
		Arrays.sort(arr2);
		Arrays.sort(arr1);
		System.out.println(arr1);
		System.out.println(arr2);
		

	}

}
