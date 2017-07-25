package Searching;

public class FindingFirstOccurrenceOfANumber {
	
	public static void main(String args[]){
		
		int arr[]={4,5,2,6,6,6,1,9,8};
		System.out.println("Find first occurrence of a number using binary search:");
		System.out.println(findFirstOccurrenceOfNumber(arr,6));
		
	}
	
	public static int findFirstOccurrenceOfNumber(int arr[],int n){
		int result=-1;
		int low=0;
		int high=arr.length-1;
		int mid=0;
		
		while(low<=high){
			mid=(low+high)/2;
			if(n==arr[mid]){
				result=mid;
				high=mid-1;
			}
			else if(n>arr[mid])
				low=mid+1;
			else
				high=mid-1;			
		}
		
		return result;
	}

}
