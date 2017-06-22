package Programs;

public class LargestSubsetWithGCD1 {
	
	public static void main(String args[]){
		int arr[]={2,18,6,3};
		
		System.out.println("Larget subset with gcd 1:"+largestSubsetWithGCD1(arr));
	}
	
	public static int gcd(int a,int b){
		if(a==0)
			return b;
		return gcd(b%a,a);
	}
	
	public static int largestSubsetWithGCD1(int arr[]){
		int n=arr.length;
		int max=arr[0];
		for(int i=1;i<n;i++){
			
		max=gcd(max,arr[i]);
			
		if(max==1)
			return n;
		}
		
		return 0;
	}
	

}
