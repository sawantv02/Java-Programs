package BackTracking;

public class ExpressionSolving {
	static char symbol[];
	public static void main(String args[]){
		int arr[]={1,2,3,4,5,5};
		symbol=new char[arr.length-1];
		backTrack(arr,1,arr.length-1,arr[0]);
	
		
	}
	
	
	private static void backTrack(int arr[],int k,int n,int result){
		int temp=result;
		if(k==n){
			if(result==arr[n]){
				print(k,arr);
			}else
				return;
		}else{
			result=result+arr[k];
			symbol[k]='+';
			backTrack(arr, k+1, n, result);
			temp=temp-arr[k];
			symbol[k]='-';
			backTrack(arr, k+1, n,temp);
		}
		
	}
	
	private static void print(int k,int arr[]){
		for(int i=1;i<=k-1;i++)
			System.out.print(arr[i-1]+""+symbol[i]);
		System.out.println(arr[k-1]);
	}
}
