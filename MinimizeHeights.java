package com.ds.algo.akshay;

import java.util.*;

 
class MinimizeHeights
{
    public static int getMinimizeHeights(int array[], int n, int k)
    {
    	Arrays.sort(array);
    	int max = array[n-1];
    	int min = array[0];
    	int answer=0;
    	
    	int result = max-min;
    	
    	int smallest = array[0]+k;
    	int largest = array[n-1]-k;
    	
    	int mi, ma;
    	
    	for(int i=0; i<n; i++) {
    		max= Math.max(largest , array[n-1]+k);
    		min = Math.min(smallest, array[i]+k);
    		answer = Math.min(result, max-min);
    	}
    	
		return answer;
    	
 
    }
    public static void main(String[] args)
    {
        int array[] = {1, 15, 10};
        int n = array.length;
        int k = 6;
        System.out.println(getMinimizeHeights(array, n, k));
    }
}