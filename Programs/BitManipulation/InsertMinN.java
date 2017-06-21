package BitManipulation;

public class InsertMinN {
	
	public static void main(String args[]){
		int M=19;
		System.out.print("M:");binaryConvertor(M);
		System.out.println();
		int N=1027;
		System.out.print("N:");binaryConvertor(N);
		System.out.println();
		
		int i=2;
		int j=6;
		
		System.out.print("Answer:");binaryConvertor(updateBits(N, i, j, M));
		
	}
	
	public static int updateBits(int N,int i,int j,int M){
		int allones=~0;
		int left=allones<<(j+1);
		int right=((1<<i)-1);
		int mask=left|right;
		int cleannum=N & mask;
		int shiftm=M << i;
		int ans=cleannum | shiftm;
		
		return ans;
	}
	
	public static void binaryConvertor(int num){
		
		StringBuffer sb=new StringBuffer();
		
		while(num>0){
			sb.append(num%2);
			num=num/2;
		}
		
		System.out.println(sb.reverse());
	}

}
