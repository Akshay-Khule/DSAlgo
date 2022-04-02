package com.sortalgo;

import java.util.Arrays;

public class TrainsDepArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] arrival = { 100, 140, 150, 200, 215, 400 };
        int[] departure = {110, 300, 220, 230, 315, 600};
        int n = arrival.length; 
         
	    Arrays.sort(arrival); 
	    Arrays.sort(departure); 	
         
         minimumPlatform(arrival,departure,n );
	}

	private static void minimumPlatform(int[] arrival, int[] departure, int n) {
		int i=0;
		int j=0;
		int platform=1, maxPlatform = 1; ;

		while(i<n && j<n) {
			if(arrival[i]<departure[j]) {
				platform++;
				i++;
			}else  {
				platform--;
				j++;
			}
		}
		System.out.println("Platform required:"+ platform);

		
	}

}
