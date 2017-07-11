package Programs;

public class RotateAnArray {
	
	public static void main(String args[]){
		int arr[]={1,2,3,4,5,6};
		int k=1;
		
		System.out.println("Rotate array to the right by k steps:");
		int result[]=rotate(arr,k);
		
		for(int i:result)
			System.out.print(i+" ");
		
		System.out.println();
		
		System.out.println("Rotate array inplace:");
		int res[]=rotateInplace(arr, k);
		
		for(int i:res)
			System.out.print(i+" ");
		
	}
	
	public static int[] rotate(int arr[],int k){
        if(arr.length <= 1){
            return null;
        }
        //step each time to move
        int step = k % arr.length;
        int[] tmp = new int[step];
        for(int i = 0; i < step; i++){
            tmp[i] = arr[arr.length - step + i];
        }
        for(int i = arr.length - step - 1; i >= 0; i--){
            arr[i + step] = arr[i];
        }
        for(int i = 0; i < step; i++){
            arr[i] = tmp[i];
        }
		return arr;
	}
	
	public static int[] rotateInplace(int arr[],int k){
		if(arr==null || arr.length<2)
			return null;
		k=k%arr.length;
		reverse(arr, 0,arr.length-k-1);
		reverse(arr,arr.length-k,arr.length-1);
		reverse(arr,0,arr.length-1);
		
		return arr;
	}
	
	public static void reverse(int[] arr,int i,int j){
		
		int temp=0;
		while(i<j){
			temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			i++;
			j--;
		}
	}

}
