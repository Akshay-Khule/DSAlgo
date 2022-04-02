package com.sortalgo;

public class NextSmallestPalindrome {

    static void utilityFunction(int array[], int n)  
    { 
    int mid = n / 2; 
        int i = mid - 1; 
        int j = (n % 2 == 0) ? mid : mid + 1; 
        boolean leftsmaller = false; 
  
        while (i >= 0 && array[i] == array[j])  
        { 
            i--; 
            j++; 
        } 
          
        if (i < 0 || array[i] < array[j])  
        { 
        leftsmaller = true; 
        } 
          
        while (i >= 0)  
        { 
        array[j++] = array[i--];  //code to swap
        } 
    
        if (leftsmaller)  
    { 
            int carry = 1; 
          
            if (n % 2 == 1) { 
                array[mid] += 1; 
                carry = array[mid] / 10; 
                array[mid] %= 10; 
        } 
            i = mid - 1; 
            j = (n % 2 == 0 ? mid : mid + 1); 
              
            while (i >= 0 && carry>0)   
            { 
                array[i] = array[i] + carry; 
            carry = array[i] / 10; 
                array[i] %= 10; 
                array[j] = array[i];
                i--; 
                j++; 
            } 
  
        } 
} 
  
    static void nextPalindromeProblem(int array[], int n)  
    { 
        System.out.println("Next Palindrome is:"); 
          
        if (isAll9(array, n)) { 
            System.out.print("1"); 
        for (int i = 0; i < n - 1; i++) 
            System.out.print("0"); 
            System.out.println("1"); 
  
        } 
      
        else { 
            utilityFunction(array, n); 
            printarray(array); 
        } 
    } 

    static boolean isAll9(int array[], int n) { 
        for (int i = 0; i < n; i++) 
            if (array[i] != 9) 
                return false; 
        return true; 
} 
  
    static void printarray(int array[]) { 
        for (int i = 0; i < array.length; i++) 
        System.out.print(array[i]); 
        System.out.println(); 
    } 
  
    public static void main(String[] args)  
    { 
    int array[] = { 2, 8, 3, 8, 4, 9}; 
        nextPalindromeProblem(array, array.length); 
    } 

}
