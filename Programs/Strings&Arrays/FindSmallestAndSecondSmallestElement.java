package Programs;

public class FindSmallestAndSecondSmallestElement {
	
	public static void main(String args[]){
		int []arr={5,2,6,9,8,7,3};
		
		System.out.println("Smallest and second smallest elements in the array:");
		int result[]=findSmallestAndSecondSmallest(arr);
		System.out.println(result[0]+","+result[1]);
		
	}

	public static int[] findSmallestAndSecondSmallest(int[] arr){
		int first=Integer.MAX_VALUE;
		int second=first;
		
		for(int i=0;i<arr.length;i++){
			if(arr[i]<first){
				second=first;
				first=arr[i];
			}
			else if(arr[i]<second && arr[i]!=first){
				second=arr[i];
			}
		}
		
		int elem[]=new int[2];
		elem[0]=first;
		elem[1]=second;
		
		return elem;
	}
}
