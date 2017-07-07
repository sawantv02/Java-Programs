package Programs;

public class FindMissingNumber {

	public static void main(String args[]){
		int arr[]={1,2,4,6,3,7,8};
		System.out.println("Find Missing Number from the list of 1 to n");
		findTheMissingNumber(arr);
	}
	
	public static void findTheMissingNumber(int arr[]){
		int n=arr.length;
		int sum=(n+1)*(n+2)/2;
		
		for(int i=0;i<n;i++){
			sum-=arr[i];
		}
		
		System.out.println(sum);
		
	}
}
