package Programs;

public class Print2DArrayInSpiralOrder {
	
	public static void main(String args[]){
		int arr[][]={{1,2,3},
					{4,5,6},
					{7,8,9}};
		printInSpiral(arr);
	}
	
	public static void printInSpiral(int arr[][]){
		int top=0,bottom=arr.length-1,left=0,right=arr.length-1;
		
		int dir=0;
		
		while(top<=bottom && left<=right){
			if(dir==0){
				for(int i=left;i<=right;i++)
					System.out.print(arr[top][i]+",");
				top++;
			}
			if(dir==1){
				for(int i=top;i<=bottom;i++)
					System.out.print(arr[i][right]+",");
				right--;
			}
			if(dir==2){
				for(int i=right;i>=left;i--)
					System.out.print(arr[bottom][i]+",");
				bottom--;
			}
			if(dir==3){
				for(int i=bottom;i>=top;i--)
					System.out.print(arr[i][left]+",");
				left++;
			}
			dir=(dir+1)%4;
		}
	}

}
