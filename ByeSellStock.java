package com.sortalgo;

import java.util.ArrayList;
import java.util.List;

public class ByeSellStock {
	
	static class Result{
		int sell;
		int bye;
	}

	public static void main(String[] args) {
        int array[] = { 98, 178, 250, 300, 40, 540, 690 }; 
        int n = array.length; 
        ByeSellStock stock = new ByeSellStock();
        stock.findProfit(array, n); 
	}

	private void findProfit(int[] array, int n) {
		List<Result> list = new ArrayList<Result>();

		
		for(int i=0;i<n;i++) {
			Result result = new Result();
			if(i==n-1)
				break;
			
			while(array[i+1]<=array[i]) {
				i++;
			}
			result.bye=i;
			list.add(result);
			

			while(array[i+1]>=array[i]) {
				i++;
				if(i==n-1)
					break;
			}
			
			result.sell=i;
			list.add(result);

		}
		

		for(int i=0; i<list.size(); i++) {
			System.out.println(i);
		}
		
		
	}

}
