package Programs;

public class TwosComplimentOfBinaryString {

	public static void main(String args[]) {
		String b1 = "00000101";
		System.out.println("Binary string:"+b1);
		System.out.println("Two's compliment of binary string using one's compliment:" + twosComplimentUsingOnesCompliment(b1));
		System.out.println("Two's compliment:"+twosComplimentDirect(b1));
	}

	public static String twosComplimentUsingOnesCompliment(String b1) {

		StringBuffer onesCompliment = new StringBuffer();

		for (char ch : b1.toCharArray()) {
			if (ch == '1')
				onesCompliment.append('0');
			else
				onesCompliment.append('1');
		}
		String twosCompliment = onesCompliment.toString();
		int n=twosCompliment.length();
		int i;
		for (i=n-1;i>=0;i--) {
			if(onesCompliment.toString().toCharArray()[i]=='1'){
				char[] chars=twosCompliment.toCharArray();
				chars[i]='0';
				twosCompliment=String.valueOf(chars);
			}
			else{
				char[] chars=twosCompliment.toCharArray();
				chars[i]='1';
				twosCompliment=String.valueOf(chars);
				break;
			}
		}
		
		if(i==-1)
			twosCompliment="1"+twosCompliment;

		return twosCompliment;

	}
	
	
	public static String twosComplimentDirect(String b1){
		
		int n=b1.length();
		int i;
		char []b2=b1.toCharArray();
		for(i=n-1;i>=0;i--){

			if(b1.toCharArray()[i]=='1'){
				for(int j=i-1;j>=0;j--){
					
					b2[j]=flip(b1.toCharArray()[j]);
				}
			}
		}
		
		b1=String.valueOf(b2);
		if(i==-1 && b1.contains("1")==false){
			b1="1"+b1;
		}
		
		return b1;
	}
	
	public static char flip(char ch){
		
		char c=(ch=='0')?'1':'0';
		return c;
	}
}
