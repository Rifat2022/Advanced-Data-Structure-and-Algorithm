package com.nsu.cse373.spring2020.ID1621373;

public class RecursiveSelectionSort {
	
  public static <E extends Comparable<E>> void recursiveSelectionSort(E[] inputArray){
    System.out.println("Executing Recursive Selection Sort for the following input:");
    SortHelper.print(inputArray,inputArray.length);
    System.out.println("------------------------");
    
    sortInternal(inputArray,inputArray.length,0);
    System.out.println("------------------------");
    SortHelper.print(inputArray,inputArray.length);
  }
  
  public static <E extends Comparable<E>> int minIndex(E inputArray[], int i, int j) 
  { 
      if (i == j) 
          return i; 
     
      // Find minimum of remaining elements 
      int k = minIndex(inputArray, i + 1, j); 
     
      // Returning minimum of current and remaining. 
      
      if(inputArray[i].compareTo(inputArray[k]) < 0)
    	  return i;
      else
    	  return k;
    	  
  } 
  
  
  public static <E extends Comparable<E>> void sortInternal(E[] inputArray, int size, int index){
	  
	   if(index==size)
		   return;
	   int k= minIndex(inputArray,index,size-1 );
	   if (k != index){ 
           // swap 
           E temp = inputArray[k]; 
           inputArray[k] = inputArray[index]; 
           inputArray[index] = temp; 
        }
	   
        // Recursively calling selection sort function 
       sortInternal(inputArray, size, index+1);
	       
	    
	
  }
}
