package com.sortalgo;

public class RemoveDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int array[] = {1, 2, 2, 3, 4, 4, 4, 5, 5}; 
        int n = array.length; 
          
        n = removeDuplicates(array, n);
        
        for (int i=0; i<n; i++) 
           System.out.print(array[i]+" "); 
	}

	
	private static int removeDuplicates(int[] array, int n) {
		int j=0;
		for(int i=0; i<array.length-1; i++) {
			if(array[i]!=array[i+1]) {
				array[j]=array[i];
				j++;
			}

		}
		array[j]=array[array.length-1];
		j++;
		
		return j;
	}

}
