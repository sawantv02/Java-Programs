package Programs;

public class MultipleOfXClosesttoN {

	public static void main(String args[]){
		int n=2855;
		int x=13;
		
		System.out.println("Multiple of X closest to n:"+multipleOfXClosestToN(n, x));
	}
	
	public static int multipleOfXClosestToN(int n,int x){
		
//	    n = n + x/2;
//	    n = n - (n%x);
//	    result = n
		
		int num=n;
		num=num+(x/2);
		num=num-(num%x);
		int result=num;
		
		return result;
	}
}
