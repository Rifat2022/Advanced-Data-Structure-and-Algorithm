package com.nsu.cse373.spring2020.ID1621373;

public class MergeSort {
	
	private static <E extends Comparable <E>> void
	merge(E arr[], int left, int middle, int right){
		int sizeOne= middle-left+1;
		int sizeTwo= right- middle;
		E[] tempOne= (E []) new Comparable[sizeOne];
		E[] tempTwo= (E[]) new Comparable[sizeTwo];
		
		for(int i=0; i< sizeOne; ++i) {
			tempOne[i]=arr[left+i];
		}
		for(int j=0; j<sizeTwo; ++j) {
			tempTwo[j]= arr[middle+1+j];
		}
		int i=0;
		int j=0;
		int k=left;
		while(i < sizeOne && j < sizeTwo) {
			if((tempOne[i].compareTo(tempTwo[j])< 0) || 
					(tempOne[i].compareTo(tempTwo[j])==0)) {
				arr[k]=tempOne[i];
				i++;
			}
			
			else {
				arr[k]= tempTwo[j];
				j++;
			}
			k++;
		}
		while(i <sizeOne) {
			arr[k]=tempOne[i];
			i++;
			k++;
		}
		while(j < sizeTwo) {
			arr[k]= tempTwo[j];
			j++;
			k++;
		}
		
	}
	private static <E extends Comparable <E>> void 
	  sort(E arr[], int left, int right) {
		  if(left < right) {
			  int middle= (left + right)/2 ;
			  
			  sort(arr, left , middle);
			  sort(arr, middle+1, right);
			  
			  
			  merge(arr, left, middle, right);
		  }
	  }
	
  public static <E extends Comparable<E>> void mergeSort(E[] inputArray){
    System.out.println("Executing MergeSort for the following input:");
    SortHelper.print(inputArray,inputArray.length);
    System.out.println("------------------------");
    sort(inputArray, 0, inputArray.length-1);
    SortHelper.print(inputArray,inputArray.length);
    System.out.println("------------------------");
  }
  
  
}



