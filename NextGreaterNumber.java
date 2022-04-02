package com.sortalgo;

import java.util.Arrays;

public class NextGreaterNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        char array[] = { '2','1','8','7','6','5' }; 
        int n = array.length; 
        findNextNumber(array, n); 
	}

	private static void findNextNumber(char[] array, int n) {

		int i;
		for(i=n-1; i>0; i--) {
			if(array[i]> array[i-1]) {
				break;
			}
			
		}
		
		int element = array[i-1];
		int min = i;
		

		for(int j=i+1; j<n; j++ ) {
			if(array[j] < array[min] ) {
				min=j;
			}
		}
		
		swap(array,i-1, min);
		Arrays.sort(array, i, n);
		
		for( i=0; i<n;i++) {
			System.out.println(array[i]);
		}
		

		
	}

	private static void swap(char[] array, int i, int j) {
		char temp = array[i];
		array[i] = array[j];
		array[j]= temp;
		
	}

}
