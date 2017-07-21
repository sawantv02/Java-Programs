package Sorting;

import java.util.Arrays;

public class QuickSort {
	
	public static void main(String args[]){
		
		int arr[]={5,2,6,9,1,4,3,7};
		System.out.println("Input array:"+Arrays.toString(arr));
		System.out.println("Quick Sort:");
		int result[]=quickSort(arr,0,arr.length-1);
		System.out.println(Arrays.toString(result));
	}

	public static int[] quickSort(int arr[],int start,int end){
		
		if(start<end){
			int pindex=partition(arr,start,end);
			quickSort(arr, start,pindex-1);
			quickSort(arr,pindex+1, end);
		}
		
		return arr;
	}
	
	public static int partition(int arr[],int start,int end){
		
		int pivot=arr[end];
		int pindex=start;
		
		for(int i=start;i<end;i++){
			if(arr[i]<=pivot){
				{
					int temp=arr[i];
					arr[i]=arr[pindex];
					arr[pindex]=temp;
					pindex=pindex+1;
				}
			}
		}
		int temp=arr[pindex];
		arr[pindex]=arr[end];
		arr[end]=temp;
		
		return pindex;
	}

}

