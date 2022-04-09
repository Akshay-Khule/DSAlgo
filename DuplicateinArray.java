package com.ds.algo.akshay;

public class DuplicateinArray {

	public static void main(String[] args) {

        int []arr = {1, 2, 3,  4, 5, 6, 7,8, 3,};
        int n = arr.length;
        System.out.print(findduplicate(arr, n));

	}

	private static int findduplicate(int[] arr, int n) {
        int slow = arr[0];
        int fast = arr[arr[0]];
        
        while (fast != slow)
        {
      
            // move one step for slow
            slow = arr[slow];
      
            // move two step for fast
            fast = arr[arr[fast]];
        }
        fast = 0;
        while (slow != fast)
        {
            slow = arr[slow];
            fast = arr[fast];
        }
        return slow;

	}



}
