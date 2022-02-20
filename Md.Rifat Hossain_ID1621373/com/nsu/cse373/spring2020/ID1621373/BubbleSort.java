package com.nsu.cse373.spring2020.ID1621373;

public class BubbleSort {
  
  
  public static <E extends Comparable<E>> void bubbleSort(E[] inputArray){
    System.out.println("Executing Bubble Sort for the following input:");
    SortHelper.print(inputArray,inputArray.length);
    System.out.println("------------------------");
    sortInternal(inputArray, inputArray.length);
    System.out.println("------------------------");
  }
  
  
  private static <E extends Comparable<E>> void sortInternal(E[] inputArray
      , int size){

    for(int i=size-1; i>=0; i--){
      for(int j=0; j < i; j++){
        
        if(inputArray[j].compareTo(inputArray[j+1]) > 0){
          E temp = inputArray[j+1];
          inputArray[j+1] = inputArray[j];
          inputArray[j] = temp;
          
          
          SortHelper.print(inputArray,size);
        }
      }
    }
  }
}
