package com.sortalgo;

public class BinaryIncreasingAndDecreasing 
{    
    static int findMaximum(int array[], int start, int end) 
{ 
      
       if (start == end) 
         return array[start]; 

       if ((end == start + 1))
   { 
     if(array[start] >= array[end]) 
            return array[start]; 
       else 
          return array[end]; 
       }  
       int mid = (start + end)/2;    

   if ( array[mid] > array[mid + 1] && array[mid] > array[mid - 1]) 
          return array[mid]; 
       
       if (array[mid] > array[mid + 1] && array[mid] < array[mid - 1]) // left is more and right is less
     return findMaximum(array, start, mid-1); 
       else 
         return findMaximum(array, mid + 1, end); 
    } 
      
   
    public static void main (String[] args)  
    { 
        int array[] = {6, 9,15, 25, 35, 50, 41, 29, 23, 8}; 
        int n = array.length; 
        System.out.println("The maximum Value "+  findMaximum(array, 0, n-1)); 
    } 
}
