package com.nsu.cse373.spring2020.ID1621373;

public class IterativeSelectionSort {
  public static <E extends Comparable<E>> void iterativeSelectionnSort(E[] inputArray){
    System.out.println("Executing Iterative Selection Sort for the following input:");
    SortHelper.print(inputArray,inputArray.length);
    System.out.println("------------------------");
    /*
      Call your internal sorting method here
      sortInternal(inputArray, inputArray.length);
    */
    sortInternal(inputArray,inputArray.length);
    System.out.println("------------------------");       
    SortHelper.print(inputArray,inputArray.length);
  }
  
  /*
   * You are allowed to change the function signature to whatever you want
   * but it must take generic type input to be able to sort any array
   * containing data that can be compared. Look at BubbleSort class for
   */
  private static <E extends Comparable<E>> void sortInternal(E[] inputArray
      , int size){
	  
	  for(int i=0; i<size-1; i++) {
		  int min_indx=i;
		  for(int j=i+1; j<size; j++) {
			  if( inputArray[min_indx].compareTo(inputArray[j]) > 0 )
				  min_indx=j;
				  
		  }
		  E temp=inputArray[min_indx];
		  inputArray[min_indx]=inputArray[i];
		  inputArray[i]=temp;
		  
	  }
	  
  }
}
