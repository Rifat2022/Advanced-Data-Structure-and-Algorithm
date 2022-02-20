package com.nsu.cse373.spring2020.ID1621373;

public class RecursiveInsertionSort {
  public static <E extends Comparable<E>> void recursiveInsertionSort(E[] inputArray){
    System.out.println("Executing Recursive Insertion Sort for the following input:");
    SortHelper.print(inputArray,inputArray.length);
    System.out.println("------------------------");
    sortInternal(inputArray,inputArray.length);
    System.out.println("------------------------");
    SortHelper.print(inputArray,inputArray.length);
    
  }
  
  
  private static <E extends Comparable<E>> void sortInternal(E[] inputArray, int size){
	  if(size <= 1)
		  return;
	  sortInternal(inputArray,size-1);
	  E last=inputArray[size-1];
	  int j=size-2;
	  while(j>=0 && inputArray[j].compareTo(last) > 0 ) {
		  inputArray[j+1]=inputArray[j];
		  j--;
	  }
	  inputArray[j+1]=last;
	  
  }
}






