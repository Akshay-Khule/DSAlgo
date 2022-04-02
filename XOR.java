package com.sortalgo;

public class XOR 
{ 
    static int findSingle(int array[], int array_size) 
    { 
        int res = array[0]; 
        for (int i = 1; i < array_size; i++) 
            res = res ^ array[i]; 
  
        return res; 
    } 
  
    public static void main (String[] args) 
{ 
        int array[] = {6,2,4,3,4,2,3}; 
        int n = array.length; 
        System.out.println("Element is " + 
                            findSingle(array, n) + " "); 
} 
}