package com.sortalgo;

public class MaxMinJava {

	public static void main(String[] args) {
		int[] array = {8,4,3,12,25,6,13,10};

		int max= array[0]; //8
		for (int i=1; i<array.length; i++) {
			if(array[i] > max) {//12>8
				max= array[i];//
			}
			
		}
		System.out.println(max);
		
		int min= array[0];
		for (int i=1; i<array.length; i++) {
			if(array[i] < min) {//4<8
				min= array[i];//
			}
			
		}
		System.out.println(min);
	}

}
