package Sorting;

import java.util.Arrays;

public class InsertionSort {
	
	public static void main(String args[]){
		int arr[]={9,2,5,3,6,1,7};
		System.out.println("Insertion sort:");
		int result[]=insertionSort(arr,arr.length);
		System.out.println(Arrays.toString(result));
	}
	
	public static int[] insertionSort(int arr[],int n){
		
		for(int i=1;i<n;i++){
			int value=arr[i];
			int hole=i;
			
			while(hole>0 && arr[hole-1]>value){
				arr[hole]=arr[hole-1];
				hole=hole-1;
			}
			
			arr[hole]=value;
		}
		
		return arr;
	}

}
