package com.nsu.cse373.spring2020.ID1621373;
public class HeapSort {
	public static <E extends Comparable<E>> void heapSort(E[] inputArray){
	    System.out.println("Executing HeapSort for the following input:");
	    SortHelper.print(inputArray,inputArray.length);
	    System.out.println("------------------------");
	    sort(inputArray);
	    SortHelper.print(inputArray,inputArray.length);
	    System.out.println("------------------------");
	  }
	private static<E extends Comparable<E>> void 
		sort (E []inputArray) {
		int len=inputArray.length;
		for(int i=len/2 -1; i>= 0; i--)
			heapify(inputArray,len,i);
		for(int i=len-1; i>=0; i--) {
			E temp= inputArray[0];
			inputArray[0]=inputArray[i];
			inputArray[i]=temp;
			heapify(inputArray,i,0);
		}
	}
	public static <E extends Comparable<E>> void
		heapify(E []inputArray, int n, int i) {
		int largest=i;
		int l=2*i+1;
		int r=2*i+2;
		if(l<n && inputArray[l].compareTo(inputArray[largest])>0) {
			largest=l;
		}
		if(r<n && inputArray[r].compareTo(inputArray[largest])>0) {
			largest=r;
		}
		if(largest != i) {
			E swap=inputArray[i];
			inputArray[i]=inputArray[largest];
			inputArray[largest]=swap;
			
			heapify(inputArray,n, largest);
		}
	}
}
