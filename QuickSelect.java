package com.sortalgo;

import java.util.HashMap;
import java.util.Map;

public class QuickSelect {

	public static void main(String[] args) {
		
        int array[] = {2, 3, 2, 4, 5, 3, 3, 4},  k = 3; 
        
        distinctElement(array, k); 

	}

	private static void distinctElement(int[] array, int k) {
		Map<Integer, Integer> map = new HashMap<>();

		int count =0;
		for(int i=0; i<k; i++) {
			int ct=0;
			if(map.get(array[i])==null) {
				map.put(array[i], 1);
				count++;
			}else {
				ct= map.get(array[i]);
				map.put(array[i], ct+1);
			}
			
		}
		System.out.println("Count  :  "+ count);
		
		for(int i=k; i<array.length; i++) {
			int  ct1=0;
			if(map.get(array[i-k])==1) {
				map.remove(array[i-k]);
				count--;
			}else {
				int countx = map.get(array[i-k]);
				map.put(array[i-k], countx-1);
			}
			
			if(map.get(array[i])==null)  {
				map.put(array[i], 1);
				count++;
			}else {
				int ctxwc= map.get(array[i]);
				map.put(array[i],ctxwc+ 1);
			}
			System.out.println("count---"+ count);
		}
		
		
	}

}
