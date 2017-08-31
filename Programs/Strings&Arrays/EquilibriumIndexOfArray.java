package Programs;

public class EquilibriumIndexOfArray {
	
	public static void main(String arggs[]){

		int arr[]={-7,1,5,2,-4,3,0};
		System.out.println(getEquilibriumIndexOfArray(arr));
	}

	public static int getEquilibriumIndexOfArray(int arr[]){
		
		int leftsum=0;
		int sum=0;
		
		for(int i=0;i<arr.length;i++){
			sum+=arr[i];
		}
		
		for(int i=0;i<arr.length;i++){
			sum=sum-arr[i];
			
			if(leftsum==sum)
				return i;
			
			leftsum+=arr[i];
		}
		
		return -1;
	}
}


