package Searching;

public class RotationCountOfSortedArray {

	public static void main(String args[]){
		
		int arr[]={9,10,2,5,6,7,8};
		System.out.println("Number of times sorted array rotated using binary search:");
		System.out.println(findRotationCount(arr));
	}
	
	
	public static int findRotationCount(int arr[]){
		 int low=0,high=arr.length-1;
		 int n=arr.length;
		 
		 while(low<=high){
			 
			 if(arr[low]<=arr[high]) return low;
			 int mid=(low+high)/2;
			 int next=(mid+1)%n,prev=(mid+n-1)%n;
			 if(arr[mid]<=arr[next] && arr[mid]<=arr[prev])
				 return mid;
			 else if(arr[mid]<=arr[high]) high=mid-1;
			 else if(arr[mid]>=arr[low]) low=mid+1;
					 
		 }
		 return -1;
	}
}
