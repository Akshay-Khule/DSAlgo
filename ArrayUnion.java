package com.ds.algo.akshay;

public class ArrayUnion {

	public static void main(String[] args) {
		int[] array1 = {1, 3, 5, 6};
		int n= array1.length;
		int[] array2 = {2,3,4,5};
		int m= array2.length;
		
		Union(array1, array2, n, m);
		

	}

	private static void Union(int[] array1, int[] array2, int n, int m) {
		int i=0;
		int j=0;
		while(i<n & j<m) {
			if(array1[i]<array2[j]) {
				System.out.println(array1[i]);
				i++;
			}else if(array1[i]>array2[j]) {
				System.out.println(array2[j]);
				j++;
			}else if(array1[i]==array2[j]) {
				System.out.println(array2[j]);
				i++;
				j++;
			}
			
		}
		
	}

}
