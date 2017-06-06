package Programs;

public class StringLengthEqualsAppendedNumber {
	
	public static void main(String args[]){
		String str="VishakhaSawant8";
		
		System.out.println("Check if string length equals the number appended at the end of string:");
		System.out.println(checkIfLengthEqualsAppendedNumber(str));
	}
	
	public static boolean checkIfLengthEqualsAppendedNumber(String str){
		
		int n=str.length();
		int length=0;
		int x=1;
		
		int i=n-1;
		for(i=n-1;i>=0;i--){
			if(str.charAt(i)>'0' && str.charAt(i)<'9'){
				int j=str.charAt(i)-'0';
				length=length+(j*x);
				x=x*10;
			}
			else{
				break;
			}
		}
		
		return length==(i+1);
	}

}
