package com.shawonarefin.sorting;

public class RecursiveInsertionSort {
  public static <E extends Comparable<E>> void recursiveInsertionSort(E[] inputArray){
    System.out.println("Executing Recursive Insertion Sort for the following input:");
    SortHelper.print(inputArray,inputArray.length);
    System.out.println("------------------------");
    /*
      Call your internal sorting method here
      sortInternal(inputArray, inputArray.length);
    */
    System.out.println("------------------------");
  }
  
  /*
   * You are allowed to change the function signature to whatever you want
   * but it must take generic type input to be able to sort any array
   * containing data that can be compared. Look at BubbleSort class for
   */
  private static <E extends Comparable<E>> void sortInternal(E[] inputArray
      , int size){
    //
  }
}
