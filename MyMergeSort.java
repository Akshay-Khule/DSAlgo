package com.sortalgo;

import java.util.Arrays;

public class MyMergeSort {
	
	 public static void merge(int[] arr, int[] aux, int low, int mid, int high) {
		 int k = low, i= low, j=mid+1;
		 
		 while(i<=mid && j<high) {
			 if(arr[i]<= arr[j]) {
				 aux[k++]=arr[i++] ;
			 }else {
				 aux[k++] = arr[j++]; 
			 }
		 }
		 
		 while(i<=mid) {
			 aux[k++] =arr[i++];
			 
		 }
		 while(j<=mid) {
			 aux[k++] =arr[j++];
			 
		 }
		 for(i=low; i<=high; i++) {
			 arr[i]=aux[i];
		 }
		 
	 }
	
	private static void mergeSort(int[] arr, int[] aux, int low, int high) {
		// TODO Auto-generated method stub
		if(high ==low ) {
			return;
		}
		
		int mid = (low + high)/2;
		mergeSort(arr, aux, low, mid);
		mergeSort(arr, aux, mid+1, high);
	}
	
	 public static boolean isSorted(int[] arr)
	    {
	        int prev = arr[0];
	    for (int i = 1; i < arr.length; i++) {
	            if (prev > arr[i]) {
	                System.out.println("MergeSort Fails!!");
	                return false;
	            }
	            prev = arr[i];
	        }

	    return true;
	    }	
	
    public static void main(String[] args)
    {
        int[] arr = {8,4,3,12};
        int[] aux = Arrays.copyOf(arr, arr.length);

         //sort array 'arr' using auxiliary array 'aux'
        mergeSort(arr, aux, 0, arr.length - 1);
        if (isSorted(arr)) {
            System.out.println(Arrays.toString(arr));
        }

    }



}
