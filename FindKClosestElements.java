package com.ds.algo.akshay;

import java.util.LinkedList;
import java.util.List;

public class FindKClosestElements {

	public static void main(String[] args) {

		int[] arr = {1,2,3,4,5,6};
		int k = 4, x = 3;
		
		findClosestElements(arr, k, x);
	}
    public static List<Integer> findClosestElements(int[] arr, int k, int x) {
		
    	int i=0;
    	int j=arr.length-1;
    	List<Integer> list = new LinkedList<Integer>();
    	
    	while(i!=j) {
    		if((Math.abs(arr[i]-x)<Math.abs(arr[j]-x))) {
    			i++;
    		}else if ((Math.abs(arr[i]-x)>Math.abs(arr[j]-x))){
    			j--;
    		}else if ((Math.abs(arr[i]-x)==Math.abs(arr[j]-x))) {
    			if  ((Math.abs(arr[i])<Math.abs(arr[j])))  {
    				i++;
    			}
    		}
    	}
    	
    	for(int h=0;h<i;h++ ) {
    		list.add(arr[h]);
    	}
    	
    	return list;
        
    }
}
