package com.sortalgo;

public class JumpProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int num[] = { 1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9 }; 
  	  
    System.out.println("Minimum number of jumps to reach end is : "
                           + Jump(num)); 
	}

	private static int Jump(int[] num) {
		int a= num[0];
		int b= num[0];
		int jump=1;
		
		for(int i=1; i<num.length; i++) {
			a--;
			b--;
			if(num[i]>b) {
			b = num[i];
			}
			
			if(a==0) {
				a=b;
				jump++;
			}
			
		}
		
		
		return jump;
		
		
	}

}
