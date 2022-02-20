package com.nsu.cse373.spring2020.ID1621373;
public class QuickSort {
	public static <E extends Comparable<E>> void quickSort(E[] inputArray){
	    System.out.println("Executing quick for the following input:");
	    SortHelper.print(inputArray,inputArray.length);
	    System.out.println("------------------------");
	    sort(inputArray,0, inputArray.length-1);
	    SortHelper.print(inputArray,inputArray.length);
	    System.out.println("------------------------");
	  }
	private static <E extends Comparable<E> > int 
	partition(E arr[],int low, int high) {
			E pivot= arr[high];
			int i= (low-1);
			for(int j=low; j<high; j++) {
				if(arr[j].compareTo(pivot)<0) {
					++i;
					E temp= arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
			E temp=arr[i+1];
			arr[i+1]=arr[high];
			arr[high]=temp;
			return (i+1);
	}
	
	private static <E extends Comparable<E> > void sort(
			E arr[], int low , int high) {
		if(low < high) {
			int pi= partition (arr, low, high);
			sort(arr, low, pi-1);
			sort(arr, pi+1, high);
			
		}
	}
}
