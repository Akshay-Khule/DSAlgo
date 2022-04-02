package com.sortalgo;

public class MyNextSmallestPalindrome {

	public static void main(String[] args) {

	    int array[] = {2, 3, 7, 4, 9}; 
        nextPalindromeProblem(array, array.length);
        printarray(array);
	}

	private static void nextPalindromeProblem(int[] array, int n) {
		int mid = n/2;
		int  i = mid - 1; 
        int j = (n % 2 == 0 ? mid : mid + 1); 
		int devision =( n % 2);
          
		boolean leftsmall = false;
		
		if(array[i]<array[j]) {
			leftsmall=true;
		}

		int var=0;
		
		if(leftsmall) {
			if(devision==0) {
			var =array[i];
			var = var + 1;
			}else {
				var =array[i+1];
				var = var + 1;
			}
		
		array[i+1]=var;
		
		while(i>=0) {
			array[j++]=array[i--];
		}
		}else {
			while(i>=0) {
				array[j++]=array[i--];
			}
		}
	}
	
    static void printarray(int array[]) { 
        for (int i = 0; i < array.length; i++) 
        System.out.print(array[i]); 
        System.out.println(); 
    } 

}
