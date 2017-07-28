package Programs;

public class MaximumSumSubarray {
	
	public static void main(String args[]){
		
		int arr[]={5,-1,3,2,9,-6};
		System.out.println("Find maximum sum in subarray:");
		System.out.println(findMaximumSumInSubarray(arr));
	}
	
	public static int findMaximumSumInSubarray(int arr[]){
		int ans=0;
		int sum=0;
		
		for(int i=0;i<arr.length;i++){
			if(sum+arr[i]>0){
				sum+=arr[i];
			}else
				sum=0;
			ans=Math.max(ans,sum);
		}
		
		return ans;
	}

}
