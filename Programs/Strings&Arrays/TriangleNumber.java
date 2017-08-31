package Programs;

public class TriangleNumber {
	
	public static void main(String args[]){
		
		int n=11;
		System.out.println(isTriangleNumber(n));
		System.out.println(isTriangleNumberWithFormula(n));
	}
	
	public static boolean isTriangleNumberWithFormula(int n){
		if(n<=0)
			return false;
		int f=8*n + 1;
		
		return Math.sqrt(f)==(int)Math.sqrt(f);
			
		
	}
	public static boolean isTriangleNumber(int n){
		if(n<=0)
			return false;
		int t=1;
		int sum=0;
		while(sum<n){
			sum+=t;
			t++;
		}
		if(sum==n)
			return true;
		else
			return false;
		
		
	}

}
