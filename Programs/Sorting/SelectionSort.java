package Sorting;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String args[]){
		
		int arr[]={9,2,6,3,8,5,1};
		System.out.println("Selection Sort:");
		int result[]=selectionSort(arr,arr.length);
		
		System.out.println(Arrays.toString(result));
	}
	
	
	public static int[] selectionSort(int arr[],int n){
		
		
		for(int i=0;i<n;i++){
			
			int imin=i;
			
			for(int j=i+1;j<n;j++){
				if(arr[j]<arr[imin])
					imin=j;
			}
			
			int temp=arr[i];
			arr[i]=arr[imin];
			arr[imin]=temp;
		}
		
		
		return arr;
	}
}
