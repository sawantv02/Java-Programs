package Programs;

public class LeadersInArray {
	public static void main(String args[]){
		int arr[]={16, 17, 4, 3, 5, 2};
		
		System.out.println("Find Leaders in an array:An element is leader if it is greater than all the elements to its right side.");
		findLeadersInArray(arr);
	}
	
	public static void findLeadersInArray(int arr[]){
		int max=0;
		for(int i=arr.length-1;i>=0;i--){
			if(arr[i]>max){
				max=arr[i];
				System.out.println(max);
			}
		}
		
	}
}
