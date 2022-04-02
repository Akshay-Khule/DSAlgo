package com.sortalgo;

public class LargestElemet {

	public static void main(String[] args) {
		int arr[]= {1};
		int n =arr.length;
		
		System.out.println(largest(arr, n));
	}

    public static int largest(int arr[], int n)
    {	int temp = 0;
    	
    
        for(int i=0; i<n-1; i++) {
        	 if(n==1) {
         		temp=arr[i];
         	}else if (arr[i+1] > arr[i]) { //8>1
        		 temp=arr[i+1];
        	}else if (arr[i+1] == arr[i] ) {
        		temp=arr[i+1];
        	}
        }
        return temp;
    }
}
