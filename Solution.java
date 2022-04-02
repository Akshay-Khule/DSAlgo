package com.sortalgo;

public class Solution {
	static long trappingWater(int arr[], int n) { 
     	int maxright[] = new int[n];
		int maxleft[] = new int[n];
		maxright[n-1] = arr[n-1];
		for(int i=n-2; i>=0; i--) {
			maxright[i]=Math.max(maxright[n-1], arr[i]);
		}
		
		maxleft[n-arr.length]=arr[n-arr.length];
		for(int i=1; i<=n-1; i++) {
			maxleft[i]=Math.max(maxleft[i-1], arr[i]);
		}
		int result=0;
		for(int i=1; i<n-1; i++) {
			 result= result+Math.min(maxleft[i], maxright[i]) - arr[i];
		}
		return result;
		

        
    }


}
