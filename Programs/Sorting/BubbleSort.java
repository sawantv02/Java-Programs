package Sorting;

import java.util.Arrays;

public class BubbleSort {
	
	public static void main(String args[]){
		int arr[]={1,2,3,8,5,6};
		System.out.println("Bubble sort:");
		int result[]=bubbleSort(arr);
		System.out.println(Arrays.toString(result));
	}

	public static int[] bubbleSort(int arr[]){
		
		for(int i=0;i<arr.length-1;i++){
			boolean flag=false;
			for(int j=0;j<arr.length-i-1;j++){
				if(arr[j]>arr[j+1]){
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					flag=true;
				}
			}
			if(flag==false)
				break;
		}
		
		return arr;
	}
}
